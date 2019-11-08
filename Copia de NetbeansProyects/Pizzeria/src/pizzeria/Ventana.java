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
    public JRadioButton rb1=new  JRadioButton(), rb2=new  JRadioButton(),  rb3=new  JRadioButton(),  rb4=new  JRadioButton(),  rb5=new  JRadioButton();
    //"Peperoni", "Salchicha", "Parmesano","Olivas", 
    //"Champi","Tomates","Anchoas","Pollo", "Ternera","Salsa Barbacoa"
    public JCheckBox cb1=new  JCheckBox(),  cb2=new  JCheckBox(),  cb3=new  JCheckBox(),  cb4=new  JCheckBox(),  cb5=new  JCheckBox(),  cb6=new  JCheckBox(),  cb7=new  JCheckBox(),  cb8=new  JCheckBox(),  cb9=new  JCheckBox(),  cb10=new  JCheckBox();
    //haga su pedido ahora, nombre, telefono, direccion
    public JLabel l1, l2, l3, l4;
    //nombre, telefono, direccion
    public JTextField tf1, tf2, tf3;
    //aceptar, cancelar
    public JButton b1, b2;

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
        rb1.setText(tamaño[0]);
        panelTamaño.add(rb1);
        rb1.addItemListener(new ManejadorCheckBox());
        rb2.setText(tamaño[1]);
        panelTamaño.add(rb2);
        rb2.addItemListener(new ManejadorCheckBox());
        rb3.setText(tamaño[2]);
        panelTamaño.add(rb3);
        rb3.addItemListener(new ManejadorCheckBox());
        //masa
        rb4.setText(masas[0]);
        panelMasa.add(rb4);
        rb4.addItemListener(new ManejadorCheckBox());
        rb5.setText(masas[1]);
        panelMasa.add(rb5);
        rb5.addItemListener(new ManejadorCheckBox());
        //ingredientes
        cb1.setText(ingredientes[0]);
        panelIngredientes.add(cb1);
        cb2.setText(ingredientes[1]);
        panelIngredientes.add(cb2);
        cb3.setText(ingredientes[2]);
        panelIngredientes.add(cb3);
        cb4.setText(ingredientes[3]);
        panelIngredientes.add(cb4);
        cb5.setText(ingredientes[4]);
        panelIngredientes.add(cb5);
        cb6.setText(ingredientes[5]);
        panelIngredientes.add(cb6);
        cb7.setText(ingredientes[6]);
        panelIngredientes.add(cb7);
        cb8.setText(ingredientes[7]);
        panelIngredientes.add(cb8);
        cb9.setText(ingredientes[8]);
        panelIngredientes.add(cb9);
        cb10.setText(ingredientes[9]);
        panelIngredientes.add(cb10);
        //cliente y cabecera
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
        if (source==b1) {
            //guarda datos cliente y datos pizza + imprimir
        }
        if (source==b2) {
            System.exit(0);
        }
    }
}
    
    private class ManejadorCheckBox implements ItemListener{

        @Override
        public void itemStateChanged(ItemEvent ie) throws UnsupportedOperationException{
            if (ie.getSource()==rb1) {
                
            }
            if (ie.getSource()==rb2) {
                
            }
            if (ie.getSource()==rb3) {
                
            }
            if (ie.getSource()==rb4) {
                
            }
            if (ie.getSource()==rb5) {
                
            }
        }
    }
}

