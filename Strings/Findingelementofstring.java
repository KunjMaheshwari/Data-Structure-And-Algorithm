public class Findingelementofstring {
    public static void printLetters(String name) {
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));
        }
        System.out.println();
    }

    public static void main(String args[]) {
        String name = "Kunj Maheshwari";
        System.out.println(name.charAt(1));

        printLetters(name);
    }
}
// We use .charAt method to find each element of the string