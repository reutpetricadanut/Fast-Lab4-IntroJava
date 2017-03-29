/**
 * Created by dan on 3/29/2017.
 */
import java.util.Scanner;
public class problem2 {

        public static void main(String[] args) {
            Scanner citireTastatura = new Scanner(System.in);
            int[] vectorNumere = {1, 2, 4, 5, 6, 8, 56, 65};
            int index;
            int pozitie = -1;

            System.out.println("Intdouceti numarul pe care il cautati: ");
            int numarDeCautat = citireTastatura.nextInt();

            for ( index = 0;  index < 8; index++) {
                if (vectorNumere[index] == numarDeCautat) {
                    pozitie = index;
                }
            }

            if (pozitie == -1) {
                System.out.println("Nu am gasit numarul cautat.");
            }
            else {
                System.out.println(String.format("Am gasit numarul %d pe poozitia %d.", numarDeCautat, pozitie));
            }
        }
    }

