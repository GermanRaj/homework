import java.util.Random;
public class Calculator {

    public int varNumber =0;



    Random randomize = new Random();
    int number1 = randomize.nextInt(0,100);
    int number2 = randomize.nextInt(0,100);


    public int addMethod() {
        System.out.println("First number -  " + "  " +number1);
        System.out.println("Second number -  " + "  " +number2);
        int summOftwoNumbers = number1 + number2;
        return summOftwoNumbers;

    }

    public int substractMethod(){

        int substractOftwoNumbers = number1 / number2;
        return substractOftwoNumbers;
    }

    public int multiplyMethod(){

        int multiplyOftwoNumbers = number1 * number2;
        return multiplyOftwoNumbers;
    }
    public int divideMethod() {

        int divideOftwoNumbers = number1 / number2;
        return divideOftwoNumbers;
    }



    }














