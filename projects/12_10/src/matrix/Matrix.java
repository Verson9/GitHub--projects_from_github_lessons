package matrix;

import java.util.Random;

public class Matrix {

    private float[][] matrix;
    private int matrixDimension;
    public static int valueStatic;
    public int valueNonStatic;

    public Matrix(int matrixDimension) {
        this.matrixDimension = matrixDimension;
        matrix = new float[matrixDimension][matrixDimension];
    }
    public int getMatrixDimension() {return matrixDimension;}

    public void setValue(float value, int x, int y) {
        if(isOutOfBounds(x,y))
            return;
        matrix[x][y] = value;
    }

    public float getValue(int x, int y) {
        if(isOutOfBounds(x,y))
            return -1;
        return matrix[x][y];
    }

    public Matrix add(Matrix matrix) {
        if(this.matrixDimension != matrix.getMatrixDimension()) {
            System.out.println("Mismatch matrix dimensions");
            return null;
        }
        Matrix resultMatrix = new Matrix(matrixDimension);
        for(int y = 0; y < matrixDimension; y++)
            for(int x = 0; x < matrixDimension; x++) {
                float sum = this.getValue(x,y) + matrix.getValue(x,y);
                resultMatrix.setValue(sum, x, y);
                //resultMatrix.setValue(this.getValue(x,y) + matrix.getValue(x,y), x, y);
            }
        return resultMatrix;
    }

    public Matrix subtract(Matrix matrix) {
        if(this.matrixDimension != matrix.getMatrixDimension()) {
            System.out.println("Mismatch matrix dimensions");
            return null;
        }
        Matrix resultMatrix = new Matrix(matrixDimension);
        for(int y = 0; y < matrixDimension; y++)
            for(int x = 0; x < matrixDimension; x++)
                resultMatrix.setValue(this.getValue(x,y) - matrix.getValue(x,y), x, y);
        return resultMatrix;
    }

    public void fillMatrixWithRandomNumbers(int minValue, int maxValue) {
        Random random = new Random();
        for(int y = 0; y < matrixDimension; y++)
            for (int x = 0; x < matrixDimension; x++)
                matrix[x][y] = random.nextInt(maxValue - minValue) + minValue;
    }

    private boolean isOutOfBounds(int x, int y) {
        if(x < 0 || x >= matrixDimension) {
            System.out.println("x is out of bound the matrix");
            return true;
        }
        if(y < 0 || y >= matrixDimension) {
            System.out.println("y is out of bound the matrix");
            return true;
        }
        return false;
    }

    public void display() {
        for (int y = 0; y < matrixDimension; y++) {
            for (int x = 0; x < matrixDimension; x++)
                System.out.print(matrix[x][y] + " ");
            System.out.println();
        }
    }
}

