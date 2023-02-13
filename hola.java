import java.util.Scanner;

public class hola {
   public static void main(String[] args) {
      Scanner hola = new Scanner(System.in);
      int[] denominaciones = {500, 200, 100, 50, 20, 10, 5,2,1};
      int cantidad;
      int billetes;

      System.out.print("Introduce la cantidad en euros: ");
      cantidad = hola.nextInt();

      System.out.println("\nBilletes necesarios:");
      for (int i = 0; i < denominaciones.length; i++) {
         billetes = cantidad / denominaciones[i];
         if (billetes > 0) {
            System.out.println(billetes + " billetes de " + denominaciones[i] + " euros");
         }
         cantidad = cantidad % denominaciones[i];
      }
   }
}
