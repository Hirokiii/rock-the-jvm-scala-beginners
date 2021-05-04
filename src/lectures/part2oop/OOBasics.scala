package lectures.part2oop

object OOBasics extends App {

  val person = new Person("John", 26)
  println(person.x)
  person.greet("Daniel")
  person.greet()

  val person2 = new Person()
  person2.greet()

  val author = new Writer("Charles", "Dickens", 1812)
  val imposter = new Writer("Charles", "Dickens", 1812)
  val novel = new Novel("Great Expectations", 1861, author)

  println(novel.authorAge)
  println(novel.isWrittenBy(author))
  println(novel.isWrittenBy(imposter))

  val counter = new Counter
  counter.increment.print
  counter.increment(5).print
}

class Person(name: String, val age: Int = 0) {
  // body
  val x = 2

  // method
  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  // overloading
  def greet(): Unit = println(s"Hi, I am $name")

  // multiple contructors
  def this() = this("John Doe")
}

/*
  Novel and a Writer

  Writer: first name, surname, year
    - method: fullname

   Novel: name, year of release, author
    - authorAge
    - isWrittenBy(author)
    - copy (new year of release) = new instance of Novel
 */
class Writer(firstName: String, surname: String, val year: Int) {
  def fullName: String = s"$firstName $surname"
}

class Novel(name: String, year: Int, author: Writer) {
  def authorAge = year - author.year
  def isWrittenBy(author: Writer): Boolean = author == this.author
  def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}


/*
  Couter class
    - receives an int value
    - method: current count
    - method: inc/dec => new Counter
    - overload inc/dec to receive an amount
 */
class Counter(val count: Int = 0) {
  def increment(): Counter = {
    println("incrementing")
    new Counter(count+1)
  } // immutability. When you change the value, create a new instance.

  def decrement(): Counter = {
    println("decrementing")
    new Counter(count-1)
  }
  def increment(k: Int): Counter = {
    if (k <= 0) this
    else increment.increment(k-1)   // the first increment returns an instance.
  }
  def decrement(k: Int): Counter = {
    if (k <= 0) this
    else decrement.increment(k-1)
  }
  def print = println(count)
}