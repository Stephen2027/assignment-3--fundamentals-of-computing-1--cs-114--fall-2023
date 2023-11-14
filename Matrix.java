public class Matrix {
  public int[][] matrix;
  private int dimensions;

  // Constructor
  public Matrix(int dimensions) {
    this.dimensions = dimensions;
    this.matrix = new int[dimensions][dimensions];
    // Initialize matrix with the specified dimensions

    // Print out matrix dimensions
    System.out.println("Matrix dimensions: " + dimensions + "x" + dimensions);
  }

  // Populate the matrix with values from 1-(dimensions x dimensions)
  public void populateMatrix() {
    int value = 1;
    for (int row = 0; row < dimensions; row++) {
      for (int col = 0; col < dimensions; col++) {
        matrix[row][col] = value; // Assign the current value to the matrix element
        value++;
      }
    }
  }
  // Print matrix diagonals highlighted in yellow
  public void printMatrix() {
    for (int row = 0; row < dimensions; row++) {
      for (int col = 0; col < dimensions; col++) {
        // Iterate through each row and column then check if the element is on the diagonal
        if (row + col == dimensions - 1) {
          System.out.print("\u001B[33m" + matrix[row][col] + "\u001B[0m \t");
          // prints only diagonal numbers in yellow and the rest of the values white
        } else {
          System.out.print(matrix[row][col] + " \t");
        }
      }
      System.out.println();
    }
  }
  // Private method for swapping matrix elements
  private void swap(int x1, int y1, int x2, int y2) {
    int temp = matrix[x1][y1]; // Temporary variable storage of one element
    matrix[x1][y1] = matrix[x2][y2];
    matrix[x2][y2] = temp;
    // Assign stored value in temp to the second element
  }
  // Flip matrix by swapping elements along the diagonal
  public void flipMatrix() {
    for (int row = 0; row < dimensions - 1; row++) {
      for (int col = 0; col < dimensions - (1 + row); col++) {
        // Swap elements on opposite sides of the diagonal
        swap(row, col, dimensions - (col + 1), dimensions - (row + 1));
      }
    }
  }
}
