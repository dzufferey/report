# report

A scala library to produce an output that can be either printed as an html page or as raw text (console)

## Using it

To use it in your projects your need to add the following two lines in your `build.sbt`:
```scala
resolvers += "jitpack" at "https://jitpack.io"

libraryDependencies += "com.github.dzufferey" %% "report" % "1.0.0"
```

The last line is requried if you want to use it in some other project.
If you want to use it locally do not add the `resolvers` line but instead run `sbt publishLocal`.

## Compiling

This project requires java 6 and can be build it using [sbt](http://www.scala-sbt.org/).
To install sbt follow the instructions at [http://www.scala-sbt.org/release/tutorial/Setup.html](http://www.scala-sbt.org/release/tutorial/Setup.html).

Then, in a console, execute:
```
$ sbt
> compile
```

## ToDo
* Raw text output is incomplete (TOC)
