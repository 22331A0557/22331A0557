import java.util.Scanner;

class Evenodd {
  void find(int a) {
    if (a % 2 == 0) {
      System.out.print("The value " + a + " is a even number");

    } else {
      System.out.print("The value " + a + " is a odd number");

    }
  }

  public static void main(String[] args) {
    int a;
    Evenodd obj = new Evenodd();
    System.out.print("Enter the value of a : ");
    Scanner input = new Scanner(System.in);
    a = input.nextInt();
    input.close();
    obj.find(a);
  }
}
