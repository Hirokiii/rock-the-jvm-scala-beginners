package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else {
      // Scala string interpolation
      println(s"Conputing factorial of $n - I first need factorial of ${n-1}")
      val result = n * factorial(n-1)
      println(s"Computed factorial of $n")
      result
    }
  }
  println(factorial(10))

  // ↑ when the recursive depth is too deep, StackOverflowError will happen.
  // Yes. To execute above, it stacks each computation. This is the reason.

  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt = {
      if (x <= 1) accumulator
      else factHelper(x-1, x * accumulator) // Tail Recursion
    }
    factHelper(n, 1)
  }

  println(anotherFactorial(5000))
  // When you need loops, use TAIL RECURSION

  /*
    1. Concatenate a string n times
    2. IsPrime function, tail recursive
    3. Fibonacci function, tail recursive
   */
  @tailrec
  def concatenateString(aString: String, n: Int, accum: String): String = {
    if (n <= 0) accum
    else concatenateString(aString, n-1, accum + aString)
  }
  println(concatenateString("Hello", 3, ""))


  def isPrime(num: Int): Boolean = {
    @tailrec
    def isPrimeHelper(t: Int, isStillPrime: Boolean): Boolean = {
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeHelper(t-1, num % t != 0 && isStillPrime)
    }
    isPrimeHelper(num / 2, true)
  }
  println(isPrime(2003))


  def fibonacci(n: Int): Int = {
    @tailrec
    def fibonacciHelper(t: Int, last: Int, nextToLast: Int): Int = {
      if (t >= n) last
      else fibonacciHelper(t+1, last+nextToLast, last)
    }

    if (n <= 2) 1
    else fibonacciHelper(2, 1, 1)
  }
  println(fibonacci(7))
}
