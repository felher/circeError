package org.felher.circeError

import java.util.Optional

final case class Info(
  extID: String,
  project: Optional[String],
  caseId: Long,
  measureTime: Long,
  value: String
)

object Info {
  import CodecHelpers._
  import io.circe._, generic.semiauto._

  implicit val enc = deriveEncoder[Info]
  implicit val dec = deriveDecoder[Info]
}
