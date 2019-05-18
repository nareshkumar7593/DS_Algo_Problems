import java.util.Scanner;

public class DownToZero {

  public static void main(String[] args) {
//    System.out.println("Enter the number of Inputs");
//    Scanner inputReader = new Scanner(System.in);
//    int num = inputReader.nextInt();
//
//    for(int i= 0; i<num;i++){
//      int input = inputReader.nextInt();
//      int output = downToZero(input);
//      System.out.println(output);
//
//    }
//    inputReader.close();

      int output = downToZero(393991);
      System.out.println(output);
  }


  static int downToZero(int n) {
    int count = 0;
    while(n != 0){
      boolean flag = false;
      for(int i = 2; i<= n-1;i++){
        if(n % i == 0){
          flag = true;
          break;
        }
      }
      if(!flag)
        n -= 1;
      else{
        double drValue = Math.sqrt(n);
        if(drValue - Math.floor(drValue) == 0)
          n = (int)drValue;
        else{
          for(int i = 2; i <= (int)Math.floor(drValue); i++){
            if(n % i == 0){
              n = Math.max(i, n/i);
              break;
            }
          }

        }
      }
      count++;
    }
    return count;
  }

}
