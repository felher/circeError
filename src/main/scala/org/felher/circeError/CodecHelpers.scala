package org.felher.circeError

import java.util.Optional
import io.circe._

object CodecHelpers {
  implicit def optionalEnc[T : Encoder]: Encoder[Optional[T]] =
    Encoder[Option[T]].contramap(toOption)

  implicit def optionalDec[T : Decoder]: Decoder[Optional[T]] =
    Decoder[Option[T]].map(fromOption)

  def toOption[T](o: Optional[T]): Option[T] =
    if (o.isPresent()) Some(o.get)
    else None

  def fromOption[T](o: Option[T]): Optional[T] = o match {
    case None    => Optional.empty[T]
    case Some(t) => Optional.of(t)
  }

}
