package lectures.part1basics

// Parameter is evaluated and then sent to the function
object CBVvCBN extends App {
  def calledByValue(x: Long): Unit = {
    println("By Value: " + x)
    println("By Value: " + x)
  }

  // Parameter is passed as it is and is evaluated every time it is encountered
  def calledByName(x: => Long): Unit = {
    println("By Name: " + x)
    println("By Name: " + x)
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())

  def infinite(): Int = 1 + infinite()

  def printFirst(x: Int, y: => Int): Unit = {
    println(x)
  }

  // This will crash as the evaluation is done prior and hence will result in a stack overflow
//  printFirst(infinite(), 34)

  // this will work fine as the infinite func is never called and is hence never evaluated as its called by name
  printFirst(34, infinite())
}
