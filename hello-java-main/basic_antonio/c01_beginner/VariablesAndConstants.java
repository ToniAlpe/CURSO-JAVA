package basic_antonio.c01_beginner;

public class VariablesAndConstants {
    static void main() {

        // Variables

        String name = "Antonio";
        System.out.println(name);

        // Actualizar valor
        name = "Toni";
        System.out.println(name);

        //name = 18; Error (no podemos cambiar el tipo de dato)

        int age = 18;
        System.out.println(age);

        //Diferencia las variables y el propio sistema lo detecta

        //String
        var email = "antonio@gmail.com";
        System.out.println(email);
        //Int
        var year = 2025;
        System.out.println(year);

        // Constantes (en mayuscula)

        final String EMAIL = "antonio@gmail.com";
        //email = "toni@gmail.com"; Ya no te deja cambiarlo porque ya es constante (no varia)
        System.out.println(EMAIL);

    }
}
