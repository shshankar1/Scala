package part1

object Factorial {
  def main(args: Array[String]): Unit = {
    val fact = factorial(5)
    println(fact)
  }

  import scala.annotation.tailrec
  def factorial(n: Int): Int = {
    @tailrec
    def loop(n: Int, acc: Int): Int = {
      if (n <= 0) acc
      else loop(n - 1, n * acc)
    }
    loop(n, 1)
  }
}