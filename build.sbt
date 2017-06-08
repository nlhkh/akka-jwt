name := "akka-jwt"
organization := "com.github.witi83"
version := "1.4.0"

scalacOptions := Seq(
  "-deprecation",
  "-encoding",
  "utf8",
  "-feature",
  "-target:jvm-1.8",
  "-unchecked",
  "-Yno-adapted-args",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard",
  "-Xfatal-warnings",
  "-Xfuture"
)

libraryDependencies ++= {
  Seq(
    "com.typesafe.akka" %% "akka-http" % "10.0.7",
    "com.nimbusds" % "nimbus-jose-jwt" % "4.39"
  )
}

publishArtifact in Test := false

licenses := Seq("MIT" -> url("https://opensource.org/licenses/MIT"))

homepage := Some(url("https://github.com/witi83/akka-jwt"))

scmInfo := Some(ScmInfo(url("https://github.com/witi83/akka-jwt"), "git@github.com:witi83/akka-jwt.git"))

developers += Developer("witi83", "Witold Czaplewski", "witi83@web.de", url("https://github.com/witi83"))

pomIncludeRepository := (_ => false)

bintrayPackage := "akka-jwt"
