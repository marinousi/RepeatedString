import java.util.Scanner;

//CHALLENGE: https://edabit.com/challenge/Sk3DXY6ZdwAKj6r8d
public class Main {
    public static long repeatedString(String str, long n) {
        long holder = 0;

        for (int i = 0; i < str.length(); i++) {                          //this for will complete the string accordingly to the number 'n' proposed by the user

            if (str.charAt(i) == 'a') {                                   //if the char in the current position is an 'a', it'll do an operation
                holder = holder + n / str.length();                       //it means that it still misses letters to complete the given number

                if (n % str.length() > i)                                 //if the rest of the operation is greater than its current position, will add one to the counter
                    holder = holder + 1;

            }

        }

        return holder;

    }

    public static void main(String[] args) {

        Scanner prompt = new Scanner (System.in);
        //so testing could be easier
        System.out.println("Type -1 to start the program.");
        System.out.println("Type -2 to stop the program.");
        int choice = prompt.nextInt();

        while (choice == -1) {

            System.out.println("Type a String:");
            String string = prompt.next();
            System.out.println("Type a number:");
            int number = prompt.nextInt();

            System.out.println("('" + string + "', " + number + ") -> " + repeatedString(string, number));


            System.out.println("Type -1 to continue the program.");
            System.out.println("Type -2 to stop the program.");
            choice = prompt.nextInt();

            if (choice == -2) {
                System.out.println("Program ended!");
                break;
            }
        }

    }
}

