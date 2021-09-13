object Vectors extends App {
  // vecotrs are like lists, but are indexed
  val nums = Vector(1, 2, 3, 4, 5)
  val strings = Vector("one", "two")
  println(strings(1))

  // appending
  val nums2 = nums :+ 6
  println(nums2)

  // prepending
  val nums3 = 0 +: nums2
  println(nums3)

  // looping
  for (string <- strings) println(string)
}