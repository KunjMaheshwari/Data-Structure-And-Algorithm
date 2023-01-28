public class Hollow{
  public static void hollow_rectangle(int totRows, int totCol){
    // outer loop
    for(int i=1;i<=totRows;i++){
      // inner loop
      for(int j=1; j<=totCol;j++){
        // cell - (i,j)
        if(i==1 || i== totRows || j==1 || j==totCol){
          // boundary condition
          System.out.print("*");
        } else{
          System.out.print(" ");
        }
      }
      System.out.println(); // to print the next line after completing one complete line.
    }
  }
  public static void main(String args[]){
    hollow_rectangle(4,5);
  }
}
