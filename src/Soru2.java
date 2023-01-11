
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
public class Soru2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Sayınızı giriniz");
        int N=input.nextInt();
        asalSayi(N);

    }
    public static void asalSayi(int sayi){
        int S=0;       
        for(int i=2;i<=sayi;i++){
            if(sayi%i==0){
                S=S+1;
            }
            if(S==0){
                System.out.println("Asal sayı giridiniz");
                break;
            }
            else{
                System.out.println("Asal degildir sayınız");
            }
        }
        
    }
    
}
