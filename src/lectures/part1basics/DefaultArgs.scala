package lectures.part1basics

object DefaultArgs extends App {
  // Can use default params and then we can skip giving all params
  // To resolve ambiguities, we name the args and that also allows us to specify them in any order we like
  val fact = factorialTR(num = 10)

  @scala.annotation.tailrec
  def factorialTR(num: Int, accumulator: BigInt = 1): BigInt = {
    if (num <= 1) accumulator
    else factorialTR(num - 1, num * accumulator)
  }

  println(fact)
}
