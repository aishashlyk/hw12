import java.util.Scanner;
import java.util.Arrays;

public class Main {
    //1
    public static String firstTask(double a, double b){
        return "Sum: "+(a + b)+ ", Multiplication: " + (a * b) +
                ", Subtraction: " + (a - b) + ", Division " + (a/b) + ", Remaining: " + (a % b);
    }
    //2
    public static void secondTask(){
        for(int i=0; i<10; i++){
            System.out.print((i*2+1)+" ");
        }
    }
    //3
    public static void thirdTask(int a3, int b3){
        a3 ^= b3;
        b3 ^= a3;
        a3 ^= b3;
        System.out.println("First number: "+a3+", Second number: "+b3);
    }
    //4
    public static void fourthTask(int a4, int b4, int c4){
    int max = Math.max(a4, Math.max(b4, c4));
    System.out.println("The maximum between them is: "+max);
    }
    //5
    public static void fifthTask(int a5){
        if(a5>=0){
            System.out.println("The number "+a5+" is positive.");
        }else{
            System.out.println("The number "+a5+" is negative.");
        }
    }
    //6
    public static void sixthTask(String a6){
        String b6 = a6.replace('a', 'b');
        System.out.println(b6);
    }
    //7
    public static int seventhTask(int[] a7){
        int sum7 = 0;
        for(int i=0; i<a7.length; i++) {
            sum7 += a7[i];
        }
        return sum7;
    }
    //8
    public static int eighthTask(int[] a8){
        int n8 = a8.length;
        Arrays.sort(a8);
        for(int i=n8-2; i>=0; i--) {
            if (a8[i] != a8[n8 - 1]) {
                return a8[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        //1
        Scanner sc = new Scanner(System.in);
        System.out.println("Task 1");
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        System.out.println();
        System.out.println(firstTask(a, b));
        //2
        System.out.println();
        System.out.println("Task 2");
        secondTask();
        System.out.println();
        //3
        System.out.println();
        System.out.println("Task 3");
        System.out.print("First number: ");
        int a3 = sc.nextInt();
        System.out.print("Second number: ");
        int b3 = sc.nextInt();
        System.out.println("Changing their order!");
        thirdTask(a3, b3);
        //4
        System.out.println();
        System.out.println("Task 4");
        System.out.print("Insert 3 numbers: ");
        int a4 = sc.nextInt();
        int b4 = sc.nextInt();
        int c4 = sc.nextInt();
        fourthTask(a4, b4, c4);
        //5
        System.out.println();
        System.out.println("Task 5");
        System.out.print("Insert a number, either positive or negative: ");
        int a5 = sc.nextInt();
        fifthTask(a5);
        //6
        System.out.println();
        System.out.println("Task 6");
        System.out.print("Insert a word to replace 'a'-s to 'b'-s:");
        String a6 = sc.next();
        sixthTask(a6);
        //7
        System.out.println();
        System.out.println("Task 7");
        int[] a7 = {25, 35, 15, 20, 89};
        System.out.print("The sum is: ");
        System.out.println(seventhTask(a7));
        //8
        System.out.println();
        System.out.println("Task 8");
        int[] a8 = {25, 35, 15, 20, 89};
        System.out.print("The second largest number is: ");
        System.out.print(eighthTask(a8));

    }
}