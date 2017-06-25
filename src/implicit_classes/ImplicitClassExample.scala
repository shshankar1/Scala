package implicit_classes

import ProjectUtils.StringUtils

object ImplicitClassExample {
  def main(args: Array[String]): Unit = {
    val text = "This is implicit class example."
    //imperative way to finding if text has words matching with
    //at least of input strings or not
    println(StrUtils.containsOneOf(text, "implicit","example"))

    //using implicit classes
    println(text.containsOneOf("test", "coupon"))
  }
}

object StrUtils {
  def containsOneOf(stringToCheck: String, strings: String*): Boolean = {
    strings.exists(stringToCheck.contains(_))
  }
}