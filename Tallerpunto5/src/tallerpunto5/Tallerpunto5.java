package tallerpunto5;
import java.util.Scanner;
public class Tallerpunto5 {
    public static void main(String[] args) {
        AlgoritmoBusqueda k=new AlgoritmoBusqueda();
        int [] A=new int [2000];
        int [] B=new int [500];
        int dato, bin;
        for (int x=0;x<A.length;x++) A[x]=(int)(Math.random()*2000+1);
        for (int x=0;x<B.length;x++) B[x]=(int)(Math.random()*2000+1);
        Scanner ingreso=new Scanner(System.in);
        k.Ordenar(A);
        k.Ordenar(B);
        System.out.print("Ingrese un entero para buscar entre 1 y 2000: ");
        dato=ingreso.nextInt();
        System.out.println("Lista 1 (2000 numeros)");
        k.Secuencial(A, dato);
        bin=k.Binaria(A, dato);
        if (bin==-1) System.out.println("Metodo binario, no existe este dato");
        else System.out.println("Metodo binario 1, la posicion es: "+bin);
        System.out.println();
        
        //lista numero B
        System.out.println("Lista 2 (500 numeros)");
        k.Secuencial(B, dato);
        bin=k.Binaria(B, dato);
        if (bin==-1) System.out.println("Metodo binario, no existe este dato");
        else System.out.println("Metodo binario 2, la posicion es: "+bin);
    }
    
}
