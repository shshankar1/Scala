package part1
/**
 * demo for higher order function,
 * function format is a higher order function because it accepts a function f:Int=>Int
 */
object HigherOrderFunction {
  def main(args: Array[String]):Unit={
    println(format("factorial", 5, factorial))
    println(format("Absolute Value",-20,abs))
  }  
  
  def format(name:String, n:Int, f:Int=>Int):String={
    val msg = "%s of %d is %d."
    msg.format(name,n,f(n))
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
  
  def abs(n:Int):Int={
    if(n<0)-n
    else n
  }
}