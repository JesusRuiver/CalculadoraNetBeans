/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclase;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MiBorder extends JFrame{
    private JPanel jpPrincipal, jpCenter, jpEste, jpOeste, jpNorte, jpSur;
    private JButton jbtn1;
    private JLabel jlb1;
    
    public MiBorder() {
        initComponents();
    }

    private void initComponents() {
        jpPrincipal = new JPanel();
        jpPrincipal.setLayout(new BorderLayout());
        this.add(jpPrincipal);
        
        jpCenter = new JPanel();
        jpCenter.setBackground(Color.red);
        jpEste = new JPanel();
        jpOeste = new JPanel();
        jpNorte = new JPanel();
        jpSur = new JPanel();
        jpSur.setBackground(Color.yellow);
        
        jpPrincipal.add(jpCenter, BorderLayout.CENTER);
        jpPrincipal.add(jpEste, BorderLayout.EAST);
        jpPrincipal.add(jpOeste, BorderLayout.WEST);
        jpPrincipal.add(jpNorte, BorderLayout.NORTH);
        jpPrincipal.add(jpSur, BorderLayout.SOUTH);        
        jbtn1 = new JButton("OK");
        jlb1 = new JLabel();       
        jbtn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jlb1.setText("HOLA MAJO!!!!");
            }
        });
        
        
        
        jpCenter.add(jbtn1);
        jpSur.add(jlb1);
        this.setVisible(true);        
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
    }
    
    public static void main(String[] args) {
        MiBorder mb = new MiBorder();
    }
    
    
}
