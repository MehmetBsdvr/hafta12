
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
public class Soru3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.println("İfadenizi giriniz");
        int N=input.nextInt();
        int[] dizi=new int[N];
        for(int i=0;i<N;i++){
            System.out.print("["+i+1+"] İndex giriniz: ");
            dizi[i]=input.nextInt();
        }
        diziLer(dizi);
    }
    public static int[] diziLer(int[] sayi){
        
        int g;
        for(int i=0;i<sayi.length-1;i++){
            for(int j=i+1;j<sayi.length;j++){
                if(sayi[j]<sayi[i]){
                    g=sayi[i];
                    sayi[i]=sayi[j];
                    sayi[j]=g;
                }
            }
            
        }
        for(int i=0;i<sayi.length;i++){
        System.out.println(sayi[i]+" ");
        }
        return sayi;
 
    }
    
}
