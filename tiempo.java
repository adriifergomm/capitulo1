import java.util.Scanner;
public class tiempo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos segundos quieres introducir: ");
        int t = sc.nextInt();  

        int horas = t / 3600;
        int minutos = (t % 3600) / 60;
        int segundos = (t % 3600) % 60;

        System.out.println(horas + " horas, " + minutos + " minutos, " + segundos + " segundos");
    }
}
