/**
  *Karl Butler
 *2/18/2020
 * AreaOfTriangle
 * used to find the different of the square of the square of a number
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
        //variables gInput is used to get the users number and the rest of the veriables are used for all the math 
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
