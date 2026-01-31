package basic_antonio.c10_extras;
//RECOMENDADO
import basic_antonio.c08_oop.Classes; // Import clase
import basic_antonio.c08_oop.Person; // Import clase persona

import java.util.Scanner;

// NO RECOMENDADO
//import basic_antonio.c08_oop.*; //Para importar todo de ese paquete

public class Extras {

    // Definir variable global
    static String globalName = "Antonio";

    static void main() {

        // Extras

        // null

        String name = "Antonio";
        name = null; //Ya no es una cadena de texto ya seria un objeto (ausencia de valor)
        if (name != null) {
            System.out.println(name.toLowerCase());
        }

        // import (puedes usar una clase de afuera)

        new Person("Antonio", 19, "1");
        new Classes();

        // Scanner

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        int age = sc.nextInt(); // Va a leer la entrada y su es un entero lo guarda

        System.out.println("La edad es: " + age);

        // Scope (ambito de actuación de las variables, en este caso) (local la que tenemos dentro del ambito de actuación del main) (global la tienes que ddefinir antes del main y la puedes utilizar en todo el programa)

        test();

        // static (pertenece a la clase y no a la instancia) (no hace falta instanciarlo)
    }

    public static void test() {
        System.out.println(globalName);
    }
}

// Locales --> Variables declaradas dentro de un metodo
// Globales --> Fueran de los metodos (aunque claro dentro de la clase)