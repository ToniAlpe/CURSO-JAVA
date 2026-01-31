package basic_antonio.c08_oop;
// Esto es una clase de Classes (valga la redundancia)
public class Person {

    // Atributos
    protected String name;
    private int age;
    final private String id;

    // Constructor (lo puedes crear con generate)

    public Person(String name, int age, String id) {
        this.name = name;
        this.setAge(age);
        this.id = id;
    }

    // Métodos
    public void sayHello(){
        //this.id = "fgrlihgrdljhrd"; //No te deja modificarla dentro de la clase porque es final
        System.out.println("Hola, soy " + name + " y tengo " + age + " años y mi id es: " + id);
    }

    // Getter (utilizando generate)
    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    // Setter (utilizando generate)
    public void setAge(int age) {
        if (age > 0){
            this.age = age;
        } else {
            System.out.println("Edad no válida");
        }
    }
}