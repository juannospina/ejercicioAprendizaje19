/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que
una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada
de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package ejercicioaprendizaje19;

import java.util.Scanner;

public class EjercicioAprendizaje19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int [][] matriz = new int [3][3];
        
     
        llenarMatriz(matriz, entrada);
        System.out.println("");
        antiSimetrica(matriz);
    }
    public static void llenarMatriz(int [][] matriz, Scanner entrada){
        for (int i = 0; i < 3; i++) {//llenar la matriz con valores solicitados por el usuario
            for (int j = 0; j < 3; j++) {
                System.out.print("Inserta un valor en la posición "+"["+i+"]"+"["+j+"]"+" de la matriz: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        System.out.println("Matriz original:");
        for (int i = 0; i < 3; i++) {//mostrar la matriz despues de haber llenado toda la matriz
            for (int j = 0; j < 3; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
    }
    public static void antiSimetrica(int [][] matriz){
        System.out.println("Matriz traspuesta:");
        for (int i = 0; i < 3; i++) {//mostrar matriz traspuesta
            for (int j = 0; j < 3; j++) {
                System.out.print("["+matriz[j][i]+"]");
            }
            System.out.println("");
        }
        for (int i = 0; i < 3; i++) {//verificar si efectivamente es anti simetrica o no
            for (int j = 0; j < 3; j++) {
                if(matriz[i][j] == matriz[j][i]){
                    System.out.println("La matriz es anti simétrica");
                    i = 3;// break no funciono, entonces se ponen igual a 3 para que no repita el mensaje
                    j = 3;
                }else{
                    System.out.println("La matriz no es anti simétrica");
                    i = 3;
                    j = 3;
                            
                }
            }
        }        
    }
}
