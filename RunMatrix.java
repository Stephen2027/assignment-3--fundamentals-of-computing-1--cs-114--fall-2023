import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    System.out.print("Please enter the size of your matrix:");
    Scanner scan = new Scanner(System.in);
    int input = scan.nextInt();
    System.out.println("Printing matrix with default values:");
    Matrix obMatrix = new Matrix(input);
    obMatrix.printMatrix();

    System.out.print("Populating matrix...");
    obMatrix.populateMatrix();
    System.out.println("matrix populated");
    System.out.println("Printing matrix:");
    obMatrix.printMatrix();

    //Printing flipped matrix
    System.out.print("Flipping matrix...");
    obMatrix.flipMatrix();
    System.out.println("matrix flipped");
    System.out.println("Printing flipped matrix");
    obMatrix.printMatrix();

    scan.close();
  }
}
