package ArrayListDemo;

import java.util.Scanner;

public class Main2 {
    public static boolean findElement(int[] a, int value) {
        boolean check = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == value) {
                check = true;
        }
    }
    return check;
}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] myArray = {1, 2, 3, 4, 5, 6};
        String[] day = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    boolean answer = findElement(myArray, 5);
        System.out.println("Find element: " + answer);

        System.out.println("Enter the number: ");
        int num = in.nextInt();
        if (1 <= num && num <= 7) {
            System.out.println(""+ day[num -1]);
        } else {
            System.out.println("Invalid");
        }
            System.out.println("================================================================");
        for (String tempDay : day) {
            System.out.println(""+ tempDay);
        }
            System.out.println("================================================================");
        for (int i = day.length - 1; i >= 0; i--) {
            System.out.println(""+day[i]);
        }
    }
}