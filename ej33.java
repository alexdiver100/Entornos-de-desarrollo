import java.util.Scanner;
//Diseñar un programa que pida números enteros, para cada número muestre si es par o impar, si es positivo o negativo y su cuadrado.
//	 El programa finalizará cuando se introduzca un 0.
public class ej33 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
        
        int num=-1;

        while (num!=0){
            System.out.print("Introduce un numero: ");
            num = scan.nextInt();
            if(num!=0){
                if (num % 2 == 0){
                    System.out.println("Es par el numero: " + num);
                    if (num < 0){
                        System.out.println("Es negativo ");   
                    }else{
                        System.out.println("Es positivo ");
                    }
                }else{
                    System.out.println("Es impar el numero: " + num);
                    if (num < 0){
                        System.out.println("Es negativo ");
                    }else{
                        System.out.println("Es positivo ");  
                    }
                }
                System.out.println("El cuadrado de "+num+" es "+ num*num);
            }  
        }
	}
}