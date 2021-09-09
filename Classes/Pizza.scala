import scala.collection.mutable.ArrayBuffer

// traits can also be used an interfaces in Java
sealed trait Topping
case object Cheese extends Topping
case object Pepperoni extends Topping
case object Sausage extends Topping
case object Mushrooms extends Topping
case object Onions extends Topping

sealed trait CrustSize
case object SmallCrustSize extends CrustSize
case object MediumCrustSize extends CrustSize
case object LargeCrustSize extends CrustSize

sealed trait CrustType
case object RegularCrustType extends CrustType
case object ThinCrustType extends CrustType
case object ThickCrustType extends CrustType

class Pizza (
  var crustSize: CrustSize = MediumCrustSize, 
  var crustType: CrustType = RegularCrustType
) {
  val toppings = ArrayBuffer[Topping]()

  // using Unit is like void in Java
  def addTopping(t: Topping): Unit = toppings += t
  def removeTopping(t: Topping): Unit = toppings -= t
  def removeAllToppings(): Unit = toppings.clear()

  override def toString(): String = {
      s"""
      |Crust Size: $crustSize
      |Crust Type: $crustType
      |Toppings:   $toppings
      """.stripMargin
  }
}

object PizzaTest extends App {
  val p = new Pizza
  p.addTopping(Cheese)
  p.addTopping(Pepperoni)
  println(p)
}