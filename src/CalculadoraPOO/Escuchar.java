package CalculadoraPOO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Escuchar extends JFrame implements ActionListener {

    //Se crean los botones que se usaran
    JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnDel, btnAC;
    JButton btnMultiplicacion, btnDivision, btnSuma, btnResta, btnAns, btnIgual, btnPunto, btnEXP;

    //Se crea el TextField y los paneles en donde estaran mis botones
    JTextField display;
    JPanel superior, medio, inferior;

    //Se crean mis cadenas donde trabajare mis datos, uno para el display y el otro para obtenermis numeros
    StringBuffer muestra = new StringBuffer();
    StringBuffer numero = new StringBuffer();


    //Incializo mis variables;
    int operar = 0;
    double resultado;
    boolean primernumero=true;
    boolean operadorPreviamentePulsado = true;
    double answ=0;

    public void asignarEventos(){
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
            switch (operar)
            {
                case 1 -> resultado *= extraerNumero();
                case 2 -> resultado /= extraerNumero();
                case 3 -> resultado += extraerNumero();
            }

            }
        }



    }

