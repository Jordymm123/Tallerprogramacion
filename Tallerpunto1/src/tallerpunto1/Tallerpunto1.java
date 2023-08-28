package tallerpunto1;
public class Tallerpunto1 {
    public static void main(String[] args) {
        OperacionesTaller op=new OperacionesTaller();
        int [] num=new int [10];
        int [] p2=new int [9];
        System.out.println("Primer punto: ");
        for (int x=0;x<num.length;x++) num[x]=(int)(Math.random()*100+1); 
        op.punto1(num);
        for (int x=0;x<num.length;x++) System.out.print(num[x]+" ");
        System.out.println();
        //admito que hubiera hecho que la segunda funcion organizara los datos para la mediana
        //pero lo vi innecesario y para ahorrar codigo, solo utilice la primera de nuevo
        System.out.println("Segundo punto: ");
        for (int x=0;x<p2.length;x++) p2[x]=(int)(Math.random()*100+1);
        op.punto1(p2);
        for (int x=0;x<p2.length;x++) System.out.print(p2[x]+" ");
        System.out.println();
        System.out.println("mediana: "+op.punto2(p2));
        }
}//luego de aca no sigue el codigo.
