package org.felher.circeError

final case class Export(
  infos: Array[Info],
)

object Export {
  import io.circe._, generic.semiauto._

  // Those seem to be needed somehow. Not sure why.
  //implicit val eB = Info.enc
  //implicit val aB = Info.dec

  implicit val enc = deriveEncoder[Export]
  implicit val dec = deriveDecoder[Export]
}
