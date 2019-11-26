package dzufferey.report

class GenericItem(title: String, txt: => String, html: => String) extends Item(title) {

  def toText(writer: java.io.BufferedWriter): Unit = {
    writer.write(txt); writer.newLine
  }

  def toHtmlInner(writer: java.io.BufferedWriter): Unit = {
    writer.write(html); writer.newLine
  }

}
