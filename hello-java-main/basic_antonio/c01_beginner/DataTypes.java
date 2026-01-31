package basic_antonio.c01_beginner;

public class DataTypes {
    static void main() {

        //Tipos de datos primitivos

        int myInt = 18;
        System.out.println(myInt);

        double myDouble = 1.77;
        System.out.println(myDouble);

        // float, long, byte (hay más) (todo esto lo he estudiado en la FP)

        //Comillas simples (para un caracter)
        char  myChar = 'a';
        System.out.println(myChar);

        boolean myBoolean = true;
        myBoolean = false;
        System.out.println(myBoolean);

        //El String no es primitivo (es una clase)

        String myString = "Hola, Java";
        System.out.println(myString);

        // Tipo de dato en tiempo de compilación

        System.out.println(myString.getClass().getSimpleName());
    }
}
