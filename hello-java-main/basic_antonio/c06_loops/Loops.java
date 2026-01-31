package basic_antonio.c06_loops;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Loops {
    static void main() {

        // Loops

        // - for controlado por contador

        // for(Valor de la variable; condicion; suma de la variable)
        // Si no le indicas cuando acabar (bucle infinito)
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hola, Java!");
        }

        // Con esto puedo imprimir por pantalla los datos del array de manera automatizada
        String[] names = {"Antonio", "Almagro", "Toni"};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // for-each (ideal para recorrer arrays o listas)

        // for(nombre variable (la que tu quieras): variable asociada al array o lista)
        for (String name: names) {
            System.out.println(name);
        }

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        for (Integer number: numbers) {
            System.out.println(numbers);
        }

        HashMap<String, String> emails = new HashMap<>();
        emails.put("Antonio", "antonio@gmail.com");
        emails.put("Almagro", "almagro@gmail.com");
        emails.put("Toni", "toni@gmail.com");

        for (Map.Entry<String, String> email: emails.entrySet()) {
            System.out.println(email.getKey()); //Imprimir solo el nombre
            System.out.println(email.getValue()); //Imprimir solo el corrreo
        }

        // - while

        int i = 0;
        while(i < 5){
            System.out.println("Hola, Java!");
            i++;
        }

        i = 0;
        while(i < names.length){
            System.out.println(names[i]);
            i++;
        }

        i = 0;
        boolean find = false;
        while(!find){
            System.out.println(names[i]);
            if (names[i].equals("Almagro")){
                find = true;
            }
            i++;
        }

        // - do-while (se ejecuta la primera vez siempre)

        i = 0;
        do {
            System.out.println("Hola, Java!");
            i++;
        }    while(i < 5);

        // Control de bucles

        // - break

        for (String name: names) {
            if (name.equals("Almagro")){
                break;
            }
            System.out.println(name);
        }

        // - continue

        for (int j = 1; j <= 5; j++) {
            if(j == 3){
                continue; // Has llegado aquí, pues comienza con el siguiente, es decir, el 3 no se va a imprimir se va a imprimir el siguiente es como que lo fuerza
            }
            System.out.println(j);
        }
    }
}
