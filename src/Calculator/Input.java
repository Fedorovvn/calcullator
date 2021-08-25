package Calculator;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

       try {
           Scanner in = new Scanner(System.in);
           System.out.print("Input: ");
           String input = in.nextLine();

           Check Ch = new Check();

           String[] Ins = input.split(" ");
           NumType type = Ch.check(input);

           Core core = new Core();
           String a = Ins[0];
           String operator = Ins[1];
           String b = Ins[2];

           System.out.println("Output: " + core.Result(a,b,operator,type));

       } catch (Exception e){
           System.err.println(e.getMessage());
       }

    }

}
