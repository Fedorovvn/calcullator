package Calculator;

public class Trans {

    NumType NumTypeCheck (String ab) {
    NumType AB;
        switch (ab) {
            case "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X" -> AB = NumType.roman;
            default ->  AB = NumType.not_roman;
        }
    return AB;
    }

    String Arab(String Rr) {
        String A = null;
            switch (Rr) {
            case "I" -> A = "1";
            case "II" -> A = "2";
            case "III" -> A = "3";
            case "IV" -> A = "4";
            case "V" -> A = "5";
            case "VI" -> A = "6";
            case "VII" -> A = "7";
            case "VIII" -> A = "8";
            case "IX" -> A = "9";
            case "X" -> A = "10";
            }
            return A;
    }

    String Rome(int Ar) {
        String R;
        String R1;

        int Ar1 = Ar%10 - 1;
        int Ar10 = Ar/10 - 1;

        String[] Roman1 = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] Roman10 = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C"};

        if (Ar1 < 0) {
            R = Roman10[Ar10];
        } else if (Ar10 < 0) {
            R = Roman1[Ar1];
        } else {
            R1 = Roman10[Ar10];
            R = R1.concat(Roman1[Ar1]);
        }

        return R;
    }
}

