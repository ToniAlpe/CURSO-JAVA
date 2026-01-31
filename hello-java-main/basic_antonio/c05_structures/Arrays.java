package basic_antonio.c05_structures;
// "caja" donde puedes guardar variables o datos en lugar de crear cientos de variables por lo que es más eficiente
public class Arrays {
    static void main() {

       // Declaración y creación
       int[] numbers = new int[3];
       System.out.println(numbers);

       String[] names = {"Antonio", "Almagro", "Toni"};
       System.out.println(names);

       // Acceso

        System.out.println(numbers[0]);
        System.out.println(names[0]);

        System.out.println((new String[3]) [0]);
        // Se puede hacer en una linea en lugar de hacer lo de arriba

        // Modificación
        numbers[0] = 1;
        numbers[1] = 10;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        // numbers[3] = 2; Error porque ya no hay más espacio

        System.out.println(names[2]);
        names [2] = "toni@gmail.com";
        System.out.println(names[2]);

        // "Limpieza de datos"

        System.out.println(names.length);
        names [2] = null;
        System.out.println(names[2]);
        System.out.println(names.length);

        //numbers [2] = null; Error, Tipo de dato primitivo no es compatible con null

        // Como el boolean es un tipo de dato primitivo el programa lo inicializa, es decir, le asigna un valor tal cual como en el int que antes daba 0 (programa lo inicializa asin)
        boolean[] booleans = new boolean[5];
        System.out.println(booleans[4]);
    }
}
