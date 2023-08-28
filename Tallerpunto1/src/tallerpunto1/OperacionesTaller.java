package tallerpunto1;
public class OperacionesTaller {
    public int [] punto1(int [] A){
        int g,temp;
        for (int y=0;y<A.length;y++){
            g=A[y]; //g toma el valor de el primer dato y lo guarda, cuando se repite el siglo guarda el segundo valor.
            for (int x=0+y;x<A.length;x++){
                if (A[x]<g) {
                    temp=g;
                    g=A[x];
                    A[x]=temp;
                }
            }
            A[y]=g;
        }
        return A;
    };   
    //Segundo Punto
    //hubiera hecho que esta funcion organizara los datos de menor a mayor
    //pero habiendo hecho la anterior, lo vi innecesario, ademas que ocupaba espacio
    public int punto2(int [] A){
        int m,n,mediana=0;
        int [] L=new int[(A.length+1)/2];
        int [] R=new int[A.length-L.length];
        for (int x=0;x<A.length;x++){
            if (x<L.length) L[x]=A[x];
            else R[x-L.length]=A[x];
        }
        m=L[0];
        n=R[0];
        for (int x=0;x<L.length;x++) {if (L[x]>m) m=L[x];}
        for (int x=0;x<R.length;x++) {if (R[x]<n) n=R[x];}
        for (int x=0;x<A.length;x++) {if (A[x]>=m && A[x]<n) mediana=A[x];}
        return mediana;
    };
}