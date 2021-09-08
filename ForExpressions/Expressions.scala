object Expressions extends App {
  val nums = Seq(1, 2, 3)
  println(nums)
  // expressions can create new collections from existing collections using yield
  val doubledNums = for (n <- nums) yield n * 2
  println(doubledNums)

  // capitalizing strings
  val names = List("ben", "max", "mike")
  println(names)
  val cNames = for (name <- names) yield name.capitalize
  println(cNames)

  // using code along with yield
  val moreNames = List("_kevin", "_luke", "_dan")
  println(moreNames)
  val cMoreNames = for (name <- moreNames) yield { name.drop(1).capitalize }
  println(cMoreNames)
}