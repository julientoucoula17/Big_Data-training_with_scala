// In this exercise, pay extra attention to the usage of val and var
// Use val when the variable is not supposed to change after its definition
// Use var when the variable will change after its definition
object Exercise0 {

  // Write a function that will mix two strings, taking the first char of the first string and then the first of the
  // second string, and so on...
  // For example mingleString("aaa", "bbb") -> "ababab"
  // To simplify the exercise you can assume the inputs are of same length
  def mingleString(u: String, v: String): String = {
    assert(u.length == v.length, "u and v should be of same length")

    var mingledString = ""
    for (it <- 0 until u.length) {
      val firstChar = u(it)
      val secondChar = v(it)
      mingledString = s"$mingledString$firstChar$secondChar"
    }

    mingledString
  }

  def main(args: Array[String]): Unit = {
    println(mingleString("jle ocua", "uintuol!"))
  }

}
