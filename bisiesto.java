import java.util.Scanner;
public class bisiesto {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int ano;
        System.out.println("###-Año bisiesto o no?-###");
        System.out.println("###-Escribe el año a evaluar-###");
        ano=a.nextInt();
        if ((ano%4==0)&&(ano%100!=0)||(ano%400==0)) {
            System.out.println("El año "+ano+" es biciesto");
        } else {
            System.out.println("El año "+ano+" no es biciesto");
        }
        
    }
}
