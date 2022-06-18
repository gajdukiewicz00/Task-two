package Haidukevich;

public class TaskTwo {
    public static void main(String[] args) {
        int a =0;
        int [] array = new int[100];
        for (int b = 0; b < array.length; b++) {
            array[b] = (int) Math.round((Math.random() * 100) + 1);
        }
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 == 0 && array[j] > 0) {
                a++;
            }
        }
        System.out.println(a);
    }
}
