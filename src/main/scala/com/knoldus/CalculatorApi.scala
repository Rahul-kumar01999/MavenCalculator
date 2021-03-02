package com.knoldus

object CalculatorApi {
  def main(args: Array[String]): Unit = {

    val calculator = new CalculatorImpl

    println("5+10 = " + calculator.add(5,10))

    println("5-10 = " + calculator.subtract(5,10))

    println("2*4 = " + calculator.multiply(2,4))

    println("6/3 = " + calculator.divide(6,3))

    println("2^3 = " + calculator.power(2,3)) 

    println("|-3| = " + calculator.absolute(-3)) 
  
    println("17%4 = " + calculator.modulus(17,4))

    println("Max(100,10) =  " + calculator.getMaximum(100,10))

    println("Min(100,10) = " + calculator.getMinimum(100,10))


  }

}