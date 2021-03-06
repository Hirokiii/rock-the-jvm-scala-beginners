package lectures.part1basics

// "extends App" make this object executable
object Expressions extends App {

  val x = 1 + 2 // EXPRESSION
  println(x)

  println(2 + 3 * 4)

  println(1 == x)
  println(!(1 == x))

  var aVariable = 2
  aVariable += 3
  println(aVariable)

  // Instructions (DO) vs Expressions (VALUE)

  // IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 // IF EXPRESSION
  println(aConditionedValue)

  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }
  // But "while" is not recommended.

  // Everythin is Scala is an Expression!

  val aWeirdValue = (aVariable = 3) // Unit === void
  println(aWeirdValue)

  // side effects: println(), while, reassigning
  // side effects: A function that changes the (logical) state of a computer and affects the results obtained thereafter.

  // Code blocks
  val aCodeBlock = {
    val y =2
    val z = y + 1

    if (z >2) "hello" else "goodbye"
  }
  println(aCodeBlock)
}

