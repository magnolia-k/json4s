import sbt._
import Keys._

object Dependencies {
  lazy val jaxbApi = "javax.xml.bind" % "jaxb-api" % "2.3.1" % "test"

  lazy val jodaTime = Seq(
    "joda-time" % "joda-time" % "2.10.10",
    "org.joda" % "joda-convert" % "2.2.1"
  )
  lazy val jackson = Seq(
    "com.fasterxml.jackson.core" % "jackson-databind" % "2.12.2"
  )
  lazy val scalaz_core = "org.scalaz" %% "scalaz-core" % "7.3.3"
  lazy val paranamer = "com.thoughtworks.paranamer" % "paranamer" % "2.8"
  lazy val scalatest = "org.scalatest" %% "scalatest" % "3.2.6" % "test"
  lazy val scalatestScalacheck = Def.setting(
    CrossVersion.partialVersion(scalaVersion.value) match {
      case Some((2, 11)) =>
        "org.scalatestplus" %% "scalacheck-1-15" % "3.2.4.0-M1" % "test"
      case _ =>
        "org.scalatestplus" %% "scalacheck-1-15" % "3.2.6.0" % "test"
    }
  )
  lazy val mockito = "org.mockito" % "mockito-core" % "3.8.0" % "test"

  lazy val scalaXml = Def.setting {
    "org.scala-lang.modules" %% "scala-xml" % "1.3.0"
  }
}
