import java.util.Scanner;

public class LukeNumber {

    int number;
    int position;

    public static void main(String[] args) {
        LukeNumber[] arr = new LukeNumber[15];

        // Initialize the array elements
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new LukeNumber();
        }

        calculate_number(arr);
        print_array(arr);

        int sum = find_sum(arr);
        System.out.println("Сума: " + sum);

        int foundNumber = find_number(arr);
        System.out.println("Знайдене число: " + foundNumber);
    }

    public static void calculate_number(LukeNumber[] array) {   //Обчислення послідовності
        if (array.length > 0) array[0].number = 1;
        if (array.length > 1) array[1].number = 3;

        for (int i = 2; i < array.length; i++) {
            array[i].number = array[i - 1].number + array[i - 2].number;  //Обчислення
            array[i].position = i;
        }
    }

    public static int find_sum(LukeNumber[] array) {
        Scanner sc = new Scanner(System.in);      //Об'єкт для введення
        System.out.println("Введіть кількість елементів для суми: ");

        int numElements = sc.nextInt();


        if (numElements > array.length) {
            System.out.println("Номер перевищує розмір масиву");
            return 0;
        }

        int sum = 0;
        for (int i = 0; i < numElements; i++) {
            sum += array[i].number;    //Обчислення суми
        }
        return sum;
    }

    public static void print_array(LukeNumber[] array) {
        for (LukeNumber ln : array) {
            System.out.print(ln.number + " ");
        }
        System.out.println();
    }

    public static int find_number(LukeNumber[] array) {   //Пошук необхідного числа
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть індекс: ");

        int index = sc.nextInt();


        if (index < 0 || index >= array.length) {
            System.out.println("Індекс за межами масиву.");
            return 0;
        }

        return array[index].number;
    }
}

