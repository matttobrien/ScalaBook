import scala.collection.mutable.Map

object Maps extends App {
  // creating a mutable map
  val provinces = collection.mutable.Map("ON" -> "Ontario")
  println(provinces)
  // adding to map
  provinces += ("QC" -> "Quebec", "BC" -> "British Columbia")
  println(provinces)
  // adding from another map
  provinces ++= Map("MB" -> "Manitoba")
  println(provinces)
  // removing elements from map
  provinces -= "MB"
  println(provinces)
  // updating elements
  provinces("BC") = "British Columbia is cool"
  println(provinces)
  // loop using for
  for ((k,v) <- provinces) println(s"key: $k, value: $v")
  // loop using match
  provinces.foreach {
    case (k, v) => println(s"key: $k, value: $v")
  }
}