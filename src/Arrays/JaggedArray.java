package Arrays;

public class JaggedArray {
    public static void main(String[] args) {

        int[][] a = new int[3][];

        a[0] = new int[2];
        a[1] = new int[3];
        a[2] = new int[1];

        a[0][0] = 10;
        a[0][1] = 20;

        a[1][0] = 30;
        a[1][1] = 40;
        a[1][2] = 50;

        a[2][0] = 60;

        for (int[] row : a) {
//            System.out.println("row:"+row);//address of aprticular index
            for (int x : row) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
