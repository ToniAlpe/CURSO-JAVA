package basic_antonio.c03_strings;

public class Strings {
    static void main() {

        // Cadenas de texto

        String name = "Antonio";
        // var name = "Antonio"; (Esto es un String ya que va entre comillas y por eso no hace falta especificar)
        var surname = new String("Almagro"); // Esto es una redundancia

        //Operaciones básicas

        // Concatenación
        System.out.println(name + " " + surname);

        // Longitud (length)
        System.out.println(name.length());

        // Obtener caracter
        System.out.println(name.charAt(0)); //A
        //System.out.println(name.charAt(name.length()-1)); //La primera posición ya no es 0
        //System.out.println(name.charAt(7)); //Esto no existe

        // Subcadena
        System.out.println(name.substring(2)); //a partir del indice 2 coge todo
        System.out.println(name.substring(1, 3)); //Excluye el valor del indice final

        // Mayúsculas y minúsculas
        System.out.println(name.toUpperCase()); //Todo mayuscula
        System.out.println(name.toLowerCase()); //Todo minsucula

        // Si hago esto ya estaré modificando la variable nombre
        //name = name.toUpperCase();

        //En ningún momento está guardando la variable por lo que la variables es la original que le he puesto, en este caso es Antonio
        System.out.println(name);

        // Comprobar si contiene
        System.out.println("Hola, Java".contains("Antonio"));
        System.out.println("Hola, Java".contains("ava"));
        System.out.println("Hola, Java".contains("AVA")); //Tiene que ser una coincidencia TOTAL por eso es falso
        System.out.println("Hola, Java".toUpperCase().contains("AVA")); //Esto es concatenar (visto anteriormente) ahora me daria un valor verdadero

        // Comparación
        System.out.println(name.equals("Antonio"));
        System.out.println(name.equals("antonio")); //Falso (no coincide)
        System.out.println(name.equalsIgnoreCase("antonio")); //Verdadero porque ignora las mayusculas y minusculas

        // == VS equals

        var a = "Antonio";
        var b = "Antonio";
        var c = new String("Antonio");
        System.out.println(a == b); //Verdadero porque el signo de igualdad hace una comparación del mismo objeto
        System.out.println(a == c); //Falso porque no es el mismo objeto que el de a y b (que los dos son iguales)
        System.out.println(a.equals(c)); //Verdadero porque el equals compara contenido, sin importar el objeto

        // Trim
        System.out.println(" Hola, me llamo Antonio ".trim()); //Elimina el espacio del principio y del final que he puesto antes

        // Replace
        System.out.println(" Hola, me llamo Antonio ".replace(" ", "")); //Se carga los espacios
        System.out.println(" Hola, me llamo Antonio ".replace("Antonio", "Toni"));

        // Format
        //Con esto puedes automatizar cosas, porque si yo cambio la edad se me cambia automaticamente y no tengo que cambiar nada
        var age = 18;
        //name ya esta definido arriba
        String.format("Hola, Antonio. Tengo 18 años");
        System.out.println(String.format("Hola, %s. Tengo %d años", name, age));

        /*Formatear
        %s --> Para una cadena de texto
        %d --> Para numeros enteros
        %f --> Para numeros decimales
        */
    }
}
