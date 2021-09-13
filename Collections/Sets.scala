import scala.collection.mutable.Set

object Sets extends App {
  // sets cannot have duplicate elements
  val set = collection.mutable.Set[Int]()
  // adding to a set
  set += 1
  set += 2 += 3
  set ++= Vector(4, 5)
  println(set)
  // removing from a set
  set -= 1
  println(set)
  set -= (2, 3)
  println(set)
  // or use the method remove
  set.remove(4)
  println(set)
  // clear
  set.clear()
}
