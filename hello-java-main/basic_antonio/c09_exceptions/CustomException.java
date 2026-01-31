package basic_antonio.c09_exceptions;
// Con la exception te obliga a que tu tengas que avisar si o si del tipo de exception que vas a lanzar
public class CustomException extends Exception {

    public CustomException(String message) {
        super(message);
    }
}
