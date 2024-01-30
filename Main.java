import java.util.Scanner;
class Main {
  public void P1(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number :");
    int num = sc.nextInt();
    int res =0;
    for(int i=1;i<=10;i++){
      res = num*i;
      System.out.println(num +"*"+i+" = "+ res);
    }
  }
  
  public static void main(String[] args) {
    System.out.println("Hello world!");

    Main prt = new Main();
    prt.P1();
  }
}
