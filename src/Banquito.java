import java.util.Scanner;

public class Banquito {
    public static void main(String[] args) {

        String cliente = "Tony Stark";
        String cuenta = "Corriente";
        double saldo = 1599.99;
        int opcion = 0;

        String mensajeInicial = String.format("""
                *******************************
                ¡BIENVENIDO A MI BANQUITO!
                *******************************
                
                Nombre del cliente: %s
                Tipo de cuenta: %s
                Saldo disponible: $ %.2f
                
                *******************************
                """, cliente, cuenta, saldo);

        String mensajeOpciones = String.format("""                
                
                *** Escriba el número de la opción deseada ***
                1 - Consultar Saldo
                2 - Retirar 
                3 - Depositar
                9 - Salir
                """);

        System.out.println(mensajeInicial);
        Scanner teclado = new Scanner(System.in);

        while(opcion != 9){
            System.out.println(mensajeOpciones);
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Su saldo es: $" + saldo);
                    break;
                case 2:
                    System.out.println("¿Cuál es el valor a retirar?");
                    double retiro = teclado.nextDouble();

                    if (saldo >= retiro){
                        saldo -= retiro;
                        System.out.println("Saldo restante: $" + saldo);
                    }else{
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3:
                    System.out.println("¿Cuál es el valor a depositar?");
                    double deposito = teclado.nextDouble();
                    saldo += deposito;
                    System.out.println("Su nuevo saldo es $" + saldo);
                    break;
                case 9:
                    System.out.println("Finalizando el programa. Muchas gracias por usar Mi Banquito.");
                    break;
                default:
                    System.out.println("Opción no válida, seleccione otra opción.");
            }
        }


    }
}
