package basic_antonio.c08_oop;

public class Abstraction {
    static void main() {

        // Abstracción

        // - Clase abstracta (no se puede instanciar) (cuando hay que compartir código común)

        var dog = new Dog();
        dog.sleep();
        dog.sound();

        var cat = new Cat();
        cat.sleep();
        cat.sound();

        // - Interface (lo que definimos unicamente son solo los metodos a nivel de declaración y la implementación)
        // ()
    }

    // - Clase abstracta

    public static abstract class Animal {

        public abstract void sound();

        public void sleep() {
            System.out.println("Animal está durmiendo");
        }
    }

    public static class Dog extends Animal {

        @Override
        public void sound() {
            System.out.println("Guau");
        }

        @Override
        public void sleep() {
            System.out.println("El perro está durmiendo");
        }
    }

    public static class Cat extends Animal {

        @Override
        public void sound() {
            System.out.println("Miau");
        }
    }

    // - Interface (ahora es multiple) (no se puede instanciar)

    public interface Flying {

        void fly();
    }

    public interface Flying2 {

        void fly2();
    }

    public static class Bird extends Animal implements Flying {

        @Override
        public void sound() {
            System.out.println("Pio Pio");
        }

        @Override
        public void fly() {
            System.out.println("El pájaro vuela");
        }
    }

    public static class Bat extends Animal implements Flying, Flying2 {

        @Override
        public void sound() {
            System.out.println("Soy Batman!");
        }

        @Override
        public void fly() {
            System.out.println("El murciélago vuela");
        }

        @Override
        public void fly2() {
            System.out.println("El murciélago vuela2");
        }
    }
}
