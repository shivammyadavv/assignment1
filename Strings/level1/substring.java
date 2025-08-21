import java.util.Scanner;



public class substring {
    public static String substringUsingCharAt(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end && i < str.length(); i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static boolean compareStringsUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String subCharAt = substringUsingCharAt(text, start, end);
        String subBuiltIn = text.substring(start, end);

        System.out.println("Substring using charAt(): " + subCharAt);
        System.out.println("Substring using substring(): " + subBuiltIn);

        boolean areEqual = compareStringsUsingCharAt(subCharAt, subBuiltIn);
        System.out.println("Are both substrings equal? " + areEqual);
    }
}
