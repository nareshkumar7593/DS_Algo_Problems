package Mathematics;

public class NoOfDigits {
  public static void main(String[] args) {
    int n = 555532, count = 0;
    while(n > 0){
      n = n/10;
      count++;
    }
    System.out.println(count);

    //Alternate:
    System.out.println((Math.floor(Math.log10(555532)) + 1));
  }
}
