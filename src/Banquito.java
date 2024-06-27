import java.util.Scanner;

public class Banquito {
    public static void main(String[] args) {

        String cliente = "Tony Stark";
        String cuenta = "Corriente";
        double saldo = 1000;
        int opcionSalida = 0;

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
                """, cliente, cuenta, saldo);

        System.out.println(mensajeInicial);

        while(opcionSalida != 9){
            System.out.println(mensajeOpciones);
            Scanner teclado = new Scanner(System.in);
            int opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Su saldo es: $" + saldo);
                    break;
                case 2:
                    System.out.println("¿Cuál es el saldo que desea retirar?");
                    Scanner tecladoRetiro = new Scanner(System.in);
                    int retiro = tecladoRetiro.nextInt();

                    if (saldo >= retiro){
                        saldo = saldo - retiro;
                        System.out.println("Saldo restante: $" + saldo);
                    }else{
                        System.out.println("Saldo insuficiente.");
                    }

                    break;
                case 3:
                    System.out.println("¿Cuál es el valor a depositar?");
                    Scanner tecladoDeposito = new Scanner(System.in);
                    int deposito = tecladoDeposito.nextInt();
                    saldo = saldo + deposito;
                    System.out.println("Su saldo actualizado es $" + saldo);
                    break;
                case 9:
                    System.out.println("Finalizando el programa. Muchas gracias por usar Mi Banquito.");
                    opcionSalida = 9;
                    break;
                default:
                    System.out.println("Opción no válida, seleccione otra opción.");
            }
        }


    }
}
