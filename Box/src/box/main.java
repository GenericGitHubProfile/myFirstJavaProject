/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package box;
import javax.swing.*;
/**
 *
 * @author up863207
 */
public class main {
    public static void main(String args[]){
        JFrame frame = new JFrame();
        JButton b1 = new JButton("Click");
        b1.setBounds(10, 10, 80, 40);//x, y, width, height.
        
        frame.add(b1);
        frame.setSize(400, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
