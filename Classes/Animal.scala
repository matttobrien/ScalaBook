trait TailWagger {
  def startTail(): Unit
  def stopTail(): Unit
}

trait Speaker {
  def speak(): String
}

trait Runner {
  def startRunning(): Unit
  def stopRunning(): Unit
}

class Dog extends Speaker with TailWagger with Runner {
  // Speaker
  def speak(): String = "Woof!"
  // TailWagger
  def startTail(): Unit = println("tail is wagging")
  def stopTail(): Unit = println("tail is stopped")
  // Runner
  def startRunning(): Unit = println("I'm running")
  def stopRunning(): Unit = println("Stopped running")
}

class Cat extends Speaker with TailWagger with Runner {
  def speak(): String = "Meow"
  // override
  override def startRunning(): Unit = println("Yeah ... I don't run")
  override def stopRunning(): Unit = println("No need to stop")
  override def startTail(): Unit = println("Yeah I don't do that")
  override def stopTail(): Unit = println("No need")
}

object DogTest extends App {
  val d = new Dog
  d.startTail()
  d.startRunning()
  d.stopRunning()
  d.stopTail()
}

object CatTest extends App {
  val c = new Cat
  c.startRunning()
  c.startTail()
}