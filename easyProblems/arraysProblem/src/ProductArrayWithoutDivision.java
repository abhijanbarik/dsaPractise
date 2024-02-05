class ProductArrayWithoutDivision {

    public static int[] productArrayWithoutDivision(int[] A) {

        int n = A.length;

        int[] left = new int[n];
        int[] right = new int[n];

        // Calculate products to the left
        int productLeft = 1;
        for (int i = 0; i < n; i++) {
            left[i] = productLeft;
            productLeft *= A[i];
        }

        // Calculate products to the right
        int productRight = 1;
        for (int i = n - 1; i >= 0; i--) {
            right[i] = productRight;
            productRight *= A[i];
        }

        // Calculate the final product array
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = left[i] * right[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] input1 = {1, 2, 3, 4, 5};
        int[] output1 = productArrayWithoutDivision(input1);
        System.out.print("Output 1: ");
        printArray(output1);
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
