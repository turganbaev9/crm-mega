package Exeption;

public class WrongCommandExeption extends RuntimeException{
    public WrongCommandExeption(String message) {
        super(message);
    }
}
