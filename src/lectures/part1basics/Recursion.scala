package lectures.part1basics

object Recursion extends App {
  def primeCheck(num: Int): Boolean = {
    @scala.annotation.tailrec
    def check(i: Int, accumulator : Boolean): Boolean = {
      if (!accumulator) false
      else if(i <= 1) true
      else check(i - 1, num % i != 0 && accumulator)
    }

    check(Math.sqrt(num).toInt + 1, true)
  }


  def factorial(num: Int): Int = {
    if (num <= 1) 1
    else {
      println("Computing factorial of " + num + ". Need factorial of " + (num - 1))
      val result = num * factorial(num - 1)
      println("Factorial of " + num + " is: " + result)

      result
    }
  }

  def factorialSmart(num: Int): BigInt = {
    @scala.annotation.tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt = {
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator)
    }

    factHelper(num, 1)
  }

  def stringConcatSmart(word: String, reps: Int): String = {
    @scala.annotation.tailrec
    def stringConcatInternal(word: String, reps: Int, accumulator: String): String = {
      if (reps == 0) accumulator
      else stringConcatInternal(word, reps - 1, accumulator + word)
    }

    stringConcatInternal(word, reps, "")
  }

  def fibonacciSmart(num : Int) : BigInt = {
    def fibonacciInternal(counter: Int, fibNM2 : BigInt, fibNM1  :BigInt) : BigInt = {
      if (counter == num) fibNM1
      else fibonacciInternal(counter + 1, fibNM1, fibNM2 + fibNM1)
    }

    fibonacciInternal(1, 0, 1);
  }

  println()
  println(factorial(10))
  //  println(factorial(5000))
  println(factorialSmart(100))
  println()
  println(stringConcatSmart("abhishek ", 5))
  println()
  println(fibonacciSmart(7))

  println()
  println(primeCheck(2003))
  println(primeCheck(69))
}

