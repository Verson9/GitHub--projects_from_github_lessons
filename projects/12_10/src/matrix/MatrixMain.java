package matrix;

public class MatrixMain {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(5);
        matrix.fillMatrixWithRandomNumbers(13,50);
        matrix.display();
        matrix.setValue(7.3f, 2,1);
        System.out.println();
        System.out.println(matrix.getValue(2,1));
        matrix.display();


        int matrixDim = 5;
        Matrix m1 = new Matrix(matrixDim);
        m1.fillMatrixWithRandomNumbers(3, 10);
        Matrix m2 = new Matrix(matrixDim);
        m2.fillMatrixWithRandomNumbers(-10, -3);
        Matrix result = m1.add(m2);
        Matrix result2 = m1.subtract(m2);

        System.out.println("sum result");
        result.display();
        System.out.println("sutraction result");
        result2.display();
        System.out.println("m1");
        m1.display();
        System.out.println("m2");
        m2.display();


    }
}
