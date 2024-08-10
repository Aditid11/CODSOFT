import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

class studentGradeCalculator extends JFrame{
   studentGradeCalculator(){
       super("Grade Calculator");
       setDefaultLookAndFeelDecorated(true);
       Image icon = Toolkit.getDefaultToolkit().getImage("D:\\icon.png");
       getContentPane().setBackground(new Color(234, 215, 157));
       setLayout(null);
       setSize(850,600);
       setLocation(360,120);
       setVisible(true);
   }
    public static void main(String[] args) {
     new studentGradeCalculator();
   }
}