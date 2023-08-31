package tallerpunto4;
import java.util.Scanner;
public class Tallerpunto4 {
    public static void main(String[] args) {
        String [] nombre=new String [1000];
        String [] palabras={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};// mira esto????
        String Buscanombre, checkno="";
        long Buscanumero, checknu=0;
        long [] numero= new long [1000];
        int y, op, r=1;
        Scanner tomadato=new Scanner(System.in);
        Scanner tomadatostr=new Scanner(System.in);
        boolean check;
        for (int x=0;x<numero.length;x++) nombre[x]="";
        for (int x=0;x<numero.length;x++){
            numero[x]=(long)(Math.random()*400000000+1);//queria datos aleatorios
            for (int z=0;z<=15;z++){
                y=(int)(Math.random()*25+1);
                nombre[x]+=palabras[y];//tanto en string como en long
            }
        }
        System.out.println("unos nombres --> "+nombre[0]+" "+nombre[1]+" "+nombre[2]);
        System.out.println("unos numeros --> "+numero[0]+" "+numero[1]+" "+numero[2]);
        System.out.println();
        while (r!=0){
            check=false;
            System.out.println("Consultar Numero o telefono? ");System.out.print("Digite 0 para no consultar, 1 para Consultar numero y 2 para consultar Telefono ->");
            op=tomadato.nextInt();
            switch (op){
                case 1: System.out.print("Digite un nombre ->");
                Buscanombre=tomadatostr.nextLine();
                for (int x=0;x<nombre.length;x++){
                    if (nombre[x].equals(Buscanombre)){
                        checknu=numero[x];
                        check=true;
                    }
                }
                if (check==true) System.out.println("El numero asociado a este nombre es: "+checknu);
                else System.out.println("Este nombre no esta registrado");
                break;
                case 2: System.out.print("Digite un numero ->");
                Buscanumero=tomadato.nextLong();
                for (int x=0;x<nombre.length;x++){
                    if (numero [x]==Buscanumero){
                        checkno=nombre[x];
                        check=true;
                    }
                }
                if (check==true) System.out.println("El nombre asocaiado a este numero es: "+checkno);
                else System.out.println("Este numero no esta registrado");
                break;
                case 0: r=0;
                break;
                default: System.out.println("Dato incorrecto, por favor digite uno de los numeros antes mencionados");
            }
            System.out.println();
        }
    }// estoy mal de la cabeza verdad?
   
    
}
