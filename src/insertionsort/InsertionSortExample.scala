package insertionsort

object InsertionSortExample {
  def main(args: Array[String]): Unit = {
    val arr = Array.fill(10) { scala.util.Random.nextInt(100) }
    println(arr.mkString(","))
    sort(arr)
    println(arr.mkString(","))
  }

  def sort(arr: Array[Int]): Unit = {
    for (i <- 1 until arr.length) {
      var k = i-1
      val key = arr(i)
      while (k >= 0 && arr(k) > key) {
        arr(k+1) = arr(k)
        k -= 1
      }
      arr(k+1) = key
    }
  }
}