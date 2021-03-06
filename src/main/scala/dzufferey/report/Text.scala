package dzufferey.report

class Text(title: String, content: String) extends Item(title) {

  def toText(writer: java.io.BufferedWriter) = {
    writer.write(content)
    writer.newLine
  }

  def toHtmlInner(writer: java.io.BufferedWriter) = {
    writer.write("<p>")
    val escaped = org.apache.commons.text.StringEscapeUtils.escapeHtml4(content)
    writer.write(escaped)
    writer.write("</p>")
    writer.newLine
  }

}
