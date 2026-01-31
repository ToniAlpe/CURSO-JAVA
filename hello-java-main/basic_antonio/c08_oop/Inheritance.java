package basic_antonio.c08_oop;
// Superclase (clase padre) subclases (clases hijos)
public class Inheritance {
    static void main() {

        // Herencia (extends) ("es un")

        var animal = new Animal("Mi animal");
        //animal.name = "Mi animal";
        animal.eat();

        var dog = new Dog("Kira", 7);
        //dog.name = "Kira";
        dog.eat();

        var cat = new Cat("Minisiku");
        //cat.name = "Minisiku";
        cat.eat();

        var bird = new Bird("Poli");
        //bird.name = "Poli";
        bird.eat();
        bird.fly();
    }

    public static class Animal {

        String name;

        public Animal(String name) {
            this.name = name;
        }

        public void eat(){
            System.out.println("El animal con nombre " + name + " está comiendo");
        }
    }

    public static class Dog extends Animal {

        int age;

        public Dog(String name, int age) {
            super(name);
            this.age = age;
        }

        public void eat(){
            System.out.println("El perro con nombre " + name + " está comiendo");
        }
    }

    public static class Cat extends Animal {

        public Cat(String name) {
            super(name);
        }

        public void eat(){
            System.out.println("El gato con nombre " + name + " está comiendo");
        }
    }

    public static class Bird extends Animal {

        public Bird(String name) {
            super(name);
        }

        public void eat(){
            System.out.println("El pájaro con nombre " + name + " está comiendo");
        }

        public void fly(){
            System.out.println("Está volando");
        }
    }
}
