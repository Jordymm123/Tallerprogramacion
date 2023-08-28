package tallerpunto3;
public class Funciones {
    public void mostrar(float [][]A){
        for (int x=0;x<A.length;x++){
            for (int y=0;y<A[0].length;y++){
                System.out.print(A[x][y]+" ");
            }
            System.out.println();
        } 
        System.out.println();
    };
    public float [][] asignar(float [][]A){
      for (int x=0;x<A.length;x++){
            for (int y=0;y<A[0].length;y++){
                A[x][y]=(float)(Math.random()*5+1);
            }
        }  
      return A;
    };
    //Shellsort
    public float [] maAme(float []A){
        float g,temp;
        int z=0;
        float [] B=new float [A.length];
        for (int y=A.length-1;y>=0;y--){
            z++;
            g=A[y]; 
            for (int x=0;x<A.length-z;x++){
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
}
