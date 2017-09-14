package org.felher.circeError

final case class User(
  username: String,
  hashedPassword: String,
  salt: String
)

object User {
  import io.circe._, generic.semiauto._

  implicit val enc = deriveEncoder[User]
  implicit val dec = deriveDecoder[User]
}
