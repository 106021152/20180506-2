import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
    public JButton jbtnSum = new JButton("＝");
    public JButton jbtnExit = new JButton("Exit");
    public JTextField jtf = new JTextField();
    public JLabel jlbF= new JLabel("華氏度：");
    public JLabel jlbC= new JLabel("攝氏度");
    public MainFrame(){
        this.init();
    }
    public void init(){
        this.setBounds(80,60,800,600);
        this.setLayout(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.add(jbtnSum);
        this.add(jbtnExit);
        this.add(jtf);
        this.add(jlbF);
        this.add(jlbC);
        jbtnSum.setBounds(420,100,105,30);
        jbtnExit.setBounds(650,300,100,100);
        jlbF.setBounds(200,60,100,100);
        jlbC.setBounds(530,60,100,100);
        jtf.setBounds(300,100,110,32);
        jbtnSum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float count = (Integer.parseInt(jtf.getText())-32)*5/9f;
                count = Math.round(count*100)/100f;
                jlbC.setText("攝氏" + count + "度");
            }
        });
        jbtnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
