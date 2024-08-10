import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Integer.parseInt;

class numberGame extends JFrame implements ActionListener {
    double generate_num=Math.random()%100+99;
    JLabel label4;
    JButton clear,Exit,NewGame,guess;
    JTextField enterText;


    numberGame(){
        super("Number Game");
        JFrame.setDefaultLookAndFeelDecorated(true);
        getRootPane().putClientProperty("JRootPane.titleBarBackground", new Color(23,180,252));
        getRootPane().putClientProperty("JRootPane.titleBarForeground", Color.white);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("logo/guess.jpg"));
        setIconImage(i1.getImage());
        Image i2=i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(50,20,100,100);
        add(image);

        JLabel label1=new JLabel("Guess the Number!");
        label1.setForeground(Color.WHITE);
        label1.setBounds(250,20,400,100);
        label1.setFont(new Font("Raleway",Font.BOLD,40));
        add(label1);

        JLabel label2=new JLabel("Enter the Number here");
        label2.setForeground(Color.BLACK);
        label2.setBounds(250,170,400,40);
        label2.setFont(new Font("Raleway",Font.BOLD,35));
        add(label2);

        enterText=new JTextField();
        enterText.setBounds(380,240,100,60);
        enterText.setFont(new Font("Raleway",Font.TYPE1_FONT,  30));
        add(enterText);

        JLabel label3=new JLabel("Result");
        label3.setForeground(new Color(4, 27, 138));
        label3.setBounds(250,310,400,30);
        label3.setFont(new Font("Raleway",Font.BOLD,20));
        add(label3);

        label4=new JLabel();
        label4.setForeground(new Color(4, 27, 138));
        label4.setBounds(300,310,400,30);
        label4.setFont(new Font("Raleway",Font.BOLD,20));
        add(label4);

        guess=new JButton("Guess");
        guess.setBounds(150,350,200,60);
        guess.setFont(new Font("Raleway",Font.BOLD,30));
        guess.setForeground(new Color(0xDDB640));
        guess.setBackground(Color.BLACK);
        guess.addActionListener(this);
        add(guess);

        Exit=new JButton("Exit");
        Exit.setBounds(550,350,200,60);
        Exit.setFont(new Font("Raleway",Font.BOLD,30));
        Exit.setForeground(new Color(0xDDB640));
        Exit.setBackground(Color.BLACK);
        Exit.addActionListener(this);
        add(Exit);

        NewGame=new JButton("New Game");
        NewGame.setBounds(150,420,200,60);
        NewGame.setFont(new Font("Raleway",Font.BOLD,30));
        NewGame.setForeground(new Color(0xDDB640));
        NewGame.setBackground(Color.BLACK);
        NewGame.addActionListener(this);
        add(NewGame);

        clear=new JButton("Clear");
        clear.setBounds(550,420,200,60);
        clear.setFont(new Font("Raleway",Font.BOLD,30));
        clear.setForeground(new Color(0xDDB640));
        clear.setBackground(Color.BLACK);
        clear.addActionListener(this);
        add(clear);


        getContentPane().setBackground(new Color(0xE23B3D57, true));
        setLayout(null);
        setSize(850,600);
        setLocation(360,120);
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

      try {
          if (e.getSource() == guess) {
          try {
              int guessNo = Integer.parseInt(enterText.getText());

                  if ((guessNo <= 0) || (guessNo >= 100) || (enterText.getText().equals(" "))) {
                      JOptionPane.showMessageDialog(null, "Guess the Number. Number Should be between 1 to 100");
                  } else {
                      if (guessNo < generate_num) {
                          label4.setText("Oops! Guess is too low. Play Again");
                          label4.setBackground(Color.BLACK);

                      } else if (guessNo > generate_num) {
                          label4.setText("Oops! Guess is too high. Play Again");
                      } else if (guessNo == generate_num) {
                          label4.setText("Congratulations! Guess is Correct. Play New Game");
                      }
                  }
              }catch (NumberFormatException e1){
              JOptionPane.showMessageDialog(null, "Guess the Number. Number Should be between 1 to 100");
          }
          }

              else if (e.getSource() == clear) {
                  enterText.setText("");
              }
              else if (e.getSource() == NewGame) {
                  enterText.setText("");
              }
              else if (e.getSource() == Exit) {
                  System.exit(0);
              }


          }catch (Exception e1){
         e1.printStackTrace();
          }

    }
    public static void main(String[] args) {
        new numberGame();
    }


}
