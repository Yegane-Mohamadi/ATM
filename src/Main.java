import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("ATM");
        Dimension framesize = new Dimension(800 , 700);
        frame.setSize(framesize);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel taghirramz = new JPanel();
        JPanel finalpanel = new JPanel();
        JPanel panel5 = new JPanel();
        JPanel panel6 = new JPanel();
        panel1.setLayout(null);
        panel2.setLayout(null);
        panel3.setLayout(null);
        panel4.setLayout(null);
        taghirramz.setLayout(null);
        finalpanel.setLayout(null);
        panel5.setLayout(null);
        panel6.setLayout(null);
        JPanel bardasht = new JPanel();
        bardasht.setLayout(null);
        panel1.setBackground(Color.lightGray);

        JButton vorood = new JButton("ورود");
        JButton send = new JButton("Send");
        JButton ramz = new JButton("تغییر رمز");
        JButton vajh = new JButton("برداشت وجه");
        JButton mojoodi = new JButton("اعلام موجودی");
        JButton kart = new JButton("کارت به کارت");
        JButton sabt = new JButton("ثبت");
        JButton bazgasht = new JButton("بازگشت");
        JButton pardakht = new JButton("پرداخت");
        JButton tamam = new JButton("تمام");

        JLabel labelf = new JLabel("زبان خودرا انتخاب کنید");
        JLabel labele = new JLabel("Choose Language");
        JLabel rmz = new JLabel("رمز خودرا وارد کنید");
        JLabel pass = new JLabel("رمز جدید خودرا وارد کنید");
        JLabel password = new JLabel("Enter your password");
        JLabel finish = new JLabel("عملیات با موفقیت انجام شد!");
        JLabel elam = new JLabel("موجودی حساب شما : 4500000");
        JLabel mablagh = new JLabel("مبلغ مورد نظر را وارد کنید :");
        JLabel shomare  = new JLabel("شماره کارت را وارد کنید :");
        JLabel pool = new JLabel("مبلغ برداشتی خودرا وارد کنید :");

        JTextField textField = new JTextField(20);
        textField.setSize(50 , 30);
        textField.setEditable(true);
        JTextField text = new JTextField(20);
        text.setSize(50 , 30);
        text.setEditable(true);
        JTextField passfield = new JTextField(20);
        passfield.setSize(50 , 30);
        passfield.setEditable(true);
        JTextField mablaghfield = new JTextField(20);
        mablaghfield.setSize(50 , 30);
        mablaghfield.setEditable(true);
        JTextField kartfield = new JTextField(20);
        kartfield.setSize(50 , 30);
        kartfield.setEditable(true);
        JTextField poolfield = new JTextField(20);
        poolfield.setSize(50 , 30);
        poolfield.setEditable(true);

        Font font = new Font("San Serif", Font.PLAIN , 30);
        labelf.setFont(font);
        labelf.setBounds(250 , 100 , 500 , 300);
        labele.setFont(font);
        labele.setBounds(250 , 150 , 500 , 300);
        rmz.setFont(font);
        rmz.setBounds(300 , 100 , 500 , 300);
        textField.setBounds(250 , 300 , 300 , 50);
        password.setFont(font);
        password.setBounds(250 , 100 , 500 , 300);
        text.setBounds(250 , 300 , 280 , 50);
        pass.setFont(font);
        pass.setBounds(300 , 100 , 500 , 300);
        passfield.setBounds(250 , 300 , 300 , 50);
        finish.setFont(font);
        finish.setBounds(300 , 100 , 500 , 300);
        elam.setFont(font);
        elam.setBounds(300 , 100 , 500 , 300);
        mablagh.setFont(font);
        mablagh.setBounds(400 , 100 , 500 , 300);
        mablaghfield.setBounds(100 , 220 , 300 , 50);
        shomare.setFont(font);
        shomare.setBounds(400 , 200 , 490 , 300);
        kartfield.setBounds(100 , 320 , 290 , 50);
        pool.setFont(font);
        pool.setBounds(400 , 200 , 490 , 300);
        poolfield.setBounds(100 , 320 , 300 , 50);



        ramz.setBounds(50 , 100 , 200 , 50);
        ramz.setFont(font);
        vajh.setBounds(50 , 400 , 200 ,50);
        vajh.setFont(font);
        mojoodi.setBounds(500 , 100 , 200 , 50);
        mojoodi.setFont(font);
        kart.setBounds(500 , 400 , 200 , 50);
        kart.setFont(font);
        vorood.setBounds(250 , 400 , 300 , 50);
        vorood.setFont(font);
        send.setBounds(250 , 400 , 300 , 50);
        send.setFont(font);
        sabt.setBounds(250 , 400 , 300 , 50);
        sabt.setFont(font);
        bazgasht.setBounds(250 , 400 , 300 , 50);
        bazgasht.setFont(font);
        pardakht.setBounds(300 , 400 , 300 , 50);
        pardakht.setFont(font);
        tamam.setBounds(300 , 400 , 300 , 50);
        tamam.setFont(font);

        vorood.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel4.setBounds(0 , 0 , 800 , 700);
                panel4.setBackground(Color.lightGray);
                frame.remove(panel2);
                frame.add(panel4);
                frame.revalidate();
                frame.repaint();
            }
        });
        send.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel4.setBounds(0 , 0 , 800 , 700);
                panel4.setBackground(Color.lightGray);
                frame.remove(panel3);
                frame.add(panel4);
                frame.revalidate();
                frame.repaint();
            }
        });

        JButton button1 = new JButton("English");
        button1.setBounds(0 , 250 , 200 , 50);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel3.setBounds(0 , 0 , 800 , 700);
                panel3.setBackground(Color.lightGray);
                frame.remove(panel1);
                frame.add(panel3);
                frame.revalidate();
                frame.repaint();
            }
        });
        JButton button2 = new JButton("فارسی");
        button2.setBounds(585 , 250 , 200 , 50);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel2.setBounds(0 , 0 , 800 , 700);
                panel2.setBackground(Color.lightGray);
                frame.remove(panel1);
                frame.add(panel2);
                frame.revalidate();
                frame.repaint();
            }
        });
        ramz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                taghirramz.setBounds(0 , 0 , 800 , 700);
                taghirramz.setBackground(Color.lightGray);
                frame.remove(panel4);
                frame.add(taghirramz);
                frame.revalidate();
                frame.repaint();
            }
        });
        sabt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                finalpanel.setBounds(0 , 0 , 800 , 700);
                finalpanel.setBackground(Color.CYAN);
                frame.remove(taghirramz);
                frame.add(finalpanel);
                frame.revalidate();
                frame.repaint();
            }
        });

        mojoodi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                finalpanel.setBounds(0 , 0 , 800 , 700);
                finalpanel.setBackground(Color.CYAN);
                frame.remove(panel4);
                frame.add(panel5);
                frame.revalidate();
                frame.repaint();

            }
        });
        bazgasht.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                finalpanel.setBounds(0 , 0 , 800 , 700);
                finalpanel.setBackground(Color.CYAN);
                frame.remove(panel5);
                frame.add(panel4);
                frame.revalidate();
                frame.repaint();

            }
        });
        kart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                finalpanel.setBounds(0 , 0 , 800 , 700);
                finalpanel.setBackground(Color.CYAN);
                frame.remove(panel4);
                frame.add(panel6);
                frame.revalidate();
                frame.repaint();

            }
        });
        pardakht.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                finalpanel.setBounds(0 , 0 , 800 , 700);
                finalpanel.setBackground(Color.CYAN);
                frame.remove(panel6);
                frame.add(finalpanel);
                frame.revalidate();
                frame.repaint();
            }
        });
        vajh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                finalpanel.setBounds(0 , 0 , 800 , 700);
                finalpanel.setBackground(Color.CYAN);
                frame.remove(panel4);
                frame.add(bardasht);
                frame.revalidate();
                frame.repaint();
            }
        });
        tamam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                finalpanel.setBounds(0 , 0 , 800 , 700);
                finalpanel.setBackground(Color.CYAN);
                frame.remove(bardasht);
                frame.add(finalpanel);
                frame.revalidate();
                frame.repaint();
            }
        });



        panel1.add(labelf);
        panel1.add(labele);
        panel1.add(button1);
        panel1.add(button2);
        panel2.add(rmz);
        panel2.add(textField);
        panel2.add(vorood);
        panel3.add(password);
        panel3.add(text);
        panel3.add(send);
        panel4.add(ramz);
        panel4.add(vajh);
        panel4.add(mojoodi);
        panel4.add(kart);
        taghirramz.add(pass);
        taghirramz.add(passfield);
        taghirramz.add(sabt);
        panel5.add(elam);
        panel5.add(bazgasht);
        panel6.add(mablagh);
        panel6.add(mablaghfield);
        panel6.add(shomare);
        panel6.add(kartfield);
        panel6.add(pardakht);
        bardasht.add(pool);
        bardasht.add(poolfield);
        bardasht.add(tamam);
        finalpanel.add(finish);
        frame.add(panel1);
        frame.setVisible(true);

    }
}