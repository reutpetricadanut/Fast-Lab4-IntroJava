
/**
 * Created by dan on 3/21/2017.
 */
public class lab4 {

    public static void main(String[] args) {
        // sa se citeasca un string de la tastatura
        // sa se afiseze stringul in uppercase
        String s;
        s = SkeletonJava.readStringConsole("introduceti stringul:");
        System.out.println(s.toUpperCase());

String cale ="c://temp//tt//fisier.txt";
int delacat=cale.indexOf(".");
String extensie = cale.substring(delacat);
        System.out.println(extensie);


    }
}

