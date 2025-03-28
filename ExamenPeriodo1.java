import java.util.Scanner;

public class ExamenPeriodo1 {

    public static void main(String[] args) {

        //Primera Serie
        
        Scanner scanner= new Scanner(System.in);
        int opciones;

         //Lista de Opciones 

        String opcion [] = {

        "[1] La suma de un número y su triple",
        "[2] El doble de un número menos cinco",
        "[3] La mitad de un número más su cuadrado",
        "[4] La suma de un número, su doble y su triple",
        "[5] Salir"

        };

        switch (opciones) {
            case 1: System.out.print("Ingrese un número: ");
            int x = scanner.nextInt();
            int suma1 = x + 2 * x + 3 * x;
            System.out.println("Resultado: " + suma1);
                
                break;

            case 2: System.out.println("Ingrese un número: ");
            double i = scanner.nextInt();
            double sum2 = 2 * x - 5 * x;
            System.out.println("Resultado" + sum2);

            break;

            case 3: System.out.println("Ingrese el número");
            int y = scanner.nextInt();
            int suma3 = 2 / + x * x;
            System.out.println("Resultado" + suma3);
             break;

             case 4: System.out.println("Ingrese el número");
             int h = scanner.nextInt();
             int suma4 = x + 2 * x * + 3 x
             System.out.println("Resultado" + suma4);
        
            default:
                break;
        }

        //Segunda Serie

        do {
            int opcione;

            System.out.println("|[a] Calcular el promedio");
            System.out.println("![b] Saludar por tu nombre");
            System.out.println("|[c] Di hola mundo");
            System.out.println("|[d] Salir");

            


            System.out.println("Salir" + opcione);
            opcione++;
            
        } while (opciones != 0 );

        //Tercera Serie


        }

    }
