
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);

        int num1, num2;
        System.out.println("Digite el primer numero entero:");
        num1 = Leer.nextInt();
        System.out.println("Digite el segundo numero entero:");
        num2 = Leer.nextInt();

        double resta=num1-num2;


        double divisor1=num1/resta;


        double divisor2=num2/resta;

        System.out.println("------------------------");
        System.out.println("La diferencia entre los dos numeros es "+resta);
        System.out.println(num1+" / "+resta+" = "+divisor1);
        System.out.println(num2+" / "+resta+" = "+divisor2);
        System.out.println("------------------------");

    }

    }

