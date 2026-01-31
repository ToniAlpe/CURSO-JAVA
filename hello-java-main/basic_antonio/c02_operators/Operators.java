package basic_antonio.c02_operators;

public class Operators {
    static void main() {

        //Operadores

        // Aritméticos

        // Si uno es decimal el otro tambien lo es
        //float a = 5;
        //var b = 3;

        var a = 5;
        var b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b); //Esto es el resto de la division

        // Asignación

        a = b;
        System.out.println(a);

        a = b * 2;
        System.out.println(a);

        a += 1; // a = a + 1; ( es lo mismo)
        System.out.println(a);

        a -= 1;
        System.out.println(a);
        a *= 2;
        System.out.println(a);
        a /= 2;
        System.out.println(a);
        a %= 2;
        System.out.println(a);

        // Comparación (Relacionales)

        // = (asignación) == (Comparación)
        // Te pone falso porque 6 no es igual que 3
        System.out.println(a == b);
        System.out.println(a == 0);
        // != (Diferente)
        System.out.println(a != b);
        System.out.println(a > b); // Mayor
        System.out.println(a >= b);
        System.out.println(a < b); // Menor
        System.out.println(a <= b);


        // Lógicos

        // && (y) (AND)
        // La expresión es verdadera si todas las partes son verdaderas
        System.out.println(true && true); //Unico verdadero
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println(3 > 2 && 5 == 2);
        //Verdadero y falso = falso

        // || (o) (OR)
        // La expresión es falsa si todas son falsas ( si hay algun verdadero nos va a dar verdadero)
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println(3 > 2 || 5 == 2);

        // ! (no) (NOT)
        System.out.println(!true);
        System.out.println(!false);

        //System.out.println(!3 > 2 || 5 == 2); //Falso or falso

        // Unarios

        System.out.println(+b);
        System.out.println(-b);
        System.out.println(++b); //Incrementa antes de imprimirlo
        System.out.println(b++); //Imprime y luego lo aumenta
        System.out.println(b); // 5
        System.out.println(--b);
        System.out.println(b--);

//        En este caso no importa si está a tras o delante ya que luego le digo que lo imprima (no hace falta comerse la cabeza, es mucho más facil)
//        b++;
//        System.out.println(b);

    }
}
