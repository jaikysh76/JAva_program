public class Pattern_1 {
    public static void main(String args[]) {
        int i,j ,n=4;
        // n =no of rows
        //i for row
        // j for columns

        for (i = 0; i <= n; i++)
        { // outer loop for columns
            for (j = 0; j <= i; j++) { // iner loop for columns
                System.out.print("*");
            }
            // throw the cursor in new line
            System.out.println();
        }
    }
}