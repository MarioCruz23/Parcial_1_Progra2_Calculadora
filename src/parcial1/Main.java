package parcial1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args){
        Basica resultado1 = new Basica();
        Avanzada resultado2 = new Avanzada();
        Scanner entrada = new Scanner(System.in);
        int n1, n2, resultado;
        double resultadoavanzada;
        int opcion=0;
        do {
          opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"Selecione las siguientes opciones: \n"+
                  "1. Suma \n"+
                  "2. Resta \n"+
                  "3. Multiplicación \n"+
                  "4. División \n"+
                  "5. raíz cuadrada \n"+
                  "6. potencia \n"+
                  "7. seno \n"+
                  "8. Coseno \n"+
                  "9. Tangente \n"));
                switch(opcion){
                    case 1:
                        System.out.println("Ingrese el primer numero: ");
                        n1= entrada.nextInt();
                        System.out.println("Ingrese el segundo numero: ");
                        n2 = entrada.nextInt();
                        resultado = resultado1.sumar(n1, n2);
                        System.out.println("El resultado de la suma es: "+ resultado);
                        break;
                    case 2:
                        System.out.println("Ingrese el primer numero: ");
                        n1 = entrada.nextInt();
                        System.out.println("Ingrese el segundo numero: ");
                        n2 = entrada.nextInt();
                        resultado = resultado1.restar(n1, n2);
                        System.out.println("El resultado de la resta es: "+ resultado);
                        break;
                    case 3:
                        System.out.println("Ingrese el primer numero: ");
                        n1 = entrada.nextInt();
                        System.out.println("Ingrese el segundo numero: ");
                        n2 = entrada.nextInt();
                        resultado = resultado1.multiplicar(n1, n2);
                        System.out.println("El resultado de la multiplicacion es: "+ resultado);
                        break;
                    case 4:
                        System.out.println("Ingrese el primer numero: ");
                        n1 = entrada.nextInt();
                        System.out.println("Ingrese el segundo numero: ");
                        n2 = entrada.nextInt();
                        resultado = resultado1.dividir(n1, n2);
                        System.out.println("El resultado de la division es: "+ resultado);
                        break;
                    case 5:
                        System.out.println("Ingrese el primer numero: ");
                        n1 = (int) entrada.nextDouble();
                        resultadoavanzada = resultado2.raizcuadrada(n1);
                        System.out.println("El resultado de la raiz cuadrado es: "+ resultadoavanzada);
                        break;
                    case 6:
                        System.out.println("Ingrese el valor de la base: ");
                        n1 = entrada.nextInt();
                        System.out.println("Ingrese el valor del exponente: ");
                        n2 = entrada.nextInt();
                        resultadoavanzada = resultado2.potencia(n1, n2);
                        System.out.println("El resultado de la potencia es: "+ resultadoavanzada);
                        break;
                    case 7:
                        System.out.println("Ingrese numero para obtener el seno: ");
                        n1 = entrada.nextInt();
                        resultadoavanzada = resultado2.seno(n1);
                        System.out.println("El resultado del seno es: "+ resultadoavanzada);
                        break;
                    case 8:
                        System.out.println("Ingrese numero para obtener el coseseno: ");
                        n1 = entrada.nextInt();
                        resultadoavanzada = resultado2.coseno(n1);
                        System.out.println("El resultado del coseno es: "+ resultadoavanzada);
                        break;
                    case 9:
                        System.out.println("Ingrese numero para obtener el tangente: ");
                        n1 = entrada.nextInt();
                        resultadoavanzada = resultado2.tangente(n1);
                        System.out.println("El resultado de la tangente es: "+ resultadoavanzada);
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        System.out.println("Escoja la opcion correcta");
                }
            }while(opcion!=9);
        }
    }


        
    

