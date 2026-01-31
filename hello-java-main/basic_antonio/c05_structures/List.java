package basic_antonio.c05_structures;

import java.util.ArrayList;
// Se recomienda trabajar con esto porque ya no es necesario predefinir el tamaño para guardar variables (reservar memoria)
// Es más flexible que el array (ArrayList), no hace falta declarar el tamaño fijo
public class List {
    static void main() {

        // Declaración y creación
        // No puedes utilizar variables tipo primitivo
        ArrayList<String> names = new ArrayList<>(); //FORMA CLASICA
        var numbers = new ArrayList<Integer>(); //FORMA MODERNA //Integer --> int

        // Tamaño (ocupa lo justo y necesario para que funcione la variable)

        System.out.println(names.size());

        // Añadir elementos

        //names[0] = "Antonio"; Esto pretenece a los Arrays, no sirve ya que en los arrayslist no tienen un indice como los arrays ya que estos te lo "automatiza" para que funcione lo justo y lo necesario

        names.add("Antonio"); //Ya ocupa 1 en lugar de 0 (se adapta)
        names.add("Almagro"); //Ocupa 2
        names.add("Toni");
        System.out.println(names.size());

        // Acceder a los elementos

        //System.out.println(names[0]); Lo mismo que lo de arriba, esto es una nomenclatura de los arrays no sirve para los arrayslist
        //Y tampoco funciona con numbers

        System.out.println(names.getFirst());
        System.out.println(names.get(1)); //RECUERDA esto va por indices la primera posicion es 0, la segunda es 1...
        System.out.println(names.getLast());
        // Son estructuras ordenadas

        // Modificar los elementos

        names.set(2, "toni@gmail.com");
        System.out.println(names.getLast());

        // Eliminar elementos

        names.remove(2);
        //System.out.println(names.get(2)); Error, ya no existe ese indice

        //Ahora solo tenemos 2 elementos
        System.out.println(names.size()); //Ahora es 2, que son los siguientes:
        System.out.println(names.getFirst());
        System.out.println(names.getLast());

        // Buscar elementos

        // Esto te da valores verdaderos y falsos como el boolean, esto lo he visto anteriormente
        System.out.println(names.contains("Antonio"));
        System.out.println(names.contains("toni@gmail.com"));

        // Limpiar ArrayList

        names.add("Antonio");
        System.out.println(names);
        names.clear();
        System.out.println(names.size()); //Ya no ocupa nada

        System.out.println(names);
    }
}
