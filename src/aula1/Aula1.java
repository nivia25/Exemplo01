
package aula1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Aula1 extends JFrame {
        Aula1()
   {
       setTitle("Primeira janela");
       setSize(400,50);
       setLocation(150,150);
       setResizable(true);
       getContentPane().setBackground(Color.gray);
   }        
 
    public static void main(String[] args) {
     JFrame janela = new Aula1();
     janela.setUndecorated(true);
     janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
     janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     janela.setVisible(true);
    }
    
}
