package tallerpunto3;
public class Tallerpunto3 {
    public static void main(String[] args) {
        Funciones F=new Funciones();
        Asignaturas A=new Asignaturas();
        Clase C=new Clase();
        float [][]notas1=new float [5][3];
        float [][]notas2=new float [5][3];
        float [][]notas3=new float [5][3];
        F.asignar(notas1);F.asignar(notas2);F.asignar(notas3);
        System.out.println("Cada fila es una asignatura, cada columna es una nota");
        System.out.println("Notas estudiante 1:");F.mostrar(notas1);
        System.out.println("Notas estudiante 2:");F.mostrar(notas2);
        System.out.println("Notas estudiante 3:");F.mostrar(notas3);
        //hora del promedio
        System.out.println("Cada columna ahora representa una asignatura");
        System.out.println("Promedio de las notas de estudiante 1: ");
        for (int x=0;x<notas1.length;x++)System.out.print(A.Asignatura(notas1)[x]+" ");System.out.println();
        System.out.println("Promedio de las notas de estudiante 2: ");
        for (int x=0;x<notas1.length;x++)System.out.print(A.Asignatura(notas2)[x]+" ");System.out.println();
        System.out.println("Promedio de las notas de estudiante 3: ");
        for (int x=0;x<notas1.length;x++)System.out.print(A.Asignatura(notas3)[x]+" ");System.out.println();
        //ahora toca promedio de la clase 
        System.out.println();
        System.out.println("Promedio de la clase: "+(C.mediaclase(A.Asignatura(notas1))+C.mediaclase(A.Asignatura(notas2))+C.mediaclase(A.Asignatura(notas3)))/3);
        System.out.println();System.out.println("Ordenando las notas individuales de cada alumno: ");
        System.out.print("Alumno 1: ");
        for (int x=0;x<notas1.length;x++)System.out.print(F.maAme(A.Asignatura(notas1))[x]+" ");System.out.println();
        System.out.print("Alumno 2: ");
        for (int x=0;x<notas1.length;x++)System.out.print(F.maAme(A.Asignatura(notas2))[x]+" ");System.out.println();
        System.out.print("Alumno 3: ");
        for (int x=0;x<notas1.length;x++)System.out.print(F.maAme(A.Asignatura(notas3))[x]+" ");System.out.println();
    }
    
}
