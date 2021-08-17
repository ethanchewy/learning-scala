// Source: http://twitter.github.io/scala_school/basics.html

object WarmUp {
  def ethanEatsHardboiledEggs(i: Int): Unit = {
    // Returns: (Ethan likes eating ,2, hard boiled eggs)
    // println("Ethan likes eating ", i.toString(), " hard boiled eggs")

    println("Ethan likes eating " + i.toString() + " hard boiled eggs")
  }
  def main(args: Array[String]): Unit = {
    ethanEatsHardboiledEggs(2)
  }
}
