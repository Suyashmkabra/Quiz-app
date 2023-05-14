import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Quiz extends JFrame implements  ActionListener
{
    private static final long SerialrialVersionUID = 1L;

    JLabel label;
    JRadioButton[] RB = new JRadioButton[5];
    JButton nxtBt, resBt,loginbt;
    ButtonGroup bg;

    JFrame f= new JFrame();
    JTextField t1,t2,t1a,t2a;
    String s1,s2;

    int count = 0, Ques = 0;

    Quiz(String s) {

        super(s);
        label = new JLabel();
        add(label);
        bg = new ButtonGroup();
        for (int i = 0; i < 5; i++) {
            RB[i] = new JRadioButton();
            add(RB[i]);
            bg.add(RB[i]);
        }
        nxtBt = new JButton("Next");
        resBt = new JButton("Result");
        resBt.setVisible(false);
        nxtBt.addActionListener(this);
        resBt.addActionListener(this);
        add(nxtBt);
        add(resBt);
        Login();
        RB[0].setBackground(Color.white);
        RB[1].setBackground(Color.white);
        RB[2].setBackground(Color.white);
        RB[3].setBackground(Color.white);
        label.setBounds(30, 40, 450, 20);
        RB[0].setBounds(65, 80, 300, 25);
        RB[1].setBounds(65, 120, 300, 25);
        RB[2].setBounds(65, 160, 300, 25);
        RB[3].setBounds(65, 200, 300, 25);
        nxtBt.setBounds(200, 260, 100, 30);
        resBt.setBounds(200, 260, 100, 30);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocation(250, 100);
        setVisible(true);
        setSize(600, 350);
    }
    void Login()
    {

        JFrame f= new JFrame("Login form");
        t1=new JTextField("Enter your name :");
        t1.setBounds(50,100, 200,30);
        t1a= new JTextField();
        t1a.setBounds(50,150, 200,30);
        t2=new JTextField("Enter you pass :");
        t2.setBounds(50,200, 200,30);
        t2a= new JTextField();
        t2a.setBounds(50,250, 200,30);
        loginbt= new JButton("Login");
        loginbt.setBounds(100, 300, 100, 30);
        loginbt.setVisible(true);
        loginbt.addActionListener(this);
        f.add(t1); f.add(t2);;f.add(t1a);f.add(t2a);f.add(loginbt);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

        if(t1a.equals("")||t2a.equals("")) {
            loginbt.setEnabled(false);
        }else {
            loginbt.setEnabled(true);
        }
    }

    public void actionPerformed(ActionEvent e) {
        t1a.getText();
        t2a.getText();
        if (e.getSource()== loginbt)
        {
            set();
        }
        if (e.getSource() == nxtBt) {
            if (check())
                count = count + 1;
            Ques++;
            set();
            if (Ques == 9) {
                nxtBt.setEnabled(false);
                nxtBt.setVisible(false);
                resBt.setVisible(true);
                resBt.setText("Result");
            }
        }

        if (e.getActionCommand().equals("Result")) {
            if (check())
                count = count + 1;
            Ques++;
            JOptionPane.showMessageDialog(this, "correct answers= " + count);
            System.exit(0);
        }
    }

    void set() {

        RB[4].setSelected(true);
        if (Ques == 0) {
            label.setText("Que1:  Which of the following is programing related subject ");
            RB[0].setText("DSA");
            RB[1].setText("EM");
            RB[2].setText("BEE");
            RB[3].setText("Marketing");

        }
        if (Ques == 1) {
            label.setText("Que2:  Which is a good sport");
            RB[0].setText("Football");
            RB[1].setText("Cricket");
            RB[2].setText("hockey");
            RB[3].setText("All of them");
        }
        if (Ques == 2) {
            label.setText("Que3:  Which of the following is programing related subject ");
            RB[0].setText("DSA");
            RB[1].setText("EM");
            RB[2].setText("BEE");
            RB[3].setText("Marketing");
        }
        if (Ques == 3) {
            label.setText("Que4: Which of the following is not a E commerce website");
            RB[0].setText("Amazon");
            RB[1].setText("Flipkart");
            RB[2].setText("Snapdeal");
            RB[3].setText("Snapchat");
        }
        if (Ques == 4) {
            label.setText("Que5:  which  of the following is used for looping");
            RB[0].setText("for");
            RB[1].setText("i");
            RB[2].setText("if");
            RB[3].setText("printf");
        }
        if (Ques == 5) {
            label.setText("Que6: which is a good Engineering college");
            RB[0].setText("TSEC");
            RB[1].setText("KJSIET");
            RB[2].setText("DJ sanghvi");
            RB[3].setText("NMIMS");
        }
        if (Ques == 6) {
            label.setText("Que7:  Which is a good sport");
            RB[0].setText("Football");
            RB[1].setText("Cricket");
            RB[2].setText("hockey");
            RB[3].setText("All of them");
        }
        if (Ques== 7) {
            label.setText("Que8:  which of the follwing is a car manufacturing company");
            RB[0].setText("honda");
            RB[1].setText("toyota");
            RB[2].setText("tesla");
            RB[3].setText("all of the above");
        }
        if (Ques == 8) {
            label.setText("Que9:  which of the following is not a alphabet");
            RB[0].setText("a");
            RB[1].setText("b");
            RB[2].setText("v");
            RB[3].setText("4");
        }
        if (Ques == 9) {
            label.setText("Que10: How many meter in one kilometer");
            RB[0].setText("100");
            RB[1].setText("1000");
            RB[2].setText("1024");
            RB[3].setText("That's long");
        }
        label.setBounds(30, 40, 450, 20);
        for (int i = 0, j = 0; i <= 90; i += 30, j++)
            RB[j].setBounds(50, 80 + i, 200, 20);
    }

    boolean check() {
        if (Ques == 0)
            return (RB[1].isSelected());
        if (Ques == 1)
            return (RB[1].isSelected());
        if (Ques == 2)
            return (RB[0].isSelected());
        if (Ques == 3)
            return (RB[2].isSelected());
        if (Ques == 4)
            return (RB[0].isSelected());
        if (Ques == 5)
            return (RB[0].isSelected());
        if (Ques == 6)
            return (RB[1].isSelected());
        if (Ques == 7)
            return (RB[2].isSelected());
        if (Ques == 8)
            return (RB[0].isSelected());
        if (Ques == 9)
            return (RB[0].isSelected());
        return false;
    }
    public static void main(String[] s) {
        new Quiz(" Quiz App");
    }
}

