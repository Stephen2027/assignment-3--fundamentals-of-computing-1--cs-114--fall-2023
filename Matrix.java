public class Matrix {
  public int[][] matrix;
  private int size;

  // Constructor
  public Matrix(int size) {
    this.size = size;
    this.matrix = new int[size][size];

    // Print out matrix dimensions
    System.out.println("Matrix dimensions: " + size + "x" + size);
  }

  // Populate the matrix with values from 1-(size x size)
  public void populateMatrix() {
    int value = 1;
    for (int row = 0; row < size; row++) {
      for (int col = 0; col < size; col++) {
        matrix[row][col] = value;
        value++;
      }
    }
  }
  // Print matrix diagonals highlighted in yellow
  public void printMatrix() {
    for (int row = 0; row < size; row++) {
      for (int col = 0; col < size; col++) {
        if (row + col == size - 1) {
          System.out.print("\u001B[33m" + matrix[row][col] + "\u001B[0m \t");
        } else {
          System.out.print(matrix[row][col] + " \t");
        }
      }
      System.out.println();
    }
  }
  // Private method for swapping matrix elements
  private void swap(int x1, int y1, int x2, int y2) {
    int temp = matrix[x1][y1];
    matrix[x1][y1] = matrix[x2][y2];
    matrix[x2][y2] = temp;
  }
  // Flip matrix by swapping elements along the diagonal
  public void flipMatrix() {
    for (int row = 0; row < size - 1; row++) {
      for (int col = 0; col < size - (1 + row); col++) {
        swap(row, col, size - (col + 1), size - (row + 1));
      }
    }
  }
}
