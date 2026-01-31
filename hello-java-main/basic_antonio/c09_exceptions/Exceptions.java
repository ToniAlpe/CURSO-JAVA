package basic_antonio.c09_exceptions;
// Try --> Poner codigo que sea susceptible al error (se ejecuta siempre hasta que falle)
// Catch --> Transpasar la ejecución al catch cuando haya un error en el try
// Finally --> Siempre se ejecuta exista o no exista un error
public class Exceptions {
    static void main() {

        // Manejo de excepciones

        // El programa arranca (no hay fallo de sintaxis) por eso la importancia de las excepciones ya que tu no quieres que tu programa se pare
        System.out.println("Hola");

        // try catch
        try {
            var result = 10 / 0; // No es capaz de resolverlo (lanza una excepción el propio java)
            System.out.println(result);
        // Exception --> Para capturar todas las excepciones (se utiliza esto si no estas seguro del tipo de excepción)
        // ArithmeticException --> Capturar las excepciones de tipo aritmetica (en este caso)
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
          // Esto es lo mismo que lo de arriba solo que especializo la excepción (lo identifico)
//        catch(ArithmeticException e) {
//            System.out.println("Error: " + e);
//        }

        // try con múltiples catch
        try {
            var result = 10 / 5; // No es capaz de resolverlo (lanza una excepción el propio java)
            System.out.println(result);

            var name = "Antonio";
            name = null;
            System.out.println("Name: " + name.toUpperCase());
        } catch(ArithmeticException e) {
            System.out.println("Cuidado con dividir algo que no puedes: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Ha ocurrido un null pointer mítico!");
        } catch (Exception e) {
            System.out.println("Se ha producido un error no esperado");
        }

        //finally
        try {
            var result = 10 / 0; // No es capaz de resolverlo (lanza una excepción el propio java)
            System.out.println(result);
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Fin del bloque try-catch");
        }

        // throw (Lanzar una excepción manualmente)
        var throwExample =  new ThrowExample();
        try {
            throwExample.checkAge(15);
        } catch(IllegalArgumentException e) {
            System.out.println("Error revisando la edad: " + e.getMessage());
        }

        // Excepción personalizada
        try {
            throwExample.checkScore(450);
        } catch (CustomException e) {
            System.out.println("Error revisando la puntuación: " + e.getMessage());
        }

        System.out.println("Fin");
        // (antes del try/catch) No se muestra ya que el error hace que el programa termine
    }
}
// Debug

// step over --> Ir linea por linea mi programa
// step into --> Si nosotros tenemos alguna operacion a distintos niveles y se puede inspeccionar pues la vamos a inspeccionar
// step out --> Para salirte
// Resume program --> Si tienes 2 puntos de ruptura pues empiezas en uno y acabas e el otro sin mirar el codigo que hay entre estas dos