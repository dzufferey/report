package dzufferey.report

class Code(title: String, content: String) extends Item(title) {

  def toText(writer: java.io.BufferedWriter) = {
    writer.write(content)
    writer.newLine
  }

  def toHtmlInner(writer: java.io.BufferedWriter) = {
    writer.write("<pre><code>")
    val escaped = org.apache.commons.lang3.StringEscapeUtils.escapeHtml4(content)
    writer.write(escaped)
    writer.write("</code></pre>")
    writer.newLine
  }

}
