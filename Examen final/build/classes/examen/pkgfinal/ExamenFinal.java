package examen.pkgfinal;

import java.util.Scanner;


public class ExamenFinal {


public static void main(String[] args) {
          while (true) {
            System.out.println("\n\n\n\n");
            int op = 0;
            System.out.println("MENU");
            System.out.println("1. Ejercicio1");
            System.out.println("2. Ejercicio2");
            System.out.println("3. Ejercicio3");
            System.out.println("4. Salir");
            System.out.print("Ingrese el número de ejercicio que desea realizar: ");
        
            Scanner scan = new Scanner(System.in);
            op = scan.nextInt();

            switch (op) {
                case 1:
                    Ejercicio1();
                    break;
                case 2:
                    Ejercicio2();
                    break;
                case 3:
                    Ejercicio3();
                    break;
                case 4:
                    System.out.println("Adios!!");
                    System.exit(0);
                default:
                    System.out.println("Opcion no valida, por favor, ingrese nuevamente");
                    break;
            }
        }

    }
    public static void Ejercicio1(){
    int num1;
    int num2;
    Scanner sc = new Scanner(System.in);
    System.out.println("EJERCICIO1");

    System.out.println("Ingrese el primer número: ");
    num1 = sc.nextInt();
    System.out.println("Ingrese el segundo número: ");
    num2 = sc.nextInt();
    
    if(num1 > num2){
        System.out.println("El número mayor es " + num1);
    }
        else{
        System.out.println("El número mayor es " + num2);
    }
    
    if(num1 < num2){
        System.out.println("El número menor es " + num1);
    }
        else{
        System.out.println("El número menor es " + num2);
    }
    }
    
    public static void Ejercicio2(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduzca el número de filas que desea (Solo números impares)");
    int num = sc.nextInt();
    sc.close();
    
    System.out.println();
    for (int alto = 1; alto <= num; alto++){
        for (int espacio= 1; espacio <= num-alto; espacio++){
            System.out.print(" ");
        }
        for (int asteriscos = 1; asteriscos <= (alto*2)-1; asteriscos++){
            System.out.print("*");
        }
    }
    System.out.println();
    }
    
    public static void Ejercicio3(){
    
    
    }
}
