package lectures.part1basics

object Functions extends App {
  //   A Basic function definition
  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("A", 3))

  //   parameter-less functions can be simply called just by their names
  def aParameterlessFunction(): Int = 42

  println(aParameterlessFunction())
  println(aParameterlessFunction)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString else aString + aRepeatedFunction(aString, n - 1)
  }

  println(aRepeatedFunction("Abhishek ", 5))

  //  WHEN YOU NEED LOOPS, USE RECURSIVE FUNCTIONS

  def aFunctionWithSideEffects(aString: String): Unit = {
    println(aString)
  }

  aFunctionWithSideEffects("Rocks")

  def theDaddyFunction(anInt: Int): Int = {
    def theKidFunction(a: Int, b: Int): Int = a + b

    theKidFunction(anInt, anInt + 1)
  }
  println(theDaddyFunction(5))
}
