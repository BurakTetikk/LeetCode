package TwoSum;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        int target = 6;
        int sum = -1;
        int count = 0;
        int indice1 = -1;
        int indice2 = -1;
        boolean isTwice = true;



        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                sum = arr[i] + arr[j];
                if (sum == target) {
                    indice1 = i;
                    indice2 = j;
                    count++;
                }
            }
        }

        if (count > 1) {
            isTwice = false;
        }

        if (isTwice) {
            System.out.println("["+ indice1 + "]" + "[" + indice2 + "]");
        } else {
            System.out.println("There are two solutions!");
        }
    }
}
