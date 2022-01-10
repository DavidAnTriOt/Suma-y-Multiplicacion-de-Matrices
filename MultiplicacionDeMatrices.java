/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplicaciondematrices;

import java.util.Scanner;
/**
 *
 * @author David
 */
public class MultiplicacionDeMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el numero de filas de la primera matriz: ");
        int f1 = sc.nextInt();
        System.out.println("Digite el numero de columnas de la primera matriz: ");
        int c1 = sc.nextInt();
        System.out.println("Digite el numero de filas de la segunda matriz: ");
        int f2 = sc.nextInt();
        System.out.println("Digite el numero de columnas de la segunda matriz: ");
        int c2 = sc.nextInt();
        System.out.println("--------------------------------------------------");
        System.out.println("------------La matriz 1 es de: "+f1+" x "+c1+"--------------");
        System.out.println("------------La matriz 2 es de: "+f2+" x "+c2+"--------------");
        System.out.println("--------------------------------------------------");
        if(c1 == f2){
            int[][] matriz1 = new int[c1][f1];
            int[][] matriz2 = new int[c2][f2];
            int[][] matrizRes = new int[f1][c2];
            //PRIMERA MATRIZ
            System.out.println("PRIMERA MATRIZ");
            for(int i = 0; i < f1; i++){
                for(int j = 0; j < c1; j++){
                    System.out.println("Digite los valores de las coordenadas "+i+","+j+":");
                    matriz1[i][j] = sc.nextInt();
                }
            }
            System.out.println("--------------------------------------------------");
            for(int i = 0; i < f1; i++){
                for(int j = 0; j < c1; j++){
                    System.out.print(matriz1[i][j]+" ");
                }
                System.out.println("");
            }
            System.out.println("--------------------------------------------------");
            //SEGUNDA MATRIZ
            System.out.println("SEGUNDA MATRIZ");
            for(int i = 0; i < f2; i++){
                for(int j = 0; j < c2; j++){
                    System.out.println("Digite los valores de las coordenadas "+i+","+j+":");
                    matriz2[i][j] = sc.nextInt();
                }
            }
            System.out.println("--------------------------------------------------");
            for(int i = 0; i < f2; i++){
                for(int j = 0; j < c2; j++){
                    System.out.print(matriz2[i][j]+" ");
                }
                System.out.println("");
            }
            //MATRIZ RESULTANTE
            System.out.println("-----------------EL RESULTADO ES:-----------------");
            for(int i = 0; i < f1; i++){
                for(int j = 0; j < c2; j++){
                    for(int h = 0; h < c1; h++){
                        matrizRes[i][j] += matriz1[i][h]*matriz2[h][j];
                    }
                    System.out.print(matrizRes[i][j]+" ");
                }
                System.out.println("");
            }
            
        }
        else{
            System.out.println("ERROR: El numero de columnas de la primera matriz debe ser igual al numero de filas de la segunda matriz");
        }
    }
}
