object Lists extends App {
  val ints: List[Int] = List(1, 2, 3)
  val names: List[String] = List("Joel", "Rhys", "Nick")

  // prepend items
  println(s"Before: ${ints}")
  val ints2 = 0 +: ints
  println(s"After: ${ints2}")

  // loop through a list
  for (name <- names) println(name)
}