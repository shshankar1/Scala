package part1

/**
 * Don't get confused with polymorphic word,
 * basically this is like java generics,
 * Here Array initialization is done using companion object
 * of Array class which gives functionality of java static behavior 
 */

object PolymorphicFunction {
  def main(args: Array[String]): Unit = {
    val charArray = Array("V", "D", "A", "T", "E", "A")
    println(findFirst(charArray, "A"))

    val intArray = Array(13, 45, 21, 34, 21, 19)
    println(findFirst(intArray, 19))

    println(findFirst(intArray, (x: Int) => {x == 45}))
  }

  import scala.annotation.tailrec
  def findFirst[A](arr: Array[A], x: A): Int = {
    @tailrec
    def loop(index: Int): Int = {
      if (index >= arr.length) -1
      else if (arr(index) == x) index
      else loop(index + 1)
    }
    loop(0)
  }

  def findFirst[A](arr: Array[A], f: A => Boolean): Int = {
    @tailrec
    def loop(index: Int): Int = {
      if (index >= arr.length) -1
      else if (f(arr(index))) index
      else loop(index + 1)
    }
    loop(0)
  }
}