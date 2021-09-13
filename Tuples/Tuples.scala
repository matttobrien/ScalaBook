object Tuples extends App {
  // tuples can be used to store 2-3 elements of different types
  val t = (1, "harmony", 1.00)
  println(t)
  val t2 = (2, "two")
  println(t2)
  val(x, y, z) = (3, "Three", 3.00)
  println(x, y, z)

  // tuples can be returned from a method
  def getTuple = {
    (4, "Four", 4.00)
  }
  val t3 = getTuple
  println(t3)
}