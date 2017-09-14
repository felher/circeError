package org.felher.circeError

final case class Export(
  catalogEntries: Array[CatalogEntry],
  infos: Array[Info],
  users: Array[User],
  groups: Array[Group],
)

object Export {
  import io.circe._, generic.semiauto._

  // Those seem to be needed somehow. Not sure why.
  //implicit val eA = CatalogEntry.enc
  //implicit val aA = CatalogEntry.dec
  //implicit val eB = Info.enc
  //implicit val aB = Info.dec
  //implicit val eC = User.enc
  //implicit val aC = User.dec
  //implicit val eD = Group.enc
  //implicit val aD = Group.dec

  implicit val enc = deriveEncoder[Export]
  implicit val dec = deriveDecoder[Export]
}
