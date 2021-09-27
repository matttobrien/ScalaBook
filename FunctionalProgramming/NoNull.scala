object NoNull extends App {
  // one does not use null values in functional programming
  // scala offers Option/Some/None as a solution
  // this code can be read as, “When the given string converts to an integer, return the integer wrapped in a Some wrapper, such as Some(1). When the string can’t be converted to an integer, return a None value.”
  def toInt(s: String): Option[Int] = {
    try {
      Some(Integer.parseInt(s.trim))
    } catch {
      case e: Exception => None
    }
  }
  // to interact with this function, one could use a match statement
  toInt("12") match {
    case Some(i) => println(i)
    case None => println("That didn't work.")
  }
  toInt("swag") match {
    case Some(i) => println(i)
    case None => println("That didn't work.")
  }
}