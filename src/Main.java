import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    private static void task1() {
        System.out.println("Задание 1");

        System.out.println("**Integer array**");
        int[] array1 = new int[3];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = i + 1;
        }
        System.out.println("First list: " + Arrays.toString(array1) + "\n");

        System.out.println("**Fractional array**");
        double[] array2 = {1.57, 7.654, 9.98};
        System.out.println("Second list: " + Arrays.toString(array2) + "\n");

        System.out.println("**Arbitrary array**");
        List<Object> multiarray = new ArrayList<>();

        multiarray.add("Hello");
        multiarray.add(42);
        multiarray.add(1.75f);
        multiarray.add(3.1415);
        multiarray.add(true);

        System.out.println("Third list: " + multiarray + "\n");
    }


    private static void task2() {
        System.out.println("Задание 2");
        int[] list = IntStream.rangeClosed(1, 3).toArray(); // generating a sequence of elements from 1 to 3
        //********************************
        System.out.print("First list: ");

        for (int num:list) {
            if (num != list[list.length - 1])  System.out.printf("%d, ", num);
            else System.out.printf("%d%n%n", num);
        }

        //********************************
        System.out.print("Second list: ");
        double[] list2 = {1.57, 7.654, 9.98};
        DecimalFormat df = new DecimalFormat("#.##");

        for (double num:list2) {
            String formattedNum = df.format(num);
            if (num != list2[list2.length-1]) System.out.print(formattedNum + ", ");
            else System.out.print(formattedNum + "\n\n");
        }

        //********************************
        System.out.print("Third list: ");
        List<Object> multilist = new ArrayList<>();
        multilist.add("Hello");
        multilist.add(42);
        multilist.add(1.75f);
        multilist.add(3.1415);
        multilist.add(true);

        for (Object object:multilist) {
            if (object != multilist.get(multilist.toArray().length - 1)) System.out.printf("%s, ", object);
            else System.out.printf("%s%n%n", object);
        }
    }

    private static void task3() {
        System.out.println("Задание 3");
        int[] list = IntStream.rangeClosed(1, 3).toArray(); // generating a sequence of elements from 1 to 3
        //********************************
        System.out.print("First list: ");

        for (int i = list.length-1; i >= 0; i --) {
            if (list[i] == list[0])  System.out.printf("%d%n%n", list[i]);
            else System.out.printf("%d, ", list[i]);
        }

        //********************************
        System.out.print("Second list: ");
        double[] list2 = {1.57, 7.654, 9.98};
        DecimalFormat df = new DecimalFormat("#.###");

        for (int i = list2.length-1; i >= 0; i --) {
            String formattedNum = df.format(list2[i]);
            if (list2[i] == list2[0]) System.out.print(formattedNum + "\n\n");
            else System.out.print(formattedNum + ", ");
        }

        //********************************
        System.out.print("Third list: ");
        List<Object> multilist = new ArrayList<>();
        multilist.add("Hello");
        multilist.add(42);
        multilist.add(1.75f);
        multilist.add(3.1415);
        multilist.add(true);

        ListIterator<Object> iterator = multilist.listIterator(multilist.size());

        while (iterator.hasPrevious()) {
            Object object = iterator.previous();
            if (!iterator.hasPrevious()) System.out.printf("%s%n%n", object);
            else System.out.printf("%s, ", object);
        }
    }

    private static void task4() {
        System.out.println("Задание 4");
        int[] list = IntStream.rangeClosed(1, 3).toArray(); // generating a sequence of elements from 1 to 3
        //********************************
        System.out.print("First list: ");

        for (int i = 0; i < list.length; i++) {
            if ((list[i] & 1) == 0) {
                list[i]++;
            }
        }
        System.out.println(Arrays.toString(list));
    }

}