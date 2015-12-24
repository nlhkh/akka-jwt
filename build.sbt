name := "akka-jwt"
organization := "com.github.witi83"
version := "0.0.3"
scalaVersion := "2.11.7"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8", "-feature", "-target:jvm-1.8")
scalacOptions ++= Seq("-Yclosure-elim", "-Yinline", "-Yinline-warnings", "-Xfatal-warnings")

libraryDependencies ++= {
  val akkaStreamV = "2.0.1"

  Seq(
    "com.typesafe.akka" %% "akka-http-core-experimental" % akkaStreamV,
    "com.typesafe.akka" %% "akka-http-experimental" % akkaStreamV,
    "com.nimbusds" % "nimbus-jose-jwt" % "4.11"
  )
}

publishMavenStyle := true

publishArtifact in Test := false

licenses := Seq("MIT" -> url("http://opensource.org/licenses/MIT"))

homepage := Some(url("https://github.com/witi83/akka-jwt"))

pomExtra := (
  <scm>
    <url>https://github.com/witi83/akka-jwt.git</url>
    <connection>scm:git:https://github.com/witi83/akka-jwt.git</connection>
  </scm>
    <developers>
      <developer>
        <id>kikuomax</id>
        <name>Kikuo Emoto</name>
        <url>https://github.com/kikuomax</url>
      </developer>
      <developer>
        <id>witi83</id>
        <name>Witold Czaplewski</name>
        <url>https://github.com/witi83</url>
      </developer>
    </developers>
  )

credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")
