package Calculator;

public class Core {

        String Result (String a,String b,String operator,NumType type) throws WrongInputExeption  {
            String Res = null;
            Calculation C1 = new Calculation();
            Trans T1 = new Trans();

                if (NumType.arab == type) {
                    Res = String.valueOf(C1.calc(a, b, operator));
                } else if (NumType.roman == type) {
                    String A = T1.Arab(a);
                    String B = T1.Arab(b);
                    int R = C1.calc(A, B, operator);

                    if (R < 1) {
                        throw new WrongInputExeption ("В римской системе нет отрицательных чисел");

                    } else {
                        Res = T1.Rome(R);
                    }
                }
            return Res;
        }
}