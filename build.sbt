name := "report"

organization := "io.github.dzufferey"

version := "0.1-SNAPSHOT"

scalaVersion := "2.12.2"

crossScalaVersions := Seq("2.11.11", "2.12.2")

libraryDependencies += "org.apache.commons" % "commons-lang3" % "3.5"

addCompilerPlugin("org.psywerx.hairyfotr" %% "linter" % "0.1.17")

publishMavenStyle := true

publishTo := Some(Resolver.file("file",  new File(Path.userHome.absolutePath+"/.m2/repository")))

pomExtra :=
  <licenses>
    <license>
      <name>Apache 2</name>
      <url>https://www.apache.org/licenses/LICENSE-2.0.txt</url>
      <distribution>repo</distribution>
    </license>
  </licenses>

