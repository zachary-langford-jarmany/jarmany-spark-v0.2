ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.14"

lazy val root = (project in file("."))
  .settings(
    name := "jarmany-spark-v0.2"
  )

libraryDependencies ++= Seq(
  "org.apache.spark" % "spark-sql_2.11" % "2.4.8" % "provided")