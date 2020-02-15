package lectures.part1basics

object Expressions extends App {
  var aVar = 1

  val x = 1 + 2
  println(x)

  val y = 2 + 3 * 4
  println(y)
  // + - * / % >> << >>> & | ^

  println(x == 3)
  println(!(x == 3))
  // ! && ||

  val aCondition = true
  val aConditionedValue = if (aCondition) 5 else 3
  println(aConditionedValue)

  println()

  //  AVOID LOOPS AS THEY ARE HIGHLY DEPENDENT ON SIDE EFFECTS
  var i = 0
  while (i < 5) {
    println(i + 1)
    i += 1
  } // NEVER WRITE A LOOP AGAIN

  println()

  val aWeirdValue = (aVar = 3)
  println(aWeirdValue)

  // Examples of side-effects
  // printing something, while loops, reassigning a variable

  //  Codeblocks - A codeblock is also an expression and their value is given by the last expression in the codeblock
  //  example
  val aCodeBlock = {
    val x = 2
    val y = 3

    if (x > 2) "Hello" else "Goodbye"
  }

  println(aCodeBlock)
}
