package basic_antonio.c08_oop;
// Clase: "Plantilla" para definir objetos
// acciones: metodos
// caracteristicas : atributos
public class Classes {
    static void main() {
        // Instanciar
        // No puedes poner la edad en negativo gracias al setter
        var person = new Person("Antonio", -18, "123456789A");

        //person.name = "Antonio";
        //person.age = 18;

        person.sayHello();

        // Esto se comporta como una variable por lo que puedes cambiar su valor

        person.name = "Toni"; //(ya no se puede aceder ya que lo tengo en private o si lo pones)
        //person.age = 19;

        System.out.println(person.name);
        //System.out.println(person.age);

        //person.id = "123456789A";

        System.out.println(person.getId());

        person.setAge(18);
        System.out.println(person.getAge());

        var person2 = new Person("Toni", 19, "123456789B");
        person2.sayHello();
    }
}