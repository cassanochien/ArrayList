package ArrayListDemo;

public class Main1 {
    public static void main(String[] args) {
        int[] myArray = new int[4];
        int sum = 0, sum2 = 0; 
    
    long start01 = System.nanoTime();
        myArray[0] = 9;
        myArray[1] = 10;
        myArray[2] = 90;
        myArray[3] = 49;

        for(int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
        }
        //
        long end01 = System.nanoTime();
        long duration01 = end01 - start01;
        //
        long start02 = System.nanoTime();
        int j = 0;
        while(j < myArray.length) {
            sum2 = sum2 + myArray[j];
            j++;
        }
        long end02 = System.nanoTime();
        long duration02 = end02 - start02;
            System.out.println("Duration 1: " + duration01 + " miliseconds");
            System.out.println("Duration 2: " + duration02 + " miliseconds");
    }
}
