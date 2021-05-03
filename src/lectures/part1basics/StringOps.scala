package lectures.part1basics

object StringOps extends App {

  val str: String = "Hello, I am learning Scala."

  println(str)
  println(str.charAt(2))
  println(str.substring(7, 11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "-"))
  println(str.toLowerCase())
  println(str.length)

  val aNumberString = "2"
  val aNumber = aNumberString.toInt
  println('a' +: aNumberString :+ 'z')
  println(str.reverse)
  println(str.take(2))

  // String interpolators

  // s-interpolation
  val name = "David"
  val age = 12
  println(s"Hello, my name is $name and I am $age years old.")
  println(s"Hello, my name id $name and I will be turning ${age + 1} years old.")

  // f-interpolation
  val speed = 1.2f
  println(f"$name can eat $speed%2.2f burgers per minute.")
  println(f"$name can eat $speed%1.2f burgers per minute.")

  // raw-interpolation
  println(raw"This is a \n newline.")
  val escaped = "This is a \n newline"
  println(raw"$escaped")

}
