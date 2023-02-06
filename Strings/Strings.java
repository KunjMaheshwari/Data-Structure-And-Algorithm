import java.util.*;

public class Strings {
    public static void main(String args[]) {
        // These are the ways to declare the strings in an array
        char arr[] = { 'a', 'b', 'c', 'd' };
        String str = "abcd";
        String str2 = new String("xyz");
        
        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.next();    // For strings we use sc.next()
        // here sc.next() will print only one word whereas sc.nextLine() will print the complete sentence. 
        System.out.println(name);
    }
}
// IMPORTANT - In java, Strings are Immutable.
