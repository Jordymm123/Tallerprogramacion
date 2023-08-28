package tallerpunto3;
public class Clase {
    public float mediaclase (float [] materia){
        float m=0;
        for (int x=0;x<materia.length;x++)m+=materia[x];
        return m/materia.length;
    };
}
