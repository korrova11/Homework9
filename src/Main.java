// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int [] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;

        }

    public static void task1 () {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sigma = 0;
        //for (int i = 0; i < arr.length; i++) {
        for (int element: arr) {
            sigma += element;
        }
            System.out.println("Сумма трат за месяц составила " +sigma+ " рублей.");


        }
    public static void task2 () {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int max = 0;
        int min = 200_000;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if ( min > arr[i]) {

                min = arr[i];
            }
        }
            System.out.println("Минимальная сумма трат за день составила " +min+
                    " рублей. Максимальная сумма трат за день составила " +max+ " рублей.");

            }
    public static void task3 () {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        int sigma = 0;
        for (int element: arr) {
            sigma += element;
        }
        int middle =  sigma/30;
        System.out.println("Средняя сумма трат за месяц составила " +middle+ " рублей.");


    }
    public static void task4 () {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v','I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print ( reverseFullName[i]);


        }

        }
        }




