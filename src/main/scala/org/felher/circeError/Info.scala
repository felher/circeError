package org.felher.circeError

final case class Info(
  value: String
)

object Info {
  import io.circe._, generic.semiauto._

  implicit val enc = deriveEncoder[Info]
  implicit val dec = deriveDecoder[Info]
}
