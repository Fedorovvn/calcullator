package Calculator;

public class Check {

    NumType check(String In) throws WrongInputExeption  {

        String[] Ins = In.split(" ");
        Trans T1 = new Trans();

        int l = Ins.length;
        NumType type;

        if (l < 3) {
            throw new WrongInputExeption ("Строка не являеться математическим выражением");
        } else if (l > 3) {
            throw new WrongInputExeption ("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        } else {
            String a = Ins[0];
            String b = Ins[2];
            NumType A = T1.NumTypeCheck(a);
            NumType B = T1.NumTypeCheck(b);

            if (A == NumType.not_roman && B == NumType.not_roman) {
                    try {
                        int Aar = Integer.parseInt(a);
                        int Bar = Integer.parseInt(b);
                        if (Aar <= 10 && Bar <= 10 && Aar >= 1 && Bar >= 1) {
                            type = NumType.arab;
                        } else {
                            throw new WrongInputExeption ("Допускаются только целые числа от 1 до 10 включительно");
                        }
                    } catch (Exception ne) {
                        throw new WrongInputExeption ("Введенные значения операнд не поддерживваются калькулятором, допускаются только целые числа от 1 до 10 включительно");
                    }
            } else if (A == NumType.not_roman ^ B == NumType.not_roman) {
                    throw new WrongInputExeption ("Калькулятор может работать только с римскими или арбскимим цифрами одновременно");
            } else {
                type = NumType.roman;
            }
        }
        return type;
    }

}
