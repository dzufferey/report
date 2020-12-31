name := "report"

organization := "com.github.dzufferey"

version := "1.0.0"

scalaVersion := "2.13.4"

crossScalaVersions := Seq("2.12.12", "2.13.4")

libraryDependencies += "org.apache.commons" % "commons-text" % "1.9"

scalacOptions := Seq("-unchecked", "-deprecation")
