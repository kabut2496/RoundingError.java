/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roundingerror;
import javax.swing.*;
/**
 *
 * @author karl
 */
public class RoundingError {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        String gInput;
        double input,num1,num2,outPut;
       
        //user Input
        
        gInput = JOptionPane.showInputDialog("Please enter a number");
        input = Double.parseDouble(gInput);
        
        //Math
        num1 = Math.sqrt(input);
        num2 = num1*num1;
        
        outPut = Math.abs(num2 - num1);
        
        //outPuts
        
        System.out.println("the squar of the squar is " + num2);
        System.out.println("the round off error is " + outPut);
    }
    
}
