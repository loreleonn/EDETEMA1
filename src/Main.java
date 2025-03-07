import java.util.Scanner;

public class Main { //nunca se le pide nada al usuario fuera del main
    //ejemplo metods estaticos
    public static int ejSuma(int a, int b){
        return a+b;
    }

    public static int CalcSegundos(int years, int meses, int dias){

        return ((years * 365) + (meses * 30) + dias) * 24 * 60 * 60;
    }

    public static void main(String[] args) {
        //ejercicio 1 opcion 1, sin usar metodos
        byte segs1 = 60;
        byte mins1 = 60;
        byte horas1 = 24;
        short dias1 = 365;
        byte years1 = 0;

        /*short a = (short) 32769;
        System.out.println(a)*/

        int segs_years1 = dias1 * horas1 * mins1 * segs1;
        System.out.println("segundos en un año: "+segs_years1);

        /*los metodos estaticos o metodos de clase, pueden
        ser llamados sin que haya objetos de esta clase*/

        //ejemplo metodo estatico
        int num = 0;
        num = ejSuma(10,2);
        System.out.println(num);

        // opcion 2 ejercicio 1 sin inputs
        int segundosFecha = 0;
        segundosFecha = CalcSegundos(2, 2, 2);
        System.out.println("total de segundos1: "+ segundosFecha);

        //opcion 2 ejercicio 1 con inputs
        Scanner scanner = new Scanner(System.in);
        System.out.print("introducir años: ");
        int years = scanner.nextInt();
        System.out.print(" introducir meses: ");
        int meses = scanner.nextInt();
        System.out.print(" introducir dias: ");
        int dias = scanner.nextInt();
        scanner.close();
        System.out.println("total de segundos2: " + CalcSegundos(years, meses, dias));


        //ejercicio 2
        System.out.println("maximo valor de un char: " + (int) Character.MAX_VALUE);
        System.out.println("maximo valor de un short: " + Short.MAX_VALUE);
        System.out.println("maximo valor de un int: " + Integer.MAX_VALUE);
        System.out.println("maximi valor de un byte: " + Byte.MAX_VALUE); // tambien puse el byte ya de una vez





    }

}