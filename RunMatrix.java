import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    System.out.print("Please enter the size of your matrix:");
    Scanner scan = new Scanner(System.in);
    int input = scan.nextInt();
    Matrix obMatrix = new Matrix(input);
    obMatrix.printMatrix();

    System.out.print("Populating matrix...");
    obMatrix.populateMatrix();
    System.out.println("matrix populated");
    obMatrix.printMatrix();

    System.out.print("");
  }
}
