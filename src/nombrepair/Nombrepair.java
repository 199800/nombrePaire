/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nombrepair;
import java.io.Console;
import java.util.Scanner;
/**
 *
 * @author minthuen
 */
public class Nombrepair {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        // TODO code application logic here
       
        int nombre;
        System.out.println("entrez un nombre");
        nombre=sc.nextInt();
        
        int i=0;       
        for(i=1; i <= nombre - 1;i++){
            if(i % 2 == 1)
                System.out.print(i + " ");
        }
    }
    
}
