package tallerpunto3;
public class Asignaturas {
    public float [] Asignatura(float [][] notas){
        float [] materia=new float[notas.length];
        for (int x=0;x<notas.length;x++) materia[x]=0;
        for (int x=0;x<notas.length;x++){
            for (int y=0;y<notas[0].length;y++){
                materia[x]+=notas[x][y];
            }
        }
        for (int x=0;x<notas.length;x++) materia[x]=materia[x]/notas[0].length;
        return materia;
    };
}
