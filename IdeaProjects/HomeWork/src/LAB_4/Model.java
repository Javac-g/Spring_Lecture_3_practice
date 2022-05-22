package LAB_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Model implements ActionListener {

    static JFrame frame;
    static JPanel panel;
    JFormattedTextField heihgt,side,numb;
    JLabel A,B,C,result;
    JButton button;
    Integer h,s;
    Double n,V;

    public void create(){


        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        frame = new JFrame("Обьем пирамиды");


        frame.setLocation(dim.width / 2 - frame.getSize().width / 2, dim.height / 2  - frame.getSize().height / 2);

        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel(){
            @Override
            public Dimension getPreferredSize(){
                return new Dimension(300,200);
            }
        };


        heihgt = new JFormattedTextField();
        side  = new JFormattedTextField();
        numb = new JFormattedTextField();

        A = new JLabel("Высота: ");
        B = new JLabel("Cторона основания: ");
        C = new JLabel("Кол-во сторон: ");
        result = new JLabel("Результат");
        button = new JButton("Volume");

        button.setBounds(20,160,130,20);
        result.setBounds(160,160,100,20);

        A.setBounds(20,20,130,20);
        heihgt.setBounds(160,20,100,20);
        B.setBounds(20,70,130,20);
        side.setBounds(160,70,100,20);
        C.setBounds(20,120,130,20);
        numb.setBounds(160,120,100,20);

        A.setOpaque(true);
        B.setOpaque(true);
        C.setOpaque(true);

        A.setBackground(Color.CYAN);
        B.setBackground(Color.CYAN);
        C.setBackground(Color.CYAN);

        button.addActionListener(this);
        frame.add(A);
        frame.add(B);
        frame.add(C);
        frame.add(heihgt);
        frame.add(side);
        frame.add(numb);
        frame.add(button);
        frame.add(result);

        frame.add(panel);

        frame.setLocationRelativeTo(null);
        frame.setResizable(true);
        frame.pack();
        frame.setVisible(true);




    }

    @Override
    public void actionPerformed(ActionEvent e){
        JButton actionSource = (JButton) e.getSource();
        if (actionSource.equals(button)){
            h = Integer.parseInt(heihgt.getText());
            s = Integer.parseInt(side.getText());
            n = Double.parseDouble(numb.getText());
            V =((Math.pow(s,2) * h  * n)/(12 * Math.tan(Math.toRadians(180/n)))) ;
            result.setText("Обьем : " + V);
        }
    }
}
