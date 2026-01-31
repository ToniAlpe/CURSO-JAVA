package basic_antonio.c05_structures;
//Es una lista DESORDENADA, NO REPITE datos, es RAPIDISIMO
import java.util.HashSet;

public class Set {
    static void main() {

        // Declaración y creación
        //Lo mismo que con ArrayList pero con HashSet
        HashSet<String> names = new HashSet<>();
        var numbers = new HashSet<Integer>();

        // Tamaño (lo mismo)

        System.out.println(names.size());

        // Añadir elementos (lo mismo)

        names.add("Antonio");
        names.add("Almagro");
        names.add("Toni");
        names.add("toni@gmail.com");
        System.out.println(names.size());

        // Acceder a los elementos (NO) (Esto es diferente)
        // Si no puedes acceder a los elementos no puedes modificarlos
        System.out.println(names);

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // ERROR

        /*System.out.println(names.getFirst());
        System.out.println(names.get(1));
        System.out.println(names.getLast());*/
        // No puedes hacer esto ya que el set ya no es una lista ordenada como el ArrayList (ya es DESORDENADA)

        // Eliminar elementos

        names.remove("Antonio"); //No l epuedes pasar l aposicion del indice (DESORDENADO)
        System.out.println(names.size()); //Ahora es 3 (antes habia 4)

        // Buscar elementos
        //Si puedes hacerlo (lo busca más rapido ya que en el ARRAYList tiene que ir uno por uno)
        System.out.println(names.contains("Antonio"));
        System.out.println(names.contains("toni@gmail.com"));


        // NO PERMITE REPETIDOS (el ArrayList SI te deja)
        System.out.println(names);
        names.add("Almagro");
        names.add("Almagro");
        names.add("Almagro");
        System.out.println(names);

        // Conjuntos

        // names.addAll(numbers); Error por incompatibilidad de datos no puedes declarar una variable String y ponerle un número o viceversa

        // Ahora si te deja porque los dos tipos de datos son una cadena de texto (String)
        var countries = new HashSet<String>();
        countries.add("España");
        countries.add("México");
        countries.add("Argentina");
        countries.add("Toni"); //Sigue conservando la NO REPETICIÓN

        names.addAll(countries);

        System.out.println(names);

        // Me cargo lo que no tenia en común
        //names.removeAll(countries);

        System.out.println(names);

        names.retainAll(countries); //Coge los elementos comunes, si está comentada el remove countries

        System.out.println(names);
    }
}
