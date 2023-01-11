
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
public class soru6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Satır sayınızı giriniz");
        int N=input.nextInt();
        yılDızlar(N);
    }
    public static void yılDızlar(int yıldız){
        
        for(int i=1;i<=yıldız;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        
    }
    
}
