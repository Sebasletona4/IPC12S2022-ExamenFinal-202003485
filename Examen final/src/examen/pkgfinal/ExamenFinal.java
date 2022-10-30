package examen.pkgfinal;

import java.util.Scanner;


public class ExamenFinal {


public static void main(String[] args) {
          while (true) {
            System.out.println("\n\n\n\n");
            int x = 0;
            System.out.println("MENU");
            System.out.println("1. Ejercicio1");
            System.out.println("2. Ejercicio2");
            System.out.println("3. Ejercicio3");
            System.out.println("4. Salir");
            System.out.print("Ingrese el número de ejercicio que desea realizar: ");
        
            Scanner scan = new Scanner(System.in);
            x = scan.nextInt();

            switch (x) {
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
        int num = 8;
    int pesomax = 1000;
    int[] pesovacas = {223,243,100,200,200,155,300,150};
    int[] prod = {30,34,28,45,21,50,29,1};
    for (int i = 0; i < prod.length; i++){
        for (int j = 0; j < prod.length; j++){
            if(prod[j]>j+1){
                int temp = prod[j];
                prod[j] = prod[j]+1;
                prod[j+1] = temp;
                int tempor = pesovacas[j+1];
                pesovacas[j+1] = tempor;
            }
        }
    }
    int peso = 0;
    int litros = 0;
    for (int j = prod.length-1; j>= 0; j--){
        peso = peso+pesovacas[j];
        litros = litros+prod[j];
        if(peso > pesomax){
            peso = peso-pesovacas[j];
            litros = litros-prod[j];
            break;
        }
    }
        System.out.print("Litros " +litros);
        System.out.print("Peso " +peso);
    
    }
    
    }
    
