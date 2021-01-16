package com.knoldus;

public class Application
{
  public  static  void main (String[] args)
  {
    Calculator ob = new Calculator();
    System.out.println("Addition of two numbers :"+ob.add(2,3));
    System.out.println("Subtraction of two numbers :"+ob.sub(2,3));
    System.out.println("Multiplication of two numbers :"+ob.multiply(2,3));
    System.out.println("Division of two numbers :"+ob.divide(10,5));
  }
}
