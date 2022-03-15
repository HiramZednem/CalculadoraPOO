package CalculadoraPOO;

import javax.swing.*;
import java.awt.*;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Esta clase se encarga de inicializar mi interfaz grafica, es una clase que hereda los botones y los displays de la clase Escuchar,
 * esto funciona de esta manera, por que al utilizar el actionListener en la clase escuchar, en el metodo actionPerformed() necesito acceder
 * a todos los botones para poder asignar la accion que quiero que suceda, en este caso agregar numeros a mi display.
 */
public class Interfaz  extends Escuchar {
    //Defino mis paneles en donde voy a colocar mis botones
    JPanel superior, medio, inferior;

    public void crearInterfaz(){
        display = new JTextField();
        display.setEditable(false);
        display.setBounds(50,50,500,150);

        btn0 = new JButton("0");
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btnDel = new JButton("DEL");
        btnAC = new JButton("AC");

        btnMultiplicacion = new JButton("×");
        btnDivision       = new JButton("÷");
        btnSuma           = new JButton("+");
        btnResta          = new JButton("-");
        btnAns            = new JButton("Ans");
        btnIgual          = new JButton("=");
        btnPunto          = new JButton(".");
        btnEXP            = new JButton("EXP");

        superior = new JPanel();
        medio    = new JPanel();
        inferior = new JPanel();

        //Creacion de Interfaz visual;
        setLayout(new BorderLayout());

        //Superior
        superior.setLayout(new BorderLayout());
        superior.add("Center",display);


        //Medio
        medio.setLayout(new GridLayout(3,5));

        medio.add(btn7);
        medio.add(btn8);
        medio.add(btn9);
        medio.add(btnDel);
        medio.add(btnAC);

        medio.add(btn4);
        medio.add(btn5);
        medio.add(btn6);
        medio.add(btnMultiplicacion);
        medio.add(btnDivision);

        medio.add(btn1);
        medio.add(btn2);
        medio.add(btn3);
        medio.add(btnSuma);
        medio.add(btnResta);


        //INFERIOR
        inferior.setLayout(new GridLayout(1,5));
        inferior.add(btn0);
        inferior.add(btnPunto);
        inferior.add(btnEXP);
        inferior.add(btnAns);
        inferior.add(btnIgual);

        add("North",superior);
        add("Center",medio);
        add("South",inferior);

        /*
            Aqui es donde esta en si el funcionamiento de mi programa, por que usa el metodo asignar eventos que heredo
            De la clase " Escuchar ", entonces cuando se pulse un boton ya estoy trabajando directamente con el actionListener
            de la clase Escuchar
        */
        asignarEventos();

        //Inicializa mi ventana
        setBounds(100,100,500,350);
        setVisible(true);
        this.setLocationRelativeTo(null);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });
    }

}
