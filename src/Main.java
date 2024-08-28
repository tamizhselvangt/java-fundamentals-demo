import java.util.Scanner;

public class Main {

    public static void main (String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Single Digit Number ");
        int num = sc.nextInt();

        if(num<0){
            System.out.println("Negative Number");
        }else {
            System.out.println("Positive Number");
        }

        switch (num){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
             default:
                System.out.println("Doesn't Exists");
                break;
        }
        System.out.println("Ascending Order");
        int i=1;
        while (i<=num){
            System.out.print(i + " ");
            i++;
        }
        i--;
        System.out.println();
        System.out.println("Descending Order");
        while (i>0){
            System.out.print (i + " ");
            i--;
        }
        System.out.println();
        System.out.println("Hello world!");

    }
}