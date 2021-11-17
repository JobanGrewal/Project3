public class Pattern1 {
    public static void main(String[] args) {
        int arr[][] = new int[10][10];
        for (int i = 1; i < 11; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
        }
    }

}