package com.Calendar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner leer = new Scanner (System.in );

        //Pidiendo Datos
        System.out.println("Ingrese Año: ");

        int año = leer.nextInt();

        String mes[] = new String[12]; // Arreglo para que aprarezcan los meses
        mes[0] = "Enero";
        mes[1] = "Febrero";
        mes[2] = "Marzo";
        mes[3] = "Abril";
        mes[4] = "Mayo";
        mes[5] = "Junio";
        mes[6] = "Julio";
        mes[7] = "Agosto";
        mes[8] = "Septiembre";
        mes[9] = "Octubre";
        mes[10] = "Noviembre";
        mes[11] = "Diciembre";


        //proceso
        for (int i = 1; i <= 12; i++ ){ //contador para los meses

            System.out.println("\n"+ mes[i-1]); //imprimiendo los meses junto con el arreglo
            System.out.println("Dom\tLun\tMar\tMie\tjue\tVie\tsab"); //Haciendo los dias y espacios entre ellos
            int dias = diasMes(año, i);

            //calculamos espacios para que el dia del mes empiece en
            // el dia correcto de la semana
            int z = zeller(año, i );
            int contDia = 0;
            for (int k = 0 ; k< z; k++){
                contDia++;
                System.out.print("\t");
            }
            //imprimimos los dias del mes
            for (int j=1; j<= dias; j++ ){
                System.out.print(j + "\t");
                contDia++; //contador para imprimir los dias de 7 en 7
                        if (contDia == 7){
                    System.out.println(); //imprime una linea en blanco luego de 7 Dias
                    contDia =0;
                        }
            }
        }


    }
    //devuelve
// 0 Domingo, 1 = lunes, 2= martes, 3 = miercoles,
//4 = jueves, 5 = viernes, 6 = sabado
    private static int zeller (int año, int mes){

        int a = (14 - mes)/12;
        int y = año - a;
        int m = mes + 12 * a - 2;
        int dia = 1, d;

        d = (dia + y + y/ 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;

        return (d);

    }
    public static int diasMes (int año, int mes){ //para calcular los parametros

        if (mes == 1 || mes == 3 || mes == 5 ||  mes == 6 ||  mes == 7 ||  mes == 8 ||  mes == 10 || mes == 12 ){ //calculo para saber en que termina
            return 31;
        }else if (mes == 2){

            if (esBisiesto( año)){
                return 29;

            }else {
                return 28;
            }
        }else{
            return 30;
        }

    }

    //Algoritmo para ver si un año es bisiesto
    public static boolean esBisiesto(int año){
        if (año % 4 == 0) {
            if (año % 100 != 0){
                if (año % 400 == 0){
                    return true;
                } else{

                    return false;

                }

                }
                else
                    return false;
            }
        return false;
    }

}

