package ejercicios.pkgfor.y.switch_carlosflores;

import java.util.Scanner;


public class EjerciciosForYSwitch_CarlosFlores {


    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        boolean ok = true;
        
        do{
            System.out.println("---MENU");
            System.out.println("1)¿Cuántos números pares e impares hay entre este rango?\n2)Triángulos y más Triángulos\n3)Anita lava la tina\n4)Codigos secretos\n5)Salir");
            System.out.print("Ingrese una opcion:");
            int op = leer.nextInt();
            switch(op){
                
                case 1:{
                    System.out.println("\n---¿Cuántos números pares e impares hay entre este rango?");
                }//fin case 1
                
                case 2:{
                    System.out.println("\n---Triángulos y más Triángulos");
                    int op_intern = 0;
                    while(){
                        System.out.println("---SUBMENU");
                        System.out.println("1)Triangulo equilatero\n2)Triangulo rectangulo\n3)Salir");
                        op_intern = leer.nextInt();
                    sw
                }//fin case 2
                
                case 3:{
                    System.out.println("\n---Anita lava la tina");
                }//fin case 3
                
                case 4:{
                    System.out.println("\n---Codigos secretos");
                }//fin case 4
                
                case 5:{
                    System.out.println("\nSalio del programa, nos vemos.");
                    ok = false;
                }//fin case 5
                
                default:{
                    System.out.println("\nOpcion no valida");
                }//fin default
                
            }//fin switch

        }while(true);
    }//fin main
    
}//fin class
