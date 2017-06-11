package part2
/**
 * Here we are doing pattern matching to calculate sum/product
 * of each element in List (a linked list)
 * If pattern matches with Nil i.e. end of linked list return the accumulator value
 * else apply the current value in accumulator and pass the tail of list to next iteration
 */
object PatternMatching {
  def main(args: Array[String]): Unit = {
    val linkedList = List(3,4,7,6,9)
    println(Calculator.sum(linkedList))
    
    println(Calculator.product(linkedList))
  }

}

import scala.annotation.tailrec
object Calculator {
  def sum(list: List[Int]): Int = {
    @tailrec
    def loop(list: List[Int], acc: Int): Int = list match {
      case Nil => acc
      case x::tail => loop(list.tail, x + acc)
    }
    loop(list, 0)
  }
  
  def product(list:List[Int]):Int = {
    @tailrec
    def loop(list: List[Int], acc: Int): Int = list match {
      case Nil =>acc
      case x::tail =>loop(list.tail, x*acc)
    }
    loop(list,1)
  }
}