/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Jesús Manuel Ruiz Verdejo
 */
public class Calculadora extends JFrame {

    private JPanel jpPrincipal, jpPantalla, jpTeclado;
    private JLabel jlbPantalla;
    //private JButton[] botones = new JButton[16];
    private JButton jbtn0, jbtn1, jbtn2;

    public static void main(String[] args) {
        Calculadora miCalculadora = new Calculadora();

    }

    public Calculadora(){
        initComponentes();
    }

    public void initComponentes() {
        jpPrincipal = new JPanel();
        jpPrincipal.setLayout(new GridLayout());
        this.add(jpPrincipal);

        jpPantalla = new JPanel();
        jlbPantalla = new JLabel();
        jpPantalla.add(jlbPantalla);

        jpTeclado = new JPanel();
        jbtn0 = new JButton();
        jpTeclado.add(jbtn0);
       

        setVisible(true);

    }

}
