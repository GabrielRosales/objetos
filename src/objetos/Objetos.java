package objetos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Objetos {

    /**
     * @param args the command line arguments
     */

    public static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int option = -1;
        double num1 = 0, num2 = 0, num3 = 0, num4 = 0;
        
        while(option != 0){
            option = menu();
            switch(option) {
                case 1:
        //        Perimetro del cuadrado
                    System.out.println("Insertar lado del cuadrado para calcular el perimetro");

                    num1 = scan.nextInt();

                    Cuadrado cuadrado = new Cuadrado(num1);

                    cuadrado.perimetro();

                    System.out.println("Perimetro del cuadrado: " + cuadrado.getperimetroCuadrado());
                    break;
                case 2:
        //        Area del cuadrado
                    System.out.println("Insertar lado del cuadrado para calcular el area");

                    num2 = scan.nextInt();

                    Cuadrado areaCuadrado = new Cuadrado(num2);

                    areaCuadrado.area();

                    System.out.println("Area del cuadrado: " + areaCuadrado.getareaCuadrado());
                    break;
                case 3:
        //        Perimetro del cubo
                    System.out.println("Insertar lado del cubo para calcular el perimetro");

                    num3 = scan.nextInt();

                    Cubo cubo = new Cubo(num3);

                    cubo.perimetro();

                    System.out.println("Perimetro del cubo: " + cubo.getperimetroCubo());
                    break;
                case 4:
        //        Volumen del cubo
                    System.out.println("Insertar lado del cubo para calcular el volumen");

                    num4 = scan.nextInt();

                    Cubo volumenCubo = new Cubo(num4);

                    volumenCubo.area();

                    System.out.println("volumen del cubo: " + volumenCubo.getvolumenCubo());
                    break;
            }
        }
    }
    
    public static int menu(){
        int option = -1;
        System.out.println("##############");
        System.out.println("1.- Perimetro del cuadrado");
        System.out.println("2.- Area del cuadrado");
        System.out.println("3.- Perimetro del cubo");
        System.out.println("4.- Volumen del cubo");
        System.out.println("5.- Regresar");
        System.out.println("0.- Salir");
        while(option < 0){
            try {
                option = scan.nextInt();
            }catch(InputMismatchException e) {
                System.out.println("El valor tiene que ser numerico");
                scan.nextInt();
                option = -1;
            }
            
        }
        return option;
    }
    
   
}
