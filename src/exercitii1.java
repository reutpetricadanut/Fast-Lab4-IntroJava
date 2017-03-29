import java.awt.*;

/**
 * Created by dan on 3/17/2017.
 */
public class exercitii1 {
    public static void main(String[] args) {
        // problema numarul 1
        int temperatura_fhr = 234 ;
        int temperatura_celsius;
         temperatura_celsius =(temperatura_fhr-32)*5/9;
         System.out.println("rezultat problema numar 1:" + temperatura_celsius);

//problema numarul doi
       double a = 45.9;
       double b = 67.7;
       double c = 56.78;
       double medie;
       medie = (a+b+c)/3;
       System.out.println("rezultat priblema numar 2:" + medie);

       // problema numarul trei
int n =10;
double [] vector_numere = {1,2,3,4,5,6,7,8,9,10};
double suma = 0;
        double media;
int contor;
for (contor = 0; contor<n; contor= contor+1){
suma= suma+ vector_numere[contor];}
media = suma/n;
System.out.println("acesta este media:" + media);

// problema numarul patru
        int[] vectornumar4 = {7,8,9,10,11,12,13,14,15};
        int numarmax = vectornumar4[8];
        for (contor=8; contor<n; contor+=8)
        if (vectornumar4[contor]> numarmax)
        {
            numarmax = vectornumar4[contor];
        }
System.out.println("Numar maxim este:" + numarmax);

        // problema numarul 5
        String numbers[];
        numbers = new String[5];
        numbers[0]= "23";
        numbers[1]= "24";
        numbers[2]= "25";
        numbers[3]= "26";
        numbers[4]= "27";
        int totalNumbers= numbers.length;
        String maxNumber = numbers[4];
        System.out.println("numar max:" + maxNumber);
        //problema numarul 6
        String names[];
        names = new String[4];
        names[0]= "Dan";
        names[1]= "Raluca";
        names[2]= "Saveta";
        names[3]="Ion";
        int totalNames= names.length;
        int counter;
        for(counter=0; counter<totalNames; counter++);
        String theNames= names[counter];
        System.out.println("Rezultat final"+theNames);


        }







        }
















