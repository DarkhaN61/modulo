import java.util.Scanner;
n
public class modulodedescomponer{
    public static void main (String[] args){
       Scanner leer = new Scanner(System.in);
       System.out.print("ingrese un numero que desee descomponer en multiplos de 10");
       long n = scanner.nextLong(); 
       
       System.out.print("Descomposicion:");
       descomponerEnEscalas(n);
  }
   public static void descomponerEnEscala(Long n){
   long m = 1;
   while(n>0){
    Long d = n % 10;
    if (d !=0){
           System.out.print(d * m);     
      }
      n = n / 10;
      m *= 10;
    }
  }
}