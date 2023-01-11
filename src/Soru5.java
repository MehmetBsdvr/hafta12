
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mehmet
 */
public class Soru5 {
    static int N;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("Satır ve Sütun İndexlerini giriniz");
        N=input.nextInt();
        
        int[][] A=new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print("["+i+"]["+j+"] İndex giriniz:");
                A[i][j]=input.nextInt();
            }
        }
        diziLer(A);
 
    }
    public static int[] diziLer(int[][] matrix){
        
        int[] dizi=new int[N];
        for(int i=0;i<N;i++){
            dizi[i]=0;
            for(int j=0;j<N;j++){
                dizi[i]=dizi[i]+matrix[i][j];
            }
            System.out.println(dizi[i]+" ");
        }
        return dizi;
        
    }
    
    
}
