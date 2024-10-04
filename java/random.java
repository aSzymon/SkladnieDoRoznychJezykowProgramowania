/** aSzymon - gtihub */

import java.util.Random;

public class random {

    public static void main(String[] args) {

        Random random = new Random();

        int losowyInt = random.nextInt();
        double losowyDouble = random.nextDouble();
        float losowyFloat = random.nextFloat();
        boolean losowyBoolean = random.nextBoolean();

        System.out.println(losowyInt);
        System.out.println(losowyDouble);
        System.out.println(losowyFloat);
        System.out.println(losowyBoolean);

        System.out.println("");

        for (int i = 1; i < 10; i++){

            int liczba = random.nextInt();
            System.out.println(liczba);

        }

        System.out.println("");

        for (int l = 1; l < 10; l++){

            boolean takNie = random.nextBoolean();
            System.out.println(takNie);

        }

        System.out.println("");

        int losowanie1 = random.nextInt(100);

        for (int j = 0; j < 20; j++) {
            System.out.println(losowanie1);
        }

        System.out.println("");

        for (int k = 0; k < 20; k++) {
            int losowanie2 = random.nextInt(100);
            System.out.println(losowanie2);
        }

    }

}
