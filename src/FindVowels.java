/*
Assignment is to write a program to input a line and count the number of vowels
*/
 */
import java.util.Scanner;

public class FindVowels {
    public static void main (String[] args){
        // declare ny variables
        Scanner keybd = new Scanner(System.in);
        String msg;
        char aChar = ' ';
        int vowelCtr;
        char[] vowels = {'a', 'e', 'i', 'o', 'u',
                          'A', 'E', 'I', 'O', 'U'};

        do {
            System.out.println("Enter your text string. Type q to quit:");
            msg = keybd.nextLine();
            vowelCtr = 0;
            for (int i = 0; i < msg.length(); i++) {
                aChar = msg.charAt(i);
                for (int i2 = 0; i2 < vowels.length; i2++){
                    if (aChar == vowels[i2]){
                        vowelCtr += 1;
                        i2 = vowels.length + 1;
                    }
                }
            }
            System.out.printf("%s has %d vowels.\n", msg, vowelCtr);
        } while ((msg.equalsIgnoreCase("q")) == false);
    }
}
