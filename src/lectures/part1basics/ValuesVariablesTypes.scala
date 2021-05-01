package lectures.part1basics

object ValuesVariablesTypes extends App {

  val x: Int = 42
  println(x)

  // VALS ARE IMMUTABLE

  // COMPILER CAN INFER TYPES FOR VALS

  val aString: String = "hello"
  val anotherString = "goodbye"

  val aBoolean: Boolean = false
  // CHAR REQUIRES SINGLE QUOTATION
  val aChar: Char = 'a'
  val aShoart: Short = 12345
  val aLong: Long = 1234567890
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14

  // VARIABLES
  var aVariable: Int = 4

  aVariable = 5 // SIDE EFFECT

}


