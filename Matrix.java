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
    for(int row = 0; row < size; row++) {
      for (int col = 0; col < size; col++) {
        matrix[row][col] = value;
        value++;
      }
    }
  }
}
