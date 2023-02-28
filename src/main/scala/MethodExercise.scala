object MethodExercise {
  def main(args: Array[String]): Unit = {
    println("Returned value " + addValues(5, 3))
    println(convertBooleanToStringMessage(true))
  }

  def addValues(a: Int, b: Int): Int = {

    var sum = 0
    sum = a + b
    return sum
  }

  def convertBooleanToStringMessage(bool: Boolean): String = {
    if (bool) "true" else "false"
  }

}
