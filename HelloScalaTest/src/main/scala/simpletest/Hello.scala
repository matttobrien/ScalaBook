package simpletest

object Hello extends App {
  val p = new Person("Barry B. Benson")
  println(s"Hello ${p.name}")
}

class Person(var name: String)