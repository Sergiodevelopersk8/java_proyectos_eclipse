
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Javier Arturo
 */
public class FrameJava extends JFrame{
    
    public FrameJava(){
        
        JTextField campo1 = new JTextField(20);
        JTextField campo2 = new JTextField(20);
        

        campo1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                campo2.setText("");
            }
        });
        
        JButton boton = new JButton("boton");
        /*boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                campo2.setText(campo.getText());
            }
        });*/
        
        setLayout(new FlowLayout());
        
        add(boton);
        add(campo1);
        add(campo2);
        setSize(700,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
    
    public static void main(String[] args) {
        new FrameJava();
    }
    
}
