import java.util.Random;
public class Main {
   public static void main(String...args){
       Calculator calc = new Calculator();

       int sumOfTwoNumbers = calc.addMethod();
       int substractOftwoNumbers = calc.substractMethod();
       int multiplyOftwoNumbers = calc.multiplyMethod();
       int divideOftwoNumbers = calc.divideMethod();

       System.out.println("Summ of two numbers " +sumOfTwoNumbers);
       System.out.println("Substraction of two numbers " +substractOftwoNumbers);
       System.out.println("Multiplication of two numbers " +multiplyOftwoNumbers);
       System.out.println("Divide of two numbers " +divideOftwoNumbers);

      ;










   }

}
