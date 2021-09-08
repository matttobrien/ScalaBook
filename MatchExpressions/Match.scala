import scala.io.StdIn.readInt
import scala.io.StdIn.readBoolean

object Match extends App {
  println("Enter an integer between 1-12")
  val i = readInt()
  // match is similar to java switch
  val monthName = i match {
    case 1  => "January"
    case 2  => "February"
    case 3  => "March"
    case 4  => "April"
    case 5  => "May"
    case 6  => "June"
    case 7  => "July"
    case 8  => "August"
    case 9  => "September"
    case 10 => "October"
    case 11 => "November"
    case 12 => "December"
    case _  => "Invalid month"
  }
  println(monthName)

  // handling alternate cases with match, for example | is treated as or
  val evenOrOdd = i match {
    case 1 | 3 | 5 | 7 | 9 | 11 => println("odd")
    case 2 | 4 | 6 | 8 | 10 | 12 => println("even")
    case _ => println("some other number")
  }

  // you can also use if statements within match
  val amount = i match {
    case 1 => {
      println("one, a lonely number")
    }
    case x if x == 2 || x == 3 => {
      println("two's company, three's a crowd")
    }
    case x if x > 3 => {
      println("4+, that's a party")
    }
    case _ => {
      println("i'm guessing your number is zero or less")
    }
  }

  // you can also use match as the body of a method
  def convertBooleanToStringMessage(bool: Boolean): String = bool match {
    case true => "you said true"
    case false => "you said false"
  }
  println("Enter true or false")
  val input = readBoolean()
  val result = convertBooleanToStringMessage(input)
  println(result)
}