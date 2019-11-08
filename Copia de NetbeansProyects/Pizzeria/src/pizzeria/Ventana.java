/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author DAM 6N
 */
public class Ventana extends JFrame{
    private final String[] tamaño={"pequeña", "mediana", "grande"};
    private final String[] masas={"Delgada", "Gruesa"};
    private final String[] ingredientes={"Peperoni", "Salchicha", "Parmesano","Olivas", 
                    "Champi","Tomates","Anchoas","Pollo", "Ternera","Salsa Barbacoa"};
    //pequeña, grande, mediana, delgada, gruesa
    public JRadioButton[] rb;
    //"Peperoni", "Salchicha", "Parmesano","Olivas", 
    //"Champi","Tomates","Anchoas","Pollo", "Ternera","Salsa Barbacoa"
    public JCheckBox[] cb;
    //haga su pedido ahora, nombre, telefono, direccion
    public JLabel[] l;
    //nombre, telefono, direccion
    public JTextField[] tf;
    //aceptar, cancelar
    public JButton[] b;

    public Ventana() {
        setTitle("Pedido Pizza");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        //Todo
        BorderLayout bl=new BorderLayout();
        //Nombre, tlf, direccion, tamaño, masa, ingredientes
        GridLayout gl1=new GridLayout(2, 1);
        //Nombre, tlf, direccion
        GridLayout gl2=new GridLayout(3, 2);
        //Tamaño, masa, ingredientes
        FlowLayout fl=new FlowLayout();
        //tamaño
        GridLayout gl3=new GridLayout(3, 1);
        //masa
        GridLayout gl4=new GridLayout(2, 1);
        //ingredientes
        GridLayout gl5=new GridLayout(4, 3);
        //todo
        JPanel panelPrincipal=new JPanel();
        //
        JPanel panelClientePizza=new JPanel();
        //Nombre, tlf etc
        JPanel panelCliente=new JPanel();
        //Tamaño, masa, ingredientes
        JPanel panelPizza=new JPanel();
        //tamaño
        JPanel panelTamaño=new JPanel();
        //masa
        JPanel panelMasa=new JPanel();
        //ingredientes
        JPanel panelIngredientes=new JPanel();
        
        //tamaño
        for (int i = 0; i < tamaño.length; i++) {
            rb[i]=new JRadioButton();
            rb[i].setText(tamaño[i]);
            rb[i].addItemListener(new ManejadorCheckBox());
            panelTamaño.add(rb[i]);}
        //masa
        for (int i = tamaño.length-1; i < masas.length; i++) {
            int j=0;
            rb[i]=new JRadioButton();
            rb[i].setText(tamaño[j]);
            rb[i].addItemListener(new ManejadorCheckBox());
            j++;
            panelMasa.add(rb[i]);}
        //ingredientes
        for (int i = 0; i < ingredientes.length; i++) {
            cb[i]=new JCheckBox();
            cb[i].setText(ingredientes[i]);
            panelIngredientes.add(cb[i]);
        }
        //cliente y cabecera
        for (int i = 0; i < 10; i++) {
            
        }
        l1.setText("¡Haga su pedido ahora!");
        panelCliente.add(l1);
        l2.setText("Nombre:");
        panelCliente.add(l2);
        l3.setText("Telefono:");
        panelCliente.add(l3);
        l4.setText("Direccion:");
        panelCliente.add(l4);
        //campos de cliente
        
        //puestos los layout
        panelPrincipal.setLayout(bl);
        panelClientePizza.setLayout(gl1);
        panelCliente.setLayout(gl2);
        panelPizza.setLayout(fl);
        panelTamaño.setLayout(gl3);
        panelMasa.setLayout(gl4);
        panelIngredientes.setLayout(gl5);
        //añadidos paneles a cada panels y el principal a la ventana
        add(panelPrincipal);
        panelPrincipal.add(panelClientePizza);
        panelClientePizza.add(panelCliente);
        panelClientePizza.add(panelPizza);
        panelPizza.add(panelTamaño);
        panelPizza.add(panelMasa);
        panelPizza.add(panelIngredientes);
        
        
    }
    

    public class EscuchadorBoton implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent ae) throws UnsupportedOperationException{
        Object source=ae.getSource();
        if (source==b[0]) {
            //guarda datos cliente y datos pizza + imprimir
        }
        if (source==b[1]) {
            System.exit(0);
        }
    }
}
    
    private class ManejadorCheckBox implements ItemListener{

        @Override
        public void itemStateChanged(ItemEvent ie) throws UnsupportedOperationException{
            if (ie.getSource()==rb[0]) {
                
            }
            if (ie.getSource()==rb[1]) {
                
            }
            if (ie.getSource()==rb[2]) {
                
            }
            if (ie.getSource()==rb[3]) {
                
            }
            if (ie.getSource()==rb[4]) {
                
            }
        }
    }
}

