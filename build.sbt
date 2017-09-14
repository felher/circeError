scalaVersion := "2.12.3"

name := "circeError"

organization := "org.felher"

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-feature",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-unchecked",
  "-Xfatal-warnings",
  "-Xlint",
  "-Yno-adapted-args",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard",
  "-Ypartial-unification",
  "-Xfuture",
  "-Ywarn-unused-import",
  "-Ypatmat-exhaust-depth", "40"
)

libraryDependencies ++= Seq(
  "io.circe"           %% "circe-core"    % "0.9.0-M1",
  "io.circe"           %% "circe-generic" % "0.9.0-M1",
  "io.circe"           %% "circe-parser"  % "0.9.0-M1"
)

