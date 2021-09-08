object Loops extends App {
  // sequence of numbers
  val nums = Seq(1, 2, 3)
  for (n <- nums) println(n)

  // list of strings
  val people = List("Randy", "Stan", "Eric", "Kyle")
  // using for loop
  for (p <- people) println(p)
  // using foreach method
  people.foreach(println)

  // maps
  val ratings = Map(
    "Avengers"  -> 3.0, 
    "Snakes on a Plane"  -> 4.0, 
    "Pulp Fiction" -> 3.5
  )
  // for loop
  for ((name, rating) <- ratings) println(s"Movie: $name, Rating: $rating")
  // foreach method 
  ratings.foreach {
    case(movie, rating) => println(s"key: $movie, value: $rating")
  }
}
