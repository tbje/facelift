package com.github.tbje.facelift.html

import scala.xml._
import scala.collection.mutable.ListBuffer

class XmlInterpolate(s: StringContext) {
  object xml {
    def apply(exprs: Any*) = {
      def xmlInterpolator(process: String => String, args: Seq[Any]): NodeSeq = {
        s.checkLengths(args)
        val pi = s.parts.iterator.map(Text(_))
        val buffer = new scala.collection.mutable.ListBuffer[Node]()
        buffer.append(pi.next)
        val ai = args.iterator map {
          case e: Node => e
          case t => Text(t.toString)
          }
        while(pi.hasNext) {
          buffer.append(ai.next)
          buffer.append(pi.next)
        }
        buffer.toSeq
      }
      xmlInterpolator(StringContext.treatEscapes, exprs)
    }
  }
}

object XmlInterpolate {
  def strContextToXmlInterpolate(s: StringContext) = new XmlInterpolate(s)
}
