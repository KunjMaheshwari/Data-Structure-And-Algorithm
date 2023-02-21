// GOOGLE AND MICROSOFT 
public class Duplicate {
    public static void removeDuplicates(String str, int idx, StringBuilder newstr, boolean map[]){
        // Base case 
        if(idx == str.length()){
        System.out.println(newStr);
        return;
        
        // Work 
        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true){
            // duplicate
            removeDuplicates(str, idx+1, newStr, map);
        }else{
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }
    public static void main(String args[]) {
    String str = "appnnacollege";
    System.out.println(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
