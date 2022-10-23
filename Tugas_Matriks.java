/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan_array;

import java.util.Arrays;

/**
 *
 * @author ALEXIS
 */
public class Tugas_Matriks {
    public static void main(String[] args) {
        
        int[][] matriks_a = {
            {2,4},
            {1,5},
        };
        
        int[][] matriks_b = {
            {1,5},
            {3,2},
        };
        printArray(matriks_a);
        printArray(matriks_b);
        
        int baris_a = matriks_a.length;
        int kolom_a = matriks_a[0].length;
        
        int[][] hasil = new  int[baris_a][kolom_a];
        
        for (int i=0; i<baris_a; i++){
            for (int j=0; j<kolom_a; j++){
                hasil[i][j] = matriks_a[i][j] + matriks_b[i][j];
            }
        }
        printArray(hasil);
    }
    
    private static void printArray(int[][] dataArray){
        int baris = dataArray.length;
        int kolom = dataArray[0].length;
        
        for(int i=0; i < baris; i++){
            System.out.print("[");
            for(int j=0; j<kolom; j++){
                System.out.print(dataArray[i][j]);
                
                if (j < (kolom -1)){
                    System.out.print(",");
                } else {
                    System.out.print("]");
                }
            }
            System.out.print("\n");
        }
        System.out.println("\n");
    }
}
