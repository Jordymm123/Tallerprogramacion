package tallerpunto5;
public class AlgoritmoBusqueda {
    public int [] Ordenar(int [] A){
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
    public void Secuencial(int A[], int a){
        String p="";
        for (int x=0;x<A.length;x++){
            if (A[x]==a){
                p+=x+" ";
            }
        }
        System.out.println("Las posiciones donde sale el numero pedido son: "+p);
    };
    public int Binaria(int A[], int a){
        int l=0, r=A.length-1;
        while (l<=r){
            int j = l+(r-l)/2;
            if (A[j]==a)
                return j;
            if (A[j]<a)
                l=j+1;
            else
                r=j-1;
        }
        return -1;
    };
    //Iniciar con el elemento intermedio del array como clave.
    //Si el valor de la clave es igual al elemento buscado entonces se devuelve el índice de la clave inicial.
    //Si el valor de la clave es menor que el elemento buscado en mitad del intervalo, acotar el intervalo a la mitad más baja.
    //Si no, acotar el intervalo a la mitad más alta.
    //Repetir los pasos anteriores hasta que el intervalo quede vacío.
}
