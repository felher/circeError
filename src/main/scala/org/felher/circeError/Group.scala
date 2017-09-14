package org.felher.circeError

final case class Group(
  name: String,
  allowedCaseIDs: Array[Long],
  users: Array[String],
)

object Group {
  import io.circe._, generic.semiauto._

  implicit val enc = deriveEncoder[Group]
  implicit val dec = deriveDecoder[Group]
}
