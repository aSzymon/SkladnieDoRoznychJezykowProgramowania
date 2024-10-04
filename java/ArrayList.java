/** aSzymon - gtihub */

import java.util.ArrayList;

public class ArrayList {

    public static void main(String[] args) {

    ArrayList<String> zabawki = new ArrayList<>();
        zabawki.add("piłka");
        zabawki.add("lalka");
        zabawki.add("układanka");

        for (String zabawka : zabawki) {
            System.out.println(zabawka);
        }

        System.out.println(" ");

    ArrayList<Integer> liczby = new ArrayList<>();
        liczby.add(0);
        liczby.add(2);
        liczby.add(4);
        liczby.add(7);

        for (Integer liczba : liczby) {
            System.out.println(liczba);
        }

        System.out.println(" ");

    ArrayList<String> kolejnosc = new ArrayList<>();
        kolejnosc.add("zero"); // dodaje element do tablicy
        kolejnosc.add(0 ,"jeden");
        kolejnosc.add("dwa");
        kolejnosc.add(1,"trzy");
        kolejnosc.add(2,"cztery");

        for (String kolejnoscLiczb : kolejnosc) {
            System.out.println(kolejnoscLiczb);
        }

        System.out.println(" ");

    ArrayList<String> kolory = new ArrayList<>();
        kolory.add("bialy");
        kolory.add("czarny");
        kolory.add("czerwony");
        kolory.add("zielony");
        kolory.add("niebieski");
        kolory.add("zolty");

        for (String kolor : kolory) {
            System.out.println(kolor);
        }

        System.out.println(" ");

        kolory.remove(3); // usuwa dany index z tablicy
        kolory.remove(4);

        for (String kolor : kolory) {
            System.out.println(kolor);
        }

        System.out.println(" ");

        ArrayList<String> dniTygodnia = new ArrayList<>();
        dniTygodnia.add("poniedzialek");
        dniTygodnia.add("wtorek");
        dniTygodnia.add("sroda");
        dniTygodnia.add("czwartek");
        dniTygodnia.add("piatek");
        dniTygodnia.add("sobota");
        dniTygodnia.add("niedziela");

        for (String dzienTygodnia :dniTygodnia) {
            System.out.println(dzienTygodnia);
        }

        System.out.println(" ");

        dniTygodnia.clear(); // czyści całą tablice

        for (String dzienTygodnia :dniTygodnia) {
            System.out.println(dzienTygodnia);
        }
        System.out.println("Tu nic nie ma");

    }

}
