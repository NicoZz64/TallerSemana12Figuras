import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double lado1, lado2, lado3, radio;

        do {
            System.out.println("Menú:");
            System.out.println("1. Triángulo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Círculo");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el lado 1 del triángulo: ");
                    lado1 = scanner.nextDouble();
                    System.out.print("Ingrese el lado 2 del triángulo: ");
                    lado2 = scanner.nextDouble();
                    System.out.print("Ingrese el lado 3 del triángulo: ");
                    lado3 = scanner.nextDouble();
                    Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
                    System.out.println("¿Qué desea calcular?");
                    System.out.println("1. Área");
                    System.out.println("2. Perímetro");
                    int opcionTriangulo = scanner.nextInt();
                    if (opcionTriangulo == 1) {
                        System.out.println("El área del triángulo es: " + triangulo.calcularArea());
                    } else if (opcionTriangulo == 2) {
                        System.out.println("El perímetro del triángulo es: " + triangulo.calcularPerimetro());
                    }
                    break;
                case 2:
                    System.out.print("Ingrese el lado del cuadrado: ");
                    lado1 = scanner.nextDouble();
                    Cuadrado cuadrado = new Cuadrado(lado1);
                    System.out.println("¿Qué desea calcular?");
                    System.out.println("1. Área");
                    System.out.println("2. Perímetro");
                    int opcionCuadrado = scanner.nextInt();
                    if (opcionCuadrado == 1) {
                        System.out.println("El área del cuadrado es: " + cuadrado.calcularArea());
                    } else if (opcionCuadrado == 2) {
                        System.out.println("El perímetro del cuadrado es: " + cuadrado.calcularPerimetro());
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el radio del círculo: ");
                    radio = scanner.nextDouble();
                    Circulo circulo = new Circulo(radio);
                    System.out.println("¿Qué desea calcular?");
                    System.out.println("1. Área");
                    System.out.println("2. Perímetro");
                    int opcionCirculo = scanner.nextInt();
                    if (opcionCirculo == 1) {
                        System.out.println("El área del círculo es: " + circulo.calcularArea());
                    } else if (opcionCirculo == 2) {
                        System.out.println("El perímetro del círculo es: " + circulo.calcularPerimetro());
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
            System.out.println();
        } while (opcion != 0);
    }
}