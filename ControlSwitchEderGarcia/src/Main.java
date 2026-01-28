import java.util.Scanner;

public class Main {
    public static int Opcion=0;
    public static double numeroUno=0;
    public static double numeroDos=0;
    public static double resultado=0;
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
        System.out.println("Bienvenido al menú con las siguientes opciones: \n 1) Sumar\n 2) Restar\n 3) Multiplicar\n 4) Dividir");
        Opcion=scanner.nextInt();
        System.out.println("Digita el primer numero: ");
        numeroUno=scanner.nextDouble();
        System.out.println("Digita el segundo numero: ");
        numeroDos=scanner.nextDouble();
        switch(Opcion){
            case 1:
                System.out.println("Seleccionaste Suma");
                resultado=numeroUno+numeroDos;
                System.out.printf("El resultado de sumar "+numeroUno+" mas "+numeroDos+" es: "+resultado);
                break;
            case 2:
                System.out.println("Seleccionaste Resta");
                resultado=numeroUno-numeroDos;
                System.out.printf("El resultado de restar "+numeroUno+" menos "+numeroDos+" es: "+resultado);
                break;
            case 3:
                System.out.println("Seleccionaste Multiplicacion");
                resultado=numeroUno*numeroDos;
                System.out.println("El resultado de multiplicar "+numeroUno+" por "+numeroDos+" es: "+resultado);
                break;
            case 4:
                System.out.println("Seleccionaste Division");
                if(numeroDos==0){
                    System.out.println("No se puede dividir entre cero");
                    break;
                }
                else{
                    resultado=numeroUno/numeroDos;
                    System.out.println("El resultado de dividir "+numeroUno + " entre "+ numeroDos+ " es: "+resultado);
                }
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }
    }

}