import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        example();

    }
    static void example() {
        List<List<String>> biDemArrList = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            biDemArrList.add(i, new ArrayList<>());
                for (int j = 0; j < 8; j++) {
                    biDemArrList.get(i).add(j, "◯");
                }
            if (i%2==0){
                for (int j = 1; j < 8; ) {
                    biDemArrList.get(i).add(j, "●");
                    j=j+2;
                }
            } else {
                for (int j = 0; j < 8; ) {
                    biDemArrList.get(i).add(j, "●");
                    j=j+2;
                }
            }
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(biDemArrList.get(i).get(j) + "    ");
            }
            System.out.println("\n");
        }
    }
}