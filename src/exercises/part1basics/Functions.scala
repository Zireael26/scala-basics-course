package exercises.part1basics

object Functions extends App {
  def greetingFunction(name: String, age: Int): String = "Hi! My name is " + name + " and I am " + age + " years old!"

  def factorial(num: Int): Int = {
    if (num == 1 || num == 0) 1 else num * factorial(num - 1)
  }

  def fibonacci(num: Int): Int = {
    if (num == 1 || num == 2) 1 else fibonacci(num - 1) + fibonacci(num - 2)
  }

  def checkPrime(num: Int): Boolean = {
    @scala.annotation.tailrec
    def internalPrimeCheck(limit: Int): Boolean = {
      if (limit > Math.sqrt(num).toInt) true
      else num % limit != 0 && internalPrimeCheck(limit + 1)
    }

    internalPrimeCheck(2)
  }

  println(greetingFunction("Abhishek", 22))
  println(factorial(1))
  println(factorial(6))
  println(fibonacci(7))

  println()

  println(checkPrime(8))
  println(checkPrime(7))
  println(checkPrime(81))
  println(checkPrime(43))
}
