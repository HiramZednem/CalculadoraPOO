package CalculadoraPOO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *     int operar = 0; Esta variable es usada cuando, mi usuario pulsa los caracteres { +, ×, ÷}, al pulsar esas variables se le asigna un caso
 *                      1: Es Multiplicar
 *                      2: Es Dividir
 *                      3: Es Sumar
 *
 *     double resultado; Esta variable es un acumulador, donde se acumulan los datos que el usuario ingresa, se apoya de la condicion booleana
 *                       primernumero, ya que si es true, el usuario esta ingresando el primer numero y la variable resultado toma directamente
 *                       el valor que ingreso mi usuario.
 *
 *     boolean primernumero=true; Sirve para saber si el usuario esta ingresando el primer numero
 *
 *     boolean operadorPreviamentePulsado = true; Esta variable sirve para saber si se pulso previamente un operador, sirve principalmente cuando
 *                                                es pulsado el caracter { - }, ya que este tiene dos formas de funcionar, puede funcionar en
 *                                                forma de resta (8 - 4), o puede funcionar para ingresar numeros negativos en mi programa (8x-3)
 *
 *     double answ=0; Esta variable sirve para guardar el resultado obtenido y mi usuario pueda acceder a la ultima respuesta ingresada.
 *
 *
 *     StringBuffer muestra; El StringBuffer de muestra, es el que esta relacionado con el display, lo que ingrese el usuario sera mostrado en este
 *                           StringBuffer.
 *
 *     StringBuffer numero; El StringBuffer de numero es creado unicamente para ingresar los datos del usuario y extraerlos por el metodo de
 *                          " extraerNumero(); ", este StringBuffer es limpiado cada que se extrae un numero ingresado siendo asi un
 *                          StringBuffer temporal donde se guarda temporalmente una variable, que es asignada a directamente a resultado o
 *                          haciendo la operacion con resultado (dependiendo el caso)
 */

public class Escuchar extends JFrame implements ActionListener {

    //Se crean los botones que se usaran
    JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnDel, btnAC;
    JButton btnMultiplicacion, btnDivision, btnSuma, btnResta, btnAns, btnIgual, btnPunto, btnEXP;

    //Se crea el TextField en donde mostrare los resultados y lo que el usuario digite
    JTextField display;


    //Se crea mi cadena vacia
    String datosIngresados="";


    //Incializo mis variables;
    int operar = 0;
    double resultado;
    double answ=0;

    public void asignarEventos(){
        //El metodo asignarEventos es mi base del programa, ya que gracias a el funciona el actionListener (Más explicacion en clase " Interfaz ")
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

    public void BotonNumero(String i){ //Recibe i que es lo que se pulso

        datosIngresados+= i;


        //Se muestra el display
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        //BOTONES DE FANTASIA
        if(e.getSource()==btnDel || e.getSource()==btnEXP){
            JOptionPane.showMessageDialog(null, "Usted tiene comprado el paquete de calculadora basico, " +
                                                                        "\ncompre un paquete plus para continuar.");
        }

        //BOTONES ESPECIALES
        if(e.getSource()==btnAns){
            //Esta basicamente hace algo similar a lo que se hace en botonNumero, pero
            //Como en el display muestra la palabra "Ans ", no puede usar ese metodo.
            datosIngresados = answ+"";
            display.setText(datosIngresados);
        }
        if(e.getSource()==btnPunto){
            BotonNumero(".");
        }
        if(e.getSource()==btnIgual){
            //AQUI ES DONDE VA A IR LA LOGICA
        }
        if(e.getSource()==btnAC){
            //Reiniica mi programa
            answ=0;
            datosIngresados="";
            display.setText( "" );
        }

        //BOTONES DE NUMEROS
        if(e.getSource()==btn0){
            BotonNumero("0");
        }
        if(e.getSource()==btn1){
            BotonNumero("1");
        }
        if(e.getSource()==btn2){
            BotonNumero("2");
        }
        if(e.getSource()==btn3){
            BotonNumero("3");
        }
        if(e.getSource()==btn4){
            BotonNumero("4");
        }
        if(e.getSource()==btn5){
            BotonNumero("5");
        }
        if(e.getSource()==btn6){
            BotonNumero("6");
        }
        if(e.getSource()==btn7){
            BotonNumero("7");
        }
        if(e.getSource()==btn8){
            BotonNumero("8");
        }
        if(e.getSource()==btn9){
            BotonNumero("9");
        }

        //BOTONES OPERADORES
        if(e.getSource()==btnMultiplicacion){
            BotonNumero("×");
        }
        if(e.getSource()==btnDivision){
            BotonNumero("÷");
        }
        if(e.getSource()==btnSuma){
            BotonNumero("+");
        }
        if(e.getSource()==btnResta){
                BotonNumero("-");

            }
            display.setText(datosIngresados);



    }

    }
