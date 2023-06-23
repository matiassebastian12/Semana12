import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Selecciona una figura: ");
        System.out.println("1. Triángulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Círculo");
        System.out.print("Opción: ");
        int opcion = input.nextInt();

        switch (opcion) {
            case 1:
                calcularTriangulo();
                break;
            case 2:
                calcularCuadrado();
                break;
            case 3:
                calcularCirculo();
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }

        input.close();
    }

    public static void calcularTriangulo() {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa la base del triángulo: ");
        double base = input.nextDouble();
        System.out.print("Ingresa la altura del triángulo: ");
        double altura = input.nextDouble();

        Triangulo triangulo = new Triangulo(base, altura);
        double area = triangulo.calcularArea();
        double perimetro = triangulo.calcularPerimetro();

        System.out.println("El área del triángulo es: " + area);
        System.out.println("El perímetro del triángulo es: " + perimetro);

        input.close();
    }

    public static void calcularCuadrado() {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa el lado del cuadrado: ");
        double lado = input.nextDouble();

        Cuadrado cuadrado = new Cuadrado(lado);
        double area = cuadrado.calcularArea();
        double perimetro = cuadrado.calcularPerimetro();

        System.out.println("El área del cuadrado es: " + area);
        System.out.println("El perímetro del cuadrado es: " + perimetro);

        input.close();
    }

    public static void calcularCirculo() {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa el radio del círculo: ");
        double radio = input.nextDouble();

        Circulo circulo = new Circulo(radio);
        double area = circulo.calcularArea();
        double perimetro = circulo.calcularPerimetro();

        System.out.println("El área del círculo es: " + area);
        System.out.println("El perímetro del círculo es: " + perimetro);

        input.close();
    }
}
