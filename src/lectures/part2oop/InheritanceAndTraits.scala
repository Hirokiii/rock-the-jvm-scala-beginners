package lectures.part2oop

object InheritanceAndTraits extends App {

  // single class inheritance
  sealed class Animal {
    val creatureType = "wild"
    def eat: Unit = println("nomnom")
//    private def eat: Unit = println("nomnom")  // cannot inherit
  }

  class Cat extends Animal {
    def crunch: Unit = {
      eat    // only via from method
      println("crunch crunch")
    }
  }

  val cat = new Cat
//  cat.eat  // this cause an error
  cat.crunch

  // constructors
  class Person(name: String, age: Int)
//  class Adult(name: String, age: Int, idCard: String) extends Person
  // ↑ error. Because JVM calls Person class first and one param missing.

  // overriding
  class Dog (override val creatureType: String) extends Animal {
//    override val creatureType = "domestic"    // equivalent
    override def eat: Unit = {
      super.eat
      println("bow wow!")
    }
  }
  val dog = new Dog("K9")
  dog.eat
  println(dog.creatureType)

  // type substitution (broad: polymorphism)
  val unknownAnimal: Animal = new Dog("domestic")
  unknownAnimal.eat

  // overRIDING vs overLOADING

  // super  * before overriding

  // final  * prevents overriding and extending
  // 1 - use final on member
  // 2 - use final on the entire class
  // 3 - seal the class = extend classes only IN THIS FILE.
}
