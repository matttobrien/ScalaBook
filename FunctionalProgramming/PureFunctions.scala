object PureFunctions extends App {
  // simple pure function which doubles input
  def double(i: Int): Int = i * 2
  println(double(2))

  // recursive function which calc the sum of a list
  def sum(list: List[Int]): Int = list match {
    case Nil => 0
    case head :: tl => head + sum(tl)
  }
  val nums = List(1, 2, 3, 4, 5)
  println(sum(nums))
}