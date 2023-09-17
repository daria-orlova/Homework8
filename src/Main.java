public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        System.out.println("Объявление массивов");
        int [] one = new int[]{1, 2, 3};
        float [] two = {1.57f, 7.654f, 9.986f};
        boolean [] three = new boolean[]{true, false};
        char [] four = {'о', 'д', 'т'};
        String [] five = new String[]{"один", "два", "три"};
        System.out.println();

        System.out.println("Задача 2");
        System.out.println("Распечатывание элементов массива:");
        for (int i = 0; i < one.length; i++) {
            if (i == one.length - 1) {
                System.out.println(one[i]);
            } else {
                System.out.print(one[i] + ", ");
            }
        }
        for (int i = 0; i < two.length; i++) {
            if (i == two.length - 1) {
                System.out.println(two[i]);
            } else {
                System.out.print(two[i] + ", ");
            }
        }
        for (int i = 0; i < three.length; i++) {
            if (i == three.length - 1) {
                System.out.println(three[i]);
            } else {
                System.out.print(three[i] + ", ");
            }
        }
        for (int i = 0; i < four.length; i++) {
            if (i == four.length - 1) {
                System.out.println(four[i]);
            } else {
                System.out.print(four[i] + ", ");
            }
        }
        for (int i = 0; i < five.length; i++) {
            if (i == five.length - 1) {
                System.out.println(five[i]);
            } else {
                System.out.print(five[i] + ", ");
            }
        }
        System.out.println();

        System.out.println("Задача 3");
        System.out.println("Распечатывание элементов массива в обратном порядке:");
        for (int i = one.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(one[i]);
            } else {
                System.out.print(one[i] + ", ");
            }
        }
        for (int i = two.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(two[i]);
            } else {
                System.out.print(two[i] + ", ");
            }
        }
        for (int i = three.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(three[i]);
            } else {
                System.out.print(three[i] + ", ");
            }
        }
        for (int i = four.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(four[i]);
            } else {
                System.out.print(four[i] + ", ");
            }
        }
        for (int i = five.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(five[i]);
            } else {
                System.out.print(five[i] + ", ");
            }
        }
        System.out.println();

        System.out.println("Задача 4");
        System.out.println("Замена нечетных чисел в массиве на четные:");
        for (int i = 0; i < one.length; i++) {
            if (one [i] % 2 == 0 && i != one.length - 1) {
                System.out.print(one[i] + ", ");
            } else if (one [i] % 2 == 0 && i == one.length - 1){
                System.out.println(one[i]);
            } else if (one [i] % 2 != 0 && i != one.length - 1){
                int newElement = one [i] + 1;
                System.out.print(newElement + ", ");
            } else {
                int newElement = one [i] + 1;
                System.out.println(newElement);
            }
        }
    }
}