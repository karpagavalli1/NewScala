object RangeOfExercise {
  def main(args: Array[String]) {
    val myList1 = Range(1, 9)
    for (x <- myList1) {
      print(x)
    }
    val myList2 = Range(1,20,2)
    for (y <- myList2){
      println(y)
    }

    val myList3 = List.range(2,20)
    println(myList3)

      }




}
