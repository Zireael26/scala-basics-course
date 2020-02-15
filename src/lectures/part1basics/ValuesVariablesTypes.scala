package lectures.part1basics

object ValuesVariablesTypes extends App {
  //  vals are constant
  val x: Int = 42
  println(x)

  //  Types are optional as well
  val aString: String = "Hello"
  println(aString)

  val aBoolean: Boolean = true
  println(aBoolean)

  val aChar: Char = 'a'
  val aShort: Short = 4612
  val aLong: Long = 3456789L

  println(aChar + " " + aShort + " " + aLong)

  val aFloat: Float = 34.21F
  val aDouble: Double = 445.123

  println(aFloat + " " + aDouble)

  //  Variables (Called Side effects in functional programming)
  var aVariable: Int = 5
  aVariable = 6 // Side Effect
  println(aVariable)
}
