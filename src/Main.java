public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1,2");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        double[] fraction = {1.57, 7.654, 9.986};
        int[] array = {11, 22, 63};
        for (int i = 0; i < 3; i++) {
            if (i < 2) {
                System.out.print(numbers[i] + ",");
            } else {
                System.out.print(numbers[i]);
            }
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            if (i < 2) {
                System.out.print(fraction[i] + ",");
            } else {
                System.out.print(fraction[i]);
            }
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            if (i < 2) {
                System.out.print(array[i] + ",");
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.println();
        System.out.println("Задача №3");
        for (int i = 2; i >= 0; i = i - 1) {
            if (i >= 1) {
                System.out.print(numbers[i] + ",");
            } else {
                System.out.print(numbers[i]);
            }
        }
        System.out.println();
        for (int i = 2; i >= 0; i = i - 1) {
            if (i >= 1) {
                System.out.print(fraction[i] + ",");
            } else {
                System.out.print(fraction[i]);
            }
        }
        System.out.println();
        for (int i = 2; i >= 0; i = i - 1) {
            if (i >= 1) {
                System.out.print(array[i] + ",");
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.println();
        System.out.println("Задача №4");
        for (int i = 0; i < 3; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            } else {
                System.out.println(numbers[i] = numbers[i] + 1);
            }
        }
    }
}