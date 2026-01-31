package basic_antonio.c07_functions;

import java.util.ArrayList;
import java.util.Arrays;

public class Functions {
    static void main() {

        // Funciones

        for (int i = 1; i <= 5; i++) {
            sendEmail();
            //No puedes llamarlo porque si estas dentro de un static tienes que llamarlo de otro static (si lo modifico ya me deja)
        }

        // ...

        sendEmail();

        sendEmailToUser("antonio@gmail.com");
        sendEmailToUser("antonio@gmail.com", "Antonio");

        // He creado un arraylist para que tenga mas de un correo y luego lo llamo desde la función (no pasa nada si no lo entiendes es solo que ha explicado la compatibilidad de tipos)
        var users = new ArrayList<>(Arrays.asList("Antonio@gmail.com", "Almagro@gmail.com"));
        sendEmailToUser(users);

        var state = sendEmailWithState("antonio@gmail.com");
        System.out.println(state);

        System.out.println(sendEmailWithState(""));
    }

    // Función sin parámetros ni retorno

    public static void sendEmail() {
        System.out.println("Se envia el email");
    }

    // Función con parámetros

    public static void sendEmailToUser(String email) {
        System.out.println("Se envia el email a " + email);
    }

    // Sobrecarga de funciones

    public static void sendEmailToUser(String email, String name) {
        System.out.println("Se envia el email a " + name + " (" + email + ")");
    }

    public static void sendEmailToUser(ArrayList<String> emails) {
        for (String email : emails) {
           sendEmailToUser(email); //Hace esto para que no se repita el codigo de la linea 42
        }
    }

    // Funciones con retorno

    // Se cambia el void por el tipo de dato que quiero retornar (ahora la funcion es distinta que la de arriba, pero aun así no funciona la sobrecarga de funciones)
    public static boolean sendEmailWithState(String email) {
        if(email.isEmpty()) {
            return false; //Despues del return no se inicia lo siguiente NUNCA
        }

        System.out.println("Se envia el email a " + email);
        return true;
    }
}
