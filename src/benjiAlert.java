package src;

import javax.swing.*;
import java.awt.*;

public class benjiAlert extends Canvas{

    public static void main(String[] args){

        Toolkit tooltest = Toolkit.getDefaultToolkit();
        Image benji = tooltest.getImage("src/IMG_2765.JPG");

        ImageIcon imgBen = new ImageIcon(benji);
        JFrame test = new JFrame("Benji Alert");

        //Create the image label, and set the location.
        JLabel testLbl = new JLabel(imgBen);
        testLbl.setHorizontalAlignment(JLabel.CENTER);
        testLbl.setVerticalAlignment(JLabel.TOP);

        //Create okButton, and set the bounds of the button, as well as the action.
        JButton okButton = new JButton("Ok");
        okButton.setHorizontalAlignment(JLabel.CENTER);
        okButton.setBounds(143,100,101,40);
        okButton.addActionListener( e-> {
            test.dispose();
        });


        test.add(okButton);
        test.add(testLbl);

        test.setSize(400,200);
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.setVisible(true);

    }
}
