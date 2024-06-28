object even {
  def main(args: Array[String]): Unit = {
    val a = 14
    if (a > 0 && a % 2 == 0) {
      println("the given number is even and positive ")
    }
    else if (a > 0 && a % 2 != 0) {
      println("the given number is not an even and positive ")
    }
    else {
      println("the given number is not an even and not positive ")
    }


  }
}
