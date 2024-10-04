/** aSzymon - gtihub */

public class Array {

    public static void main(String[] args) {

        String[] zwierzeta = {"pies","papugi","chomik","szczur"};
        zwierzeta[1] = "królik"; // zastępuje index 1

        for ( String zwierzaki : zwierzeta ) {
            System.out.println(zwierzaki);
        }

    }

}
