import java.util.*;

class Multipleoften {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextint();
    for(int i=0;i<=n;i++){
      if(n%10 == 0){
        break;
      }
      System.out.println(i);
    }
  }
}
