import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
public class QuizUpdated extends JFrame implements ActionListener {

    private static final long SerialrialVersionUID = 1L;

    JLabel label;
    JRadioButton[] RB = new JRadioButton[5];
    JButton nxtBt, resBt;
    ButtonGroup bg;
    int count = 0, Ques = 0;


    QuizUpdated(String s) {
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
        set();
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
        resBt.setBounds(270, 240, 100, 30);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocation(250, 100);
        setVisible(true);
        setSize(600, 350);
    }
    void Login()
    {
        String s1 = JOptionPane.showInputDialog("Enter your name");
        String s2 = JOptionPane.showInputDialog("Enterb you pass");
        JOptionPane.showMessageDialog(null, "Welcome"+s1 );
        if(s1.equals("")||s2.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Enter valid details");
        }
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == nxtBt) {
            if (check())
                count = count + 1;
            Ques++;
            set();
            if (Ques == 9) {
                nxtBt.setEnabled(false);
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
            label.setText("Que1:  When is republic day celebrated in India");
            RB[0].setText("26 January");
            RB[1].setText("15 August");
            RB[2].setText("2 October");
            RB[3].setText("None of the Above");
        }
        if (Ques == 1) {
            label.setText("Que2:  Which of the following is not a programing language");
            RB[0].setText("Java");
            RB[1].setText("HTML");
            RB[2].setText("Python");
            RB[3].setText("Viper");
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
        new QuizUpdated(" Quiz App");
    }
}