package dzufferey.report

import java.io.{BufferedWriter, PrintWriter, OutputStreamWriter, FileOutputStream}

class Report(title: String, style: String = Style.CSS) extends Sequence(title) {

  def htmlHeader(writer: BufferedWriter): Unit = {
    writer.write("<!DOCTYPE HTML>"); writer.newLine
    writer.write("<html>"); writer.newLine
    writer.write("<head>"); writer.newLine
    writer.write("    <meta charset=\"utf-8\">"); writer.newLine
    val escapedTitle = org.apache.commons.text.StringEscapeUtils.escapeHtml4(title)
    writer.write("    <title>"+escapedTitle+"</title>"); writer.newLine
    writer.write(style); writer.newLine
    writer.write("</head>"); writer.newLine
    writer.write("<body>"); writer.newLine
  }

  def htmlFooter(writer: BufferedWriter): Unit = {
    writer.write("</body>"); writer.newLine
    writer.write("</html>"); writer.newLine
  }

  
  def makeConsoleReport: Unit = {
    val writer = new BufferedWriter(new PrintWriter(Console.out))
    toText(writer)
    writer.flush
  }

  override def toHtml(writer: BufferedWriter): Unit = {
    printHtmlTitle(writer)
    toc.toHtml(writer)
    toHtmlInner(writer)
  }

  override def toHtmlInner(writer: BufferedWriter): Unit = {
    for (c <- children) {
      c.toHtml(writer)
    }
  }
  
  def makeHtmlReport(fileName: String): Unit = {
    val fileOut = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)))
    val toc = new TOC(this)
    htmlHeader(fileOut)
    toHtml(fileOut)
    htmlFooter(fileOut)
    fileOut.close
  }

}
