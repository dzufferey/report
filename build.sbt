name := "report"

organization := "io.github.dzufferey"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.8"

libraryDependencies += "org.apache.commons" % "commons-lang3" % "3.4"

addCompilerPlugin("org.psywerx.hairyfotr" %% "linter" % "0.1.13")

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

