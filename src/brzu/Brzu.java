
package brzu;

import javax.swing.JOptionPane;


public class Brzu {

    
    public static void main(String[] args) {
        
        String str;
        str = JOptionPane.showInputDialog(null ,"Enter an integer:","Input",JOptionPane.QUESTION_MESSAGE);
        
        int num=Integer.parseInt(str);
        
        if (num%2==0) {
            JOptionPane.showMessageDialog(null,"That number is even","Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "That number is odd","Message",JOptionPane.INFORMATION_MESSAGE);
        }
        
       int option = JOptionPane.showConfirmDialog(null,"Do another?","Select an option",JOptionPane.YES_NO_CANCEL_OPTION);
       System.exit(0);
       
//        if (option == JOptionPane.YES_OPTION) {
//            JOptionPane.showMessageDialog(null, JOptionPane.showInputDialog(str+num));
//        }
//            else if(option== JOptionPane.NO_OPTION){
//            System.exit(0);        
//            }       

        
    }
    
}
