package chapter1

object FibonacciSeries {
  def main(args: Array[String]): Unit = {
    println(fibonacci(8))
  }

  import scala.annotation.tailrec
  def fibonacci(n: Int): Int = {
    @tailrec
    def loop(x: Int, y: Int, z: Int): Int = {
      if (z - 2 <= 0) y
      else loop(y, x + y, z - 1)
    }

    loop(0, 1, n)
  }
}