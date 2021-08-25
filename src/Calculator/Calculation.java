package Calculator;

public class Calculation {

     int calc(String a, String b,String operator) throws WrongInputExeption {

         int a1 = Integer.parseInt(a);
         int b1 = Integer.parseInt(b);
         int r;

         switch (operator) {
             case "+" -> r = a1 + b1;
             case "-" -> r = a1 - b1;
             case "*" -> r = a1 * b1;
             case "/" -> r = a1 / b1;
             default -> throw new WrongInputExeption ("Калькулятор работает только с операторами +, -, /, *");
         }
         return r;
     }
}
