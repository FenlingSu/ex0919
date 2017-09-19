
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends Frame {
    private Button bexit=new Button("Exit");
    private Button bAdd=new Button("Add");
    private Label lab=new Label("0");
    private int n=0;

    public MainFrame(){

        initComp();
    }

    public void initComp(){
            this.setBounds(100,120,400,300);
        this.setLayout(null);
        bexit.setBounds(150,250,80,30);
        bexit.setBackground(new Color(255, 0,0));
        bAdd.setBounds(150,150,80,30);
        lab.setBounds(50,150,80,30);
        this.add(bexit);
        this.add(bAdd);
        this.add(lab);

        bexit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        bAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n++;
                lab.setText(Integer.toString(n));
            }
        });
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

