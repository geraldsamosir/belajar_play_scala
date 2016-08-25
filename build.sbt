name := """app"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  javaJpa,
  "mysql" % "mysql-connector-java" % "5.1.36",
  "org.hibernate" % "hibernate-entitymanager" % "5.1.0.Final",
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test
)

PlayKeys.externalizeResources := false
