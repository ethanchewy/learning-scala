// Source: http://twitter.github.io/scala_school/basics.html

// How to run:
// scalac warmup.scala
// scala WarmUp 

object WarmUp {
  def ethanEatsHardboiledEggs(i: Int): Unit = {
    // Returns: (Ethan likes eating ,2, hard boiled eggs)
    // println("Ethan likes eating ", i.toString(), " hard boiled eggs")

    println("Ethan likes eating " + i.toString() + " hard boiled eggs")
  }
  def main(args: Array[String]): Unit = {
    // Function example
    ethanEatsHardboiledEggs(2)

    // Anonymous Functions: Kinda like a lambda in Python - very cool
    val isEven = (x: Int) => x % 2 == 0
    println("Is 20 even? " + isEven(20))

    val spicyListOfInts = List.range(3, 9)
    val spicyIntsGreaterThan5 = spicyListOfInts.filter(_ > 5)
    println("List of ints greater than 5 " + spicyIntsGreaterThan5)

    // 
  }
}
