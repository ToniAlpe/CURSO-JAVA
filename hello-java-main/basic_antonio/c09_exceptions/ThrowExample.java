package basic_antonio.c09_exceptions;
// Hay que entender las excepciones (no hace falta que sean todas)
public class ThrowExample {

    public void checkAge(int age) throws IllegalArgumentException { //Si hay algun fallo va a salir un IllegalArgumentException
        if (age < 18) {
            throw new IllegalArgumentException("Tienes que ser mayor de edad");
        } else {
            System.out.println("Es mayor de edad");
        }
    }

    public void checkScore(int score) throws CustomException {
        if (score < 18 || score > 100) {
            throw new CustomException("La puntuación debe de estar entre 0 y 100");
        } else  {
            System.out.println("Puntuación valida: " + score);
        }
    }
}
