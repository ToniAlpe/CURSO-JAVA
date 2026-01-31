package basic_antonio.c05_structures;
// (CLAVE, VALOR), DESORDENADO
import java.util.HashMap;

public class Maps {
    static void main() {

        // Declaración y creación

        //HASH --> DESORDENADO
        //Lo mismo que con List pero con HashMap (<tipo de dato de la clave, tipo de dato del valor> nombre del email
        HashMap<String, String> names = new HashMap<>();
        var numbers = new HashMap<Integer, String>(); //Si quiero que sea el numro de telefono asociados a un nombre

        // Tamaño (lo mismo)

        System.out.println(names.size());

        // Añadir elementos (Diferente) (CLAVE; VALOR)

        names.put("Antonio", "antonio@gmail.com");
        names.put("Almagro", "almagro@gmail.com");
        names.put("Toni", "toni@gmail.com");
        System.out.println(names.size());
        System.out.println(names);

        // Acceder a los elementos (solo clave)

        System.out.println(names.get("Almagro")); //Accedes al elemento por clave te da el valor
        System.out.println(names.get("Alm")); //Te da null porque no existe esa clave

        // Verificar elementos (comprobar si existen) (puedes buscar la clave o el valor)

        System.out.println(names.containsKey("Almagro"));
        System.out.println(names.containsKey("Alm"));

        System.out.println(names.containsValue("almagro@gmail.com"));

        // Eliminar elementos (clave) y (clave, valor) (esta ultima no es muy comun)

        System.out.println(names.remove("Almagro"));
        System.out.println(names.remove("Antonio")); //Lo eliminas pero aun asi te retorna el valor ("borrado seguro)
        System.out.println(names);

        // Limpiar HashMap

        names.clear();
        System.out.println(names);

        //Modificación de elementos
        // Si hacemos un put de una clave que ya existe estamos haciendo una modificación del valor de esa clave
        names.put("Antonio", "antonio@gmail.com");
        System.out.println(names);

        names.put("Antonio", "antonio07@gmail.com");
        System.out.println(names);

        //names.put("Almagro", "almagro@gmail.com"); //Lo añade
        //System.out.println(names);

        names.replace("Almagro", "almagroperez@gmail.com"); // Reemplaza el valor si existe (no lo cambia porque no existe)
        System.out.println(names);

        names.putIfAbsent("Almagro", "almagro@gmail.com"); // Reemplaza el valor aunque NO exista
        System.out.println(names);

        // Otras operaciones

        System.out.println(names.isEmpty()); //Comprueba si está vacia
        System.out.println(names.values()); // Lista que nos devuelve una colleción de valores

        var values = names.values();
        System.out.println(values);
    }
}
