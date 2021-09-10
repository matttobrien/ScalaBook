import scala.collection.mutable.ArrayBuffer

object ArrayBuffers extends App {
  val a = ArrayBuffer(1, 2, 3)         
  a.append(4)                          
  a.append(5, 6)                       
  a.appendAll(List(7,8))
  println(a)                               

  val b = ArrayBuffer(9, 10)           
  b.insert(0, 8)                       
  b.insertAll(0, Vector(4, 5, 6, 7))  
  b.prepend(3)                         
  b.prepend(1, 2)                      
  b.prependAll(Array(0))
  println(b)      

  val c = ArrayBuffer.range('a', 'h')  
  c.remove(0)                          
  c.remove(2, 3)
  println(c)       

  val d = ArrayBuffer.range('a', 'h')  
  d.trimStart(2)                       
  d.trimEnd(2)
  println(d)                  
}