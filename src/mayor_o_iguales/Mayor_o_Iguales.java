package mayor_o_iguales;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Mayor_o_Iguales {

  
    public static void main(String[] args) {
      /* Scanner leer = new Scanner(System.in);
       
       int n1, n2;
       System.out.println("Introduce un numero: ");
       //Realizaremos las lecturas de números enteros mediante el método .nextInt()
        n1 = leer.nextInt();
       System.out.println("Introduce otro numero: ");
       n2 = leer.nextInt();
       
       if(n1==n2){
           System.out.println(n1 + " y " + n2 +" Son iguales");
       }else{
           if(n1>n2){
               System.out.println(n1+ " Es mayor que: " + n2);
           }else{
              System.out.println(n2+ " Es mayor que: " + n1);  
           }
       }*/
        
        int n1,n2;
        String recibir;
        
        recibir = JOptionPane.showInputDialog("Introduce un numero: ");
        n1 = Integer.parseInt(recibir);
        recibir = JOptionPane.showInputDialog("Introduce otro numero: ");
        n2 = Integer.parseInt(recibir);
        
        if(n1==n2){
           JOptionPane.showMessageDialog(null,n1 + " y " + n2 +" Son iguales");
       }else{
           if(n1>n2){
              JOptionPane.showMessageDialog(null,n1+ " Es mayor que: " + n2);
           }else{
              JOptionPane.showMessageDialog(null,n2+ " Es mayor que: " + n1);  
           }
       }
    }
}
