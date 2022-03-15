package CalculadoraModerna;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main extends JFrame implements ActionListener {
    //Inicializo mis botones:
    JTextField display;
    JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnDel, btnAC;
    JButton btnMultiplicacion, btnDivision, btnSuma, btnResta, btnAns, btnIgual, btnPunto, btnEXP;
    JPanel superior, medio, inferior;

    StringBuffer muestra = new StringBuffer();
    StringBuffer numero = new StringBuffer();


    //Incializo mis variables;
    int operar = 0;
    double resultado;

    boolean primernumero=true;
    boolean operadorPreviamentePulsado = true;
    double answ=0;

    public Main(){
        //Creacion de botones de la calculadora;
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

        //Manejo de eventos por botones
        btn0.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btnDel.addActionListener(this);
        btnAC.addActionListener(this);
        btnMultiplicacion.addActionListener(this);
        btnDivision.addActionListener(this);
        btnSuma.addActionListener(this);
        btnResta.addActionListener(this);
        btnAns.addActionListener(this);
        btnIgual.addActionListener(this);
        btnPunto.addActionListener(this);
        btnEXP.addActionListener(this);

        //Incializacion de Mi ventana
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





    @Override
    public void actionPerformed(ActionEvent e) {
        /**
         * Se manejan dos tostring, el primero es para guardar los numeros y el otro es para almacenar los numeros en
         * el arreglo de numeros :)
         */
    if(e.getSource()==btnAns){
        muestra.append("answ ");
        numero.append(answ);
        display.setText(muestra.toString());
    }
        if(e.getSource()==btnDel){
            JOptionPane.showMessageDialog(null, "Usted tiene comprado el paquete de calculadora basico, \ncompre un paquete plus para continuar.");
        }
        if(e.getSource()==btnEXP){
            JOptionPane.showMessageDialog(null, "Usted tiene comprado el paquete de calculadora basico, \ncompre un paquete plus para continuar.");
        }
        if(e.getSource()==btnPunto){
            muestra.append(".");
            numero.append(".");
            display.setText(muestra.toString());
            operadorPreviamentePulsado = false;
        }
       if(e.getSource()==btn0){
            muestra.append("0");
            numero.append("0");
           display.setText(muestra.toString());
           operadorPreviamentePulsado = false;
       }
        if(e.getSource()==btn1){
            muestra.append("1");
            numero.append("1");
            display.setText(muestra.toString());
            operadorPreviamentePulsado = false;
        }
        if(e.getSource()==btn2){
            muestra.append("2");
            numero.append("2");
            display.setText(muestra.toString());
            operadorPreviamentePulsado = false;
        }
        if(e.getSource()==btn3){
            muestra.append("3");
            numero.append("3");
            display.setText(muestra.toString());
            operadorPreviamentePulsado = false;
        }
        if(e.getSource()==btn4){
            muestra.append("4");
            numero.append("4");
            display.setText(muestra.toString());
            operadorPreviamentePulsado = false;
        }
        if(e.getSource()==btn5){
            muestra.append("5");
            numero.append("5");
            display.setText(muestra.toString());
            operadorPreviamentePulsado = false;
        }
        if(e.getSource()==btn6){
            muestra.append("6");
            numero.append("6");
            display.setText(muestra.toString());
            operadorPreviamentePulsado = false;
        }
        if(e.getSource()==btn7){
            muestra.append("7");
            numero.append("7");
            display.setText(muestra.toString());
            operadorPreviamentePulsado = false;
        }
        if(e.getSource()==btn8){
            muestra.append("8");
            numero.append("8");
            display.setText(muestra.toString());
            operadorPreviamentePulsado = false;
        }
        if(e.getSource()==btn9){
            muestra.append("9");
            numero.append("9");
            display.setText(muestra.toString());
            operadorPreviamentePulsado = false;
        }

        if(e.getSource()==btnMultiplicacion){ //aca que no se pueda pulsar primero
            operadorPreviamentePulsado=true;
            operacion();
            muestra.append("×");
            operar=1;
            display.setText(muestra.toString());
        }

        if(e.getSource()==btnDivision){ //aca que no se pueda pulsar primero
            operadorPreviamentePulsado=true;
            operacion();
            muestra.append("÷");
            operar=2;
            display.setText(muestra.toString());


        }
        if(e.getSource()==btnSuma){ //aca que no se pueda pulsar primero -este teoricamente si podria pero esta programado como una funcion y no me quiero romper la cabeza
            operadorPreviamentePulsado=true;
            operacion();
            muestra.append("+");
            operar=3;
            display.setText(muestra.toString());

        }
        if(e.getSource()==btnResta){
            if(!operadorPreviamentePulsado) {
                operacion();
                operar=3;
                muestra.append("-");
                numero.append("-");
            }else{
                muestra.append("-");
                numero.append("-");
                operadorPreviamentePulsado=false;
            }


            display.setText(muestra.toString());

        }
        if(e.getSource()==btnIgual){
                operacion();
                answ = resultado;
                display.setText("" + resultado); //Para no usa un metodo solo lo concateno
                operadorPreviamentePulsado = false;

                //------------- Implementare continuidad por si se quiere seguir pulsando numeros
                //se limpian mis cadenas
                muestra = new StringBuffer();
                numero = new StringBuffer();

                //Se añade el resultado
                muestra.append(resultado);
                numero.append(resultado);
                //Se pone que es el primer numero, para que cuando el usuario pulse el operador con el que quiere continuar solo extraiga el nuermo que appendamos arriba
                primernumero = true;
        }

        if(e.getSource()==btnAC){
            muestra = new StringBuffer();
            numero = new StringBuffer();
            primernumero = true;
            operadorPreviamentePulsado = true;
            operar=0;
            display.setText( "" );

        }








    }

    public Double extraerNumero(){
        Double numeroExtraido = Double.parseDouble(numero.toString()); // se crea uma variable local para almacenar el numero extraido
        numero = new StringBuffer();                                   // se limpia el string buffer de numero
        return numeroExtraido;                                         //se retorna el numero uno
    }
    
    public void operacion(){
        if (primernumero){
            primernumero = false;
            resultado = extraerNumero();
        }else {
            switch (operar) {
                case 1 -> {
                    //multiplicacion
                    resultado *= extraerNumero();
                }
                case 2 -> {
                    //division
                    resultado /= extraerNumero();
                }
                case 3 -> {
                    //Suma
                    resultado += extraerNumero();

                }

            }
        }
    }

    public static void main(String[] args) {
    Main calculadora = new Main();
    }
}
