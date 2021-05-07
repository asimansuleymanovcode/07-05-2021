package az.code;

import java.util.ArrayList;

public class RandomTask {
    public static void main(String[] args) {
        String[] names = {"Pervin", "Iqbal", "Elgun", "Valeh", "Vusal"};
        rand(names);
    }

    private static void rand(String[] names) {
        ArrayList<Integer> uniqueNumbers = new ArrayList<>();
        int end = names.length;
        int count = 0;
        while (count != end) {
            int number = (int) (Math.random() * end) +1;
            if (!uniqueNumbers.contains(number)) {
                uniqueNumbers.add(number);
                count++;
            }
        }

        for (int i = 0; i < uniqueNumbers.size(); i++) {
            System.out.format("%d - %s\n", uniqueNumbers.get(i), names[i]);
        }
    }
}
