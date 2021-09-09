abstract class Pet (name: String) {
    def speak: Unit = println(s"My name is $name")
}

class Rabbit(name: String) extends Pet(name)

object PetTest extends App {
  val d = new Rabbit("Theo")
  d.speak
}