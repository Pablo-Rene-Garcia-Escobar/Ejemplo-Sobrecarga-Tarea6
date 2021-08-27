package EjemploSobrecarga;

import java.util.Scanner;

public class TestEjemploSobreCarga {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        double a = in.nextDouble();

        System.out.println("Ingrese otro numero");
        double b = in.nextDouble();
        
        EjemploSobrecargaDeMetodos sm = new EjemploSobrecargaDeMetodos(a, b);

        System.out.println("Ingrese el numero de la accion que quiere realizar");
        System.out.println("1: Sumar ambos numeros");
        System.out.println("2: Sacar la raiz del primer numero sobre el otro");
        int op = in.nextInt();

        switch (op) {
            case 1:                
                System.out.println(a + " + " + b + " = " + sm.operar());
                break;

            case 2:                
                System.out.println("Raiz " + a + " de " + b + " = " + sm.operar(a, b));
                break;

        }
    }

}
