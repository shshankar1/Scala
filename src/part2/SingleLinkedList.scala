package part2
/**
 * This is just for example,
 * List, Nil are all standard data structure in scala library
 * Beauty of companion object with case class
 * Cons(5,Cons(4,Cons(3,Nil))) --> created a linked list (5->4->3-> Nil)
 */
object SingleLinkedList {
  def main(args: Array[String]): Unit = {
    val linkedList = Cons(5,Cons(4,Cons(3,Nil)))
    println(List.sum(linkedList))
  }

  sealed trait List[+A]

  case object Nil extends List[Nothing]

  case class Cons[+A](head: A, tail: List[A]) extends List[A]

  import scala.annotation.tailrec
  object List {
    def sum(elements: List[Int]): Int = {
      @tailrec
      def loop(ele: List[Int], acc: Int): Int = {
        ele match {
          case Nil => acc
          case Cons(x, tail) => loop(tail, acc + x)
        }
      }
      loop(elements,0)
    }

  }

}