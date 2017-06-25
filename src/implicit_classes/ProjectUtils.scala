package implicit_classes

object ProjectUtils {
  implicit class StringUtils(s: String) {
    def containsOneOf(strings: String*): Boolean = {
      strings.exists(s.contains(_))
    }
  }
}