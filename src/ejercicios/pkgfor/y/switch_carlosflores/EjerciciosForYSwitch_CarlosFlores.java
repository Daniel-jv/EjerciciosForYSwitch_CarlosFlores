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
                
                case 1:{/*
                    En el ejemplo, 0 cuenta como par, por lo tanto lo deje como par
                    */
                    System.out.println("\n---¿Cuántos números pares e impares hay entre este rango?");
                    System.out.print("Ingrese un numero: ");
                    int N = leer.nextInt();
                    int contP = 0;
                    int contI = 0;
                    for (int i = 0; i <= N; i++) {
                        if(i % 2  == 0){
                            contP++; 
                        }else{
                            contI++;
                        }
                    }
                    System.out.print("\nEntre 0 y "+N+" existen "+contP+" numeros pares y estos son: ");
                    int y = 0;
                    for (int i = 0; i <= N; i++) {
                        if(i % 2  == 0){
                            System.out.print(i);
                            if(y < contP-1){
                                System.out.print(",");
                            }
                            y++;
                        }
                    }
                    System.out.print("\nEntre 0 y "+N+" existen "+contI+" numeros impares y estos son: ");
                    int x = 0;
                    for (int i = 0; i <= N; i++) {
                        if(i % 2  != 0){
                            System.out.print(i);
                            if(x < contI-1){
                                System.out.print(",");
                            }
                            x++;
                        }
                    }
                    System.out.println("\n");
                    break;
                }//fin case 1
                
                case 2:{
                    System.out.println("\n---Triángulos y más Triángulos");
                    int op_intern = 0;
                    while(op_intern < 1 || op_intern > 3){
                        System.out.println("---SUBMENU");
                        System.out.println("1)Triangulo equilatero\n2)Triangulo rectangulo\n3)Salir");
                        op_intern = leer.nextInt();
                        if(op_intern < 1 || op_intern > 3){
                            System.out.println("Opcion no valida, intente de nuevo.");
                        }
                    }
                    switch(op_intern){
                        
                        case 1:{
                            System.out.println("---Triangulo equilatero");
                            System.out.print("Ingrese la altura:");
                            int alt = leer.nextInt();
                            int altern = alt;
                            for (int i = alt; i > 0; i--) {
                                int esp = 0;
                                for (int j = 0; j < alt;) {
                                    if(esp < altern/2){
                                        System.out.print(" ");
                                        esp++;
                                    }else{
                                        System.out.print("O");
                                        j++;
                                    }
                                }
                                altern--;
                                System.out.println();
                            }
                            break;
                        }
                        
                        case 2:{
                            System.out.println("---Triangulo rectangulo");
                            System.out.print("Ingrese la altura:");
                            int alt = leer.nextInt();
                            int limit = 1;
                            for (int i = 0; i < alt; i++) {
                                for (int j = 0; j < limit; j++) {
                                    System.out.print("O");
                                }
                                limit++;
                                System.out.println();
                            }
                            break;
                        }
                        
                        case 3:{
                            System.out.println("Salio del submenu, nos vemos");
                            break;
                        }
                        
                    }
                    break;
                }//fin case 2
                
                case 3:{
                    System.out.println("\n---Anita lava la tina");
                    System.out.print("Ingrese una palabra u oracion:");
                    leer.nextLine();
                    String cad = leer.nextLine();
                    cad = cad.toLowerCase();
                    String no_esp = "";
                    String veri = "";
                    for (int i = 0; i < cad.length();i++) {
                        if(cad.charAt(i) != ' '){
                            no_esp = no_esp + cad.charAt(i);
                        }
                    }
                    for (int i = cad.length(); i > 0;i--) {
                        if(cad.charAt(i-1) != ' '){
                            veri = veri + cad.charAt(i-1);
                        }
                    }
                    veri.toLowerCase();
                    boolean var = true;
                    for (int i = 0; i < no_esp.length(); i++) {
                        if(no_esp.charAt(i)!=veri.charAt(i)){
                            var = false;
                        }
                    }
                    System.out.println(no_esp);
                    System.out.println(veri);
                    if(var){
                        System.out.println("La palabra/oracion es palíndroma.");
                    }else{
                        System.out.println("La palabra/oracion no es palíndroma.");
                    }
                    System.out.println();
                    break;
                }//fin case 3
                
                case 4:{
                    System.out.println("\n---Codigos secretos");
                    System.out.println("Ingrese su codigo(formato:letraNumeroLetraNumero): ");
                    String cod = leer.next();
                    String resp = "";
                    boolean perm = true;
                    for (int i = 0; i < cod.length(); i++) {
                        if(i % 2 == 0 || i == 0){
                            if(cod.charAt(i) < (char) 122 && cod.charAt(i) > (char) 97){
                                int marg = cod.charAt(i+1)-48;
                                if(marg == 0){
                                    System.out.println("\nNo ingrese 0 ya que no imprime la letra, vuelva a intentar.");
                                    perm = false;
                                }
                                while(marg>0){
                                    resp += cod.charAt(i);
                                    marg--;
                                }
                            }else{
                                System.out.println("Porfavor ingrese el codigo segun el formato, \nletra minuscula y numero entre 1 y 9.Intente de nuevo.");
                                perm = false;
                                break;
                            }
                        }
                    }
                    if(perm){
                        System.out.print(resp);
                    }
                    System.out.println("");
                    break;
                }//fin case 4
                
                case 5:{
                    System.out.println("\nSalio del programa, nos vemos.");
                    ok = false;
                    break;
                }//fin case 5
                
                default:{
                    System.out.println("\nOpcion no valida");
                    break;
                }//fin default
                
            }//fin switch

        }while(true);//fin while
        
    }//fin main
    
}//fin class