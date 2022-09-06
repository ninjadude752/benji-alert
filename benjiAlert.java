import javax.swing.*;

public class benjiAlert {

    public static void main(String[] args){
        JFrame test = new JFrame("Benji Alert");

        JButton buttonTest = new JButton("OK");
        buttonTest.setBounds(100,100,10,10);

        test.add(buttonTest);

        test.setSize(300,300);
        test.setLayout(null);
        test.setVisible(true);

    }
}
