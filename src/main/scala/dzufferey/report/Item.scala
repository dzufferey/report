package dzufferey.report

abstract class Item(val title: String) {

  protected val created = new java.util.Date()

  protected var toc: TocEntry = null
  def setToc(entry: TocEntry): Unit = {
    toc = entry
  }
  protected def getHtmlTitle = {
    if (toc != null) {
      toc.getTitleWithRef
    } else {
      sys.error("Report: TOC not specified")
    }
  }
  protected def printHtmlTitle(writer: java.io.BufferedWriter): Unit = {
    writer.write(getHtmlTitle); writer.newLine
  }

  def children: Seq[Item] = Nil

  def toText(writer: java.io.BufferedWriter): Unit

  def toHtmlInner(writer: java.io.BufferedWriter): Unit

  def toHtml(writer: java.io.BufferedWriter): Unit = {
    printHtmlTitle(writer)
    toHtmlInner(writer)
  }

}

