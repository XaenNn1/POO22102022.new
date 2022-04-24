/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package pruebaejemplo;
import java.util.Scanner;
/**
 *
 * @author abner
 */
public class Cuentahabiente {
    
    String idCliente;
    String nombre;
    float balance, monto; // dinero que tiene ahorrado
    
      public void retirarDinero( float monto ){
        //código para restarle el monto al balance
         
        
        if (balance >= 50000){
            System.out.println("Cliente Regular");
        }else{
            System.out.println("Cliente Premium");
        }
     
            
  }
}    

