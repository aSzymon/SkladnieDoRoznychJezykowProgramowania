/** aSzymon - gtihub */

package Cwiczenie;

public class funkcje {

    static void wyswietl(){

        System.out.println("To niby zwraca a nie zwraca");

    }

    /***************************************/

    static String napis() {

        return "Funkcja zwraca stringa";
    }

    /***************************************/

    // Można tworzyć pare razy tą samą zmienną ale musi mieć inne argumenty, w innym wypadku jeśli by taka sama funkcja występywała pare razy będzie wyświetlany błąd
    // Tutaj występuje "przeciążanie funkcji"

    static int dodawanie() {

        return 0;

    }

    static int dodawanie(int x){
    // Jeśli tworzymy funkcje z int to argumenty także muszą być int'ami.
    // Jeśli by funkcja double -> argument też double itd.

        return ++x;
    // Dodaje do x jeden

    }

    static int dodawanie(int x,int y){

        return x + y;

    }

    /***************************************/

    public static void main(String[] args) {

        // Wyświetlanie funkcji "wyswietl" :

        wyswietl();

    /***************************************/

        // Wyświetlanie funkcji "napis" :
        // Można taką funkcje wyświetlić na 2 sposoby :

        String zmiennaDoFunNapis = napis();
        System.out.println(zmiennaDoFunNapis);

        // lub

        System.out.println(napis());

    /***************************************/

        // Wyświetlanie funkcji "dodawanie" :

        int wynikDodawania1 = dodawanie();
        int wynikDodawania2 = dodawanie(4);
        int wynikDodawania3 = dodawanie(5,7);
        System.out.println(wynikDodawania1);
        System.out.println(wynikDodawania2);
        System.out.println(wynikDodawania3);

        // Jeśli chcemy się odwołać do funkcji ale z innego pliku, należy najpierw odwołać się do tego pliku i dopiero odwołać się do funkcji np.
        /*
        * nazwaPliku nazwa = new nazwaPliku();
        * System.out.println(nazwa.nazwaFunkcji());
        * */

    }

}
