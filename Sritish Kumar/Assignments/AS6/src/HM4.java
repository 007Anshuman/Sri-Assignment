import java.util.*;

class HM4 {
    public static int wordCount(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        return count + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String str = sc.nextLine().trim();

        System.out.println("Number of words in \"" + str + "\" is " + wordCount(str));
    }
}
