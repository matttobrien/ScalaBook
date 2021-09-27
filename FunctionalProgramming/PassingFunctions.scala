object PassingFunctions extends App {
  // you can pass functions around as variables
  def toUpper(s: String): String = s.toUpperCase
  val list = List("foo", "bar")
  println(s"Before: $list")
  val upperList = list.map(toUpper)
  println(s"After: $upperList")

  // this is the same as using an anonymous function such as
  println(List("one", "two").map(_.toUpperCase()))
}