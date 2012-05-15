/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package culebrita;

import javax.swing.*;

/**HELLO
 *
 * @author Owner
 */
public class Culebrita extends JFrame {

    JButton miBoton;
    JLabel label;
    int jugadoresPos;
    int posicion;
    int[] jugadoresArr;
    int[] resultados = {2, 3, 1, 1, 3, 2, 1, 3, 2, 2, 3, 1, 2, 3, 1, 1, 3, 2, 1, 3, 2, 2, 3, 1, 2, 3, 1, 1, 3, 2, 1, 3, 2, 2, 3, 1};

    /**
     * @param args the command line arguments
     */
    
    public Culebrita(){
        
        miBoton= new JButton("Iniciar");
        label= new JLabel("..");
        
        
    }
    
    public int Culebrita1(int numJugadores) {

        int jugadores = numJugadores;
        jugadoresArr = new int[jugadores];

        while (numJugadores <= 6) {
            for (int i = 0; i < jugadoresArr.length; i++) {
                System.out.println("Jugador #" + i + "=" + jugadoresArr[i]);
                jugadoresArr[i] = lanzarDado(jugadoresArr[i], i);
                System.out.println("jugadoresArrrrrrrr[" + i + "] posicion: " + jugadoresArr[i]);
                System.out.println("");

            }
            //Culebrita1(numJugadores);
        }
        System.out.println("FIN");
        return jugadoresPos;
    }

    public int lanzarDado(int playerPos, int i) {
        int movimiento = 0;

        int dado = (int) (Math.random() * 5) + 1;

        System.out.println("valorDado=" + dado + "---playerPost" + playerPos);
        if ((dado + playerPos) < 36) {
            movimiento = pregunta(dado, playerPos);
            //System.out.println("movimiento"+movimiento);
        } else {
            JOptionPane.showMessageDialog(null, "Jugador# " + (i + 1) + " Gano el juego...");
            System.exit(0);
        }
        return movimiento;

    }

    public int pregunta(int newPosition, int posicionAnterior) {

        String pregunta;
        int out = 0, result;
        switch (newPosition + posicionAnterior) {

            case 1:
                result = Integer.parseInt(JOptionPane.showInputDialog("Es energía en tránsito que fluye de un cuerpo de mayor temperatura a otro:\n1) Frio.\n2) Calor.\n3) calido."));
                if (result == resultados[(newPosition + posicionAnterior) - 1]) {
                    System.out.println("CORRECTO RESULT=" + resultados[(newPosition + posicionAnterior) - 1]);
                    out = newPosition + posicionAnterior;
                } else {
                    out = posicionAnterior;
                }

                break;

            case 2:
                result = Integer.parseInt(JOptionPane.showInputDialog("Es el promedio de la energía cinética de un cuerpo:\n1) Energia.\n2) Velocidad.\n3) Temperatura."));
                if (result == resultados[(newPosition + posicionAnterior) - 1]) {
                    System.out.println("CORRECTO RESULT=" + resultados[(newPosition + posicionAnterior) - 1]);
                    out = newPosition + posicionAnterior;
                } else {
                    out = posicionAnterior;
                }

                break;

            case 3:
                result = Integer.parseInt(JOptionPane.showInputDialog("Es el aparato que se utiliza para medir la cantidad de calor:\n1) Calorimetro.\n2) Termostato.\n3) Calibrador."));
                if (result == resultados[(newPosition + posicionAnterior) - 1]) {
                    System.out.println("CORRECTO RESULT=" + resultados[(newPosition + posicionAnterior) - 1]);
                    out = newPosition + posicionAnterior;
                } else {
                    out = posicionAnterior;
                }

                break;

            case 4:
                result = Integer.parseInt(JOptionPane.showInputDialog("Instrumento de laboratorio que se utiliza para medir la temperatura:\n1) termómetro.\n2) Voltimetro.\n3) Galvanómetro."));
                if (result == resultados[(newPosition + posicionAnterior) - 1]) {
                    System.out.println("CORRECTO RESULT=" + resultados[(newPosition + posicionAnterior) - 1]);
                    out = newPosition + posicionAnterior;
                } else {
                    out = posicionAnterior;
                }

                break;

            case 5:
                result = Integer.parseInt(JOptionPane.showInputDialog("Escala termométrica que se basa en el llamado “cero absoluto�?:\n1) Escala termica.\n2) Escala richter.\n3) Escala absoluta o Kelvin."));
                if (result == resultados[(newPosition + posicionAnterior) - 1]) {
                    System.out.println("CORRECTO RESULT=" + resultados[(newPosition + posicionAnterior) - 1]);
                    out = newPosition + posicionAnterior;
                } else {
                    out = posicionAnterior;
                }

                break;

            case 6:
                JOptionPane.showMessageDialog(null,"En Hora Buena, Has Encontrado Una Escalera...\n\n\n Avanza a la casilla 18...   :)");
                out = 18;
              
                break;

            case 7:
                result = Integer.parseInt(JOptionPane.showInputDialog("Valor del equivalente mecánico del calor:\n1) 1 Joule = 0.24cal 1 cal = 4.18 Joule.\n2) 1 Joule = 0.04cal 1 cal = 4.18 Joule.\n3) 1 Joule = 0.64cal 1 cal = 4.18 Joule."));
                if (result == resultados[(newPosition + posicionAnterior) - 1]) {
                    System.out.println("CORRECTO RESULT=" + resultados[(newPosition + posicionAnterior) - 1]);
                    out = newPosition + posicionAnterior;
                } else {
                    out = posicionAnterior;
                }

                break;

            case 8:
                result = Integer.parseInt(JOptionPane.showInputDialog("Parte de la física que estudia las conversiones del calor en trabajo:\n1) Equipotencial.\n2) Estadistica.\n3) Termodinámica."));
                if (result == resultados[(newPosition + posicionAnterior) - 1]) {
                    System.out.println("CORRECTO RESULT=" + resultados[(newPosition + posicionAnterior) - 1]);
                    out = newPosition + posicionAnterior;
                } else {
                    out = posicionAnterior;
                }

                break;

            case 9:
                result = Integer.parseInt(JOptionPane.showInputDialog("¿Que teoría explica los estados de agregación de la materia y sus cambios?:\n1) Teoría estatica molecular.\n2) Teoría cinético molecular.\n3) Teoría cinético corpuscular."));
                if (result == resultados[(newPosition + posicionAnterior) - 1]) {
                    System.out.println("CORRECTO RESULT=" + resultados[(newPosition + posicionAnterior) - 1]);
                    out = newPosition + posicionAnterior;
                } else {
                    out = posicionAnterior;
                }

                break;

            case 10:
                result = Integer.parseInt(JOptionPane.showInputDialog("Científico que determinó el equivalente mecánico del calor:\n1) James Bond.\n2) James Joule.\n3) jin Carry."));
                if (result == resultados[(newPosition + posicionAnterior) - 1]) {
                    System.out.println("CORRECTO RESULT=" + resultados[(newPosition + posicionAnterior) - 1]);
                    out = newPosition + posicionAnterior;
                } else {
                    out = posicionAnterior;
                }

                break;

            case 11:
                JOptionPane.showMessageDialog(null,"En Hora Buena, Has Encontrado Una Escalera...\n\n\n Avanza a la casilla 24...   :)");
                    out = 24;
                
                break;

            case 12:
                result = Integer.parseInt(JOptionPane.showInputDialog("Se llaman así los malos conductores del calor:\n1) Aislantes.\n2) Alcalinos.\n3) Negativos."));
                if (result == resultados[(newPosition + posicionAnterior) - 1]) {
                    System.out.println("CORRECTO RESULT=" + resultados[(newPosition + posicionAnterior) - 1]);
                    out = newPosition + posicionAnterior;
                } else {
                    out = posicionAnterior;
                }

                break;

            case 13:
                JOptionPane.showMessageDialog(null,"Lo Siento, Has Encontrado una Culebrita...\n\n\nRegresa a la Casilla 1...   ;(");
                    out = 1;

                break;

            case 14:
                result = Integer.parseInt(JOptionPane.showInputDialog("Es el promedio de la energía cinética de un cuerpo:\n1) Energia.\n2) Velocidad.\n3) Temperatura."));
                if (result == resultados[(newPosition + posicionAnterior) - 1]) {
                    System.out.println("CORRECTO RESULT=" + resultados[(newPosition + posicionAnterior) - 1]);
                    out = newPosition + posicionAnterior;
                } else {
                    out = posicionAnterior;
                }

                break;

            case 15:
                result = Integer.parseInt(JOptionPane.showInputDialog("Es el aparato que se utiliza para medir la cantidad de calor:\n1) Calorimetro.\n2) Termostato.\n3) Calibrador."));
                if (result == resultados[(newPosition + posicionAnterior) - 1]) {
                    System.out.println("CORRECTO RESULT=" + resultados[(newPosition + posicionAnterior) - 1]);
                    out = newPosition + posicionAnterior;
                } else {
                    out = posicionAnterior;
                }

                break;

            case 16:
                JOptionPane.showMessageDialog(null,"Lo Siento, Has Encontrado una Culebrita...\n\n\nRegresa a la Casilla 3...   ;(");
                    out = 3;

                break;

            case 17:
                JOptionPane.showMessageDialog(null,"En Hora Buena, Has Encontrado Una Escalera...\n\n\n Avanza a la casilla 28...   :)");
                    out = 28;

                break;

            case 18:
                result = Integer.parseInt(JOptionPane.showInputDialog("Científico que determinó el equivalente mecánico del calor:\n1) James Bond.\n2) James Joule.\n3) jin Carry."));
                if (result == resultados[newPosition - 1]) {
                    out = newPosition + posicionAnterior;
                } else {
                    out = posicionAnterior;
                }

                break;

            case 19:
                result = Integer.parseInt(JOptionPane.showInputDialog("Valor del equivalente mecánico del calor:\n1) 1 Joule = 0.24cal 1 cal = 4.18 Joule.\n2) 1 Joule = 0.04cal 1 cal = 4.18 Joule.\n3) 1 Joule = 0.64cal 1 cal = 4.18 Joule."));
                if (result == resultados[newPosition - 1]) {
                    out = newPosition + posicionAnterior;

                } else {
                    out = posicionAnterior;
                }

                break;

            case 20:
                JOptionPane.showMessageDialog(null,"En Hora Buena, Has Encontrado Una Escalera...\n\n\n Avanza a la casilla 31...   :)");  
                    out = 31;

                break;

            case 21:
                JOptionPane.showMessageDialog(null,"Lo Siento, Has Encontrado una Culebrita...\n\n\nRegresa a la Casilla 8...  ;(");
                    out = 8;

                break;

            case 22:
                JOptionPane.showMessageDialog(null,"En Hora Buena, Has Encontrado Una Escalera...\n\n\n Avanza a la casilla 33...   :)");
                    out = 33;

                break;

            case 23:
                result = Integer.parseInt(JOptionPane.showInputDialog("Forma de transmisión del calor en los cuerpos sólidos:\n1) Transición.\n2) Convección.\n3) Conducción."));
                if (result == resultados[newPosition - 1]) {
                    out = newPosition + posicionAnterior;
                } else {
                    out = posicionAnterior;
                }

                break;

            case 24:
                result = Integer.parseInt(JOptionPane.showInputDialog("Se llaman así los malos conductores del calor:\n1) Aislantes.\n2) Alcalinos.\n3) Negativos."));
                if (result == resultados[newPosition - 1]) {
                    out = newPosition + posicionAnterior;
                } else {
                    out = posicionAnterior;
                }

                break;

            case 25:
                result = Integer.parseInt(JOptionPane.showInputDialog("Es energía en tránsito que fluye de un cuerpo de mayor temperatura a otro:\n1) Frio.\n2) Calor.\n3) calido."));
                if (result == resultados[newPosition - 1]) {
                    out = newPosition + posicionAnterior;

                } else {
                    out = posicionAnterior;
                }

                break;

            case 26:
                JOptionPane.showMessageDialog(null,"Lo Siento, Has Encontrado una Culebrita...\n\n\nRegresa a la Casilla 15...  ;(");
                    out = 15;

                break;

            case 27:
                result = Integer.parseInt(JOptionPane.showInputDialog("Es el aparato que se utiliza para medir la cantidad de calor:\n1) Calorimetro.\n2) Termostato.\n3) Calibrador."));
                if (result == resultados[newPosition - 1]) {
                    out = newPosition + posicionAnterior;

                } else {
                    out = posicionAnterior;
                }

                break;

            case 28:
                result = Integer.parseInt(JOptionPane.showInputDialog("Instrumento de laboratorio que se utiliza para medir la temperatura:\n1) termómetro.\n2) Voltimetro.\n3) Galvanómetro."));
                if (result == resultados[newPosition - 1]) {
                    out = newPosition + posicionAnterior;
                } else {
                    out = posicionAnterior;
                }

                break;

            case 29:
                result = Integer.parseInt(JOptionPane.showInputDialog("Escala termométrica que se basa en el llamado “cero absoluto�?:\n1) Escala termica.\n2) Escala richter.\n3) Escala absoluta o Kelvin."));
                if (result == resultados[newPosition - 1]) {
                    out = newPosition + posicionAnterior;
                } else {
                    out = posicionAnterior;
                }

                break;

            case 30:
                result = Integer.parseInt(JOptionPane.showInputDialog("Científico que determinó el equivalente mecánico del calor:\n1) James Bond.\n2) James Joule.\n3) jin Carry."));
                if (result == resultados[newPosition - 1]) {
                    out = newPosition + posicionAnterior;
                } else {
                    out = posicionAnterior;
                }

                break;

            case 31:
                result = Integer.parseInt(JOptionPane.showInputDialog("Valor del equivalente mecánico del calor:\n1) 1 Joule = 0.24cal 1 cal = 4.18 Joule.\n2) 1 Joule = 0.04cal 1 cal = 4.18 Joule.\n3) 1 Joule = 0.64cal 1 cal = 4.18 Joule."));
                if (result == resultados[newPosition - 1]) {
                    out = newPosition + posicionAnterior;

                } else {
                    out = posicionAnterior;
                }

                break;

            case 32:
                result = Integer.parseInt(JOptionPane.showInputDialog("Parte de la física que estudia las conversiones del calor en trabajo:\n1) Equipotencial.\n2) Estadistica.\n3) Termodinámica."));
                if (result == resultados[newPosition - 1]) {
                    out = newPosition + posicionAnterior;

                } else {
                    out = posicionAnterior;
                }

                break;

            case 33:
                result = Integer.parseInt(JOptionPane.showInputDialog("¿Que teoría explica los estados de agregación de la materia y sus cambios?:\n1) Teoría estatica molecular.\n2) Teoría cinético molecular.\n3) Teoría cinético corpuscular."));
                if (result == resultados[newPosition - 1]) {
                    out = newPosition + posicionAnterior;

                } else {
                    out = posicionAnterior;
                }

                break;

            case 34:
                result = Integer.parseInt(JOptionPane.showInputDialog("Científico que determinó el equivalente mecánico del calor:\n1) James Bond.\n2) James Joule.\n3) jin Carry."));
                if (result == resultados[newPosition - 1]) {
                    out = newPosition + posicionAnterior;
                } else {
                    out = posicionAnterior;
                }

                break;

            case 35:
                JOptionPane.showMessageDialog(null,"Lo Siento, Has Encontrado una Culebrita...\n\n\nRegresa a la Casilla 14...  ;(");
                    out = 14;

                break;

            case 36:
                result = Integer.parseInt(JOptionPane.showInputDialog("Se llaman así los malos conductores del calor:\n1) Aislantes.\n2) Alcalinos.\n3) Negativos."));
                if (result == resultados[newPosition - 1]) {
                    out = newPosition + posicionAnterior;
                } else {
                    out = posicionAnterior;
                }

                break;


        }
        System.out.println("outFinal= " + out);
        return out;
    }

    
    public boolean terminar(int casillaJugador) {

        boolean salida = false;

        return salida;
    }
//    public static void main(String[] args) {
//                System.out.print("numJugadores99999");
//
//        Culebrita obj= new Culebrita();
//        // TODO code application logic here
//    }
}
