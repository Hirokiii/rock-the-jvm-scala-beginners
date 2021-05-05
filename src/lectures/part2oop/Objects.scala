package lectures.part2oop

object Objects extends App {

  // Scala does not have class-level functionality ("static")
  object Person { // type + its only instance
    // "static"/"class" - level functionality
    val N_EYES = 2
    def canFly: Boolean = false

    // factory method
    def apply(mother: Person, father: Person): Person = new Person("Bobbie")
  }

  class Person(val name: String) {
    // instance-level functionality
  }
  // COMPANIONS: same name for Object and Class

  println(Person.N_EYES)
  println(Person.canFly)

  // Object is similar to Class. The diff is it cannot take any arguments.

  // Scala object = Singleton instance
  val mary = Person // instance of Person type
  val john = Person
  println(mary == john) // true

  // this is different from the one above
  val eliza = new Person("Eliza")
  val michel = new Person("Michel")
  println(eliza == michel) // false

  val bobbie = Person(eliza, michel)

  // Scala Application = Scala object with
  // def main(args: Array[String]): Unit
}
