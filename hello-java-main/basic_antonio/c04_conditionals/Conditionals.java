package basic_antonio.c04_conditionals;

public class Conditionals {
    static void main() {

        // Condicionales

        var age = 18;
        /* Como esto es false, el if no lo coge, solo coge los valores true
        System.out.println(age < 18); */

        //if (age >= 18)
        //Esto no se puede hacer en el caso de abajo porque el if una vez que cumple algo en orden de arriba abajo ya se sale, es decir, no comprueba lo demás por eso hay que cambiarlo y quitar el =

        if (age > 18) {
            System.out.println("El usuario es mayor de edad");
        } else if (age == 18) {
            System.out.println("El usuario acaba de cumplir 18");
        } else  {
            System.out.println("El usuario es menor de edad");
        }

        // switch
        // No se establece una condición, estamos inspeccionando el valor de una variable e igulandolo a diferentes cases

        var day = 4;
        //IMPORTANTE: En el switch no hace falta poner un break en la ultima instrucción
        switch (day) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            default:
                System.out.println("No es lunes, martes o miercoles");
        }
    }
}