package binarysearch

object BinarySearchExample {
  def main(args: Array[String]): Unit = {
    val arr = Array.fill(10) { scala.util.Random.nextInt(100) }.sortWith { (x,y) => x < y }
    println(arr.mkString(","))
    println(binarySearch(arr, arr(9)))
  }

  import scala.annotation.tailrec
  def binarySearch(arr: Array[Int], key: Int): Int = {
    @tailrec
    def loop(arr: Array[Int], key: Int, low: Int, high: Int): Int = {
      if (low > high) return -1

      val mid = (low + high) / 2
      if (arr(mid) == key) mid
      else if (arr(mid) > key) loop(arr, key, low, mid - 1)
      else loop(arr, key, mid + 1, high)
    }
    loop(arr, key, 0, arr.length - 1)
  }
}