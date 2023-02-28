object rep{
  def main(args: Array[String]): Unit = {
    loopThrough()
  }
  def loopThrough(): Unit = {
    val list = List(1,2,3,4,5)
    for(i <- list){
      println(i)
    }
  }

}
