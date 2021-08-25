package Calculator;

public class WrongInputExeption extends Exception{
    public WrongInputExeption() {
    }

    public WrongInputExeption(String message) {
        super(message);
    }

}
