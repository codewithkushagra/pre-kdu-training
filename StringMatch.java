import java.util.Scanner;

public class StringMatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string1: ");
        String string1 = scanner.nextLine();
        System.out.print("Enter string2: ");
        String string2 = scanner.nextLine();
        scanner.close();
        int length1 = string1.length();
        int length2 = string2.length();
        System.out.println("The length of the first string is "+length1);
        System.out.println("The length of the second string is "+length2);
        if (length1==length2){
            System.out.println("The length of the two strings are the same");
            if (string1.equals(string2)){
                System.out.println("Two strings are equal");
            }
            else{
                System.out.println("Two strings are not equal");
            }
        }
        else{
            System.out.println("The length of the two strings is not the same");
            System.out.println("Two strings are not equal");
        }
    }
}