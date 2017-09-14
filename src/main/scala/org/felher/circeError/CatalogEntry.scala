package org.felher.circeError

import java.util.Optional

final case class CatalogEntry(
  name: String,
  extID: String,
  project: String,
  dataType: String,
  parentExtId: Optional[String],
  parentProject: Optional[String],
)

object CatalogEntry {
  import CodecHelpers._
  import io.circe._, generic.semiauto._

  implicit val enc = deriveEncoder[CatalogEntry]
  implicit val dec = deriveDecoder[CatalogEntry]
}
