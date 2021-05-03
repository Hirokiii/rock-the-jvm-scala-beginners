package lectures.part1basics

import scala.annotation.tailrec

object DefaultArgs extends App {

  @tailrec
  def trFact(n: Int, acc: Int = 1): Int = {
    if (n <= 1) acc
    else trFact(n-1, acc * n)
  }
  val fact10 = trFact(10)
  println(fact10)

  def savePicture(format: String = "jpg", width: Int = 1920, height: Int = 1080): Unit = {
    println("saving picture")
  }

  // name the arguments
  savePicture(width = 600, height = 800, format = "png")
}
