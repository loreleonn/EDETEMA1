import java.util.Scanner;

public class Main {
    //ejemplo metods estaticos
    public static int ejSuma(int a, int b){
        return a+b;
    }

    public static int CalculoSegundos(int years, int meses, int dias){

        int diasTotales = (years * 365) + (meses * 30) + dias;
        int segundos = diasTotales * 24 * 60 * 60;
        return segundos;
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
        System.out.println(segs_years1);

        /*los metodos estaticos o metodos de clase, pueden
        ser llamados sin que haya objetos de esta clase*/

        int num = 0;
        num = ejSuma(10,2);
        System.out.println(num);

        // OPCION 2 sin inputs
        int segundosFecha = 0;
        segundosFecha = CalculoSegundos(200, 2, 3);
        System.out.println(segundosFecha);

        //opcion 2 con inputs
        Scanner scanner = new Scanner(System.in);
        System.out.print("introducir años: ");
        int years = scanner.nextInt();
        System.out.print(" introducir meses: ");
        int meses = scanner.nextInt();
        System.out.print(" introducir dias: ");
        int dias = scanner.nextInt();
        scanner.close();

        System.out.println("Total de segundos: " + CalculoSegundos(years, meses, dias));


    }

}