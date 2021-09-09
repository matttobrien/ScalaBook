object SimpleMethods extends App {
  def double(num: Int): Int = num * 2
  println(double(2))

  def add(num1: Int, num2: Int): Int = num1 + num2
  println(add(2, 2))

  def addThenDouble(num1: Int, num2: Int): Int = {
    val sum = num1 + num2
    val doubled = sum * 2
    doubled
  }
  println(addThenDouble(1, 1))
}