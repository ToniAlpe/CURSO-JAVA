package basic_antonio.c08_test_oop;

import basic_antonio.c08_oop.Person;

// Clase: "Plantilla" para definir objetos
// acciones: metodos
// caracteristicas : atributos
public class Classes {
    static void main() {

        // Instanciar
        var person = new Person("Antonio", 18, "123456789A");

        //person.name = "Antonio";
        //person.age = 18;

        person.sayHello();

        // Esto se comporta como una variable por lo que puedes cambiar su valor

        //person.name = "Toni"; //(ya no se puede aceder ya que lo tengo en protected)
        //person.age = 19;

        //System.out.println(person.name);
        //System.out.println(person.age);

    }
}