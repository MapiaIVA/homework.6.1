public class Main {
    public static void main(String[] args) {
        int[][] matrixA = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrixB = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};


        int size = 4;
        int[][] identityMatrix = createIdentityMatrix(size);

        int[][] zeroMatrix = createZeroMatrix(size);


        int[][] sumMatrix = addMatrices(matrixA, matrixB);


        int[][] productMatrix = multiplyMatrices(matrixA, matrixB);


        int scalar = 5;
        int[][] scalarMatrix = multiplyMatrixByScalar(matrixA, scalar);


        int determinant = calculateDeterminant(matrixA);


        System.out.println("Identity Matrix:");
        printMatrix(identityMatrix);
        System.out.println("Zero Matrix:");
        printMatrix(zeroMatrix);
        System.out.println("Sum Matrix:");
        printMatrix(sumMatrix);
        System.out.println("Product Matrix:");
        printMatrix(productMatrix);
        System.out.println("Scalar Multiplied Matrix:");
        printMatrix(scalarMatrix);
        System.out.println("Determinant: " + determinant);
    }

    public static int[][] createIdentityMatrix(int size) {
        int[][] identityMatrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    identityMatrix[i][j] = 1;
                }
            }
        }
        return identityMatrix;
    }

    public static int[][] createZeroMatrix(int size) {
        return new int[size][size];
    }

    public static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
        int size = matrixA.length;
        int[][] result = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return result;
    }

    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int size = matrixA.length;
        int[][] result = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return result;
    }

    public static int[][] multiplyMatrixByScalar(int[][] matrix, int scalar) {
        int size = matrix.length;
        int[][] result = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result[i][j] = matrix[i][j] * scalar;
            }
        }
        return result;
    }

    public static int calculateDeterminant(int[][] matrix) {

        return 0;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}