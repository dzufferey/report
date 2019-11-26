package dzufferey.report

class Sequence(title: String) extends Item(title) {
  
  protected val _children = scala.collection.mutable.Buffer[Item]()

  override def children = _children.toSeq

  def add(element: Item): Unit = {
    _children += element
  }

  def toText(writer: java.io.BufferedWriter): Unit = {
    for (c <- children) {
      c.toText(writer)
    }
  }

  def toHtmlInner(writer: java.io.BufferedWriter): Unit = {
    for (c <- children) {
      c.toHtml(writer)
    }
  }

}
