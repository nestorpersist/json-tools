name := "json-tools"

organization := "com.persist"

version := "0.0.2"

scalaVersion := "2.11.7"

scalacOptions ++= Seq("-deprecation", "-unchecked")

libraryDependencies ++= Seq(
  "com.persist" % "persist-json_2.11" % "1.1.4"
)
