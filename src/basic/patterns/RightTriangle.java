package basic.patterns;

public class RightTriangle {
    public static void main(String[] args) {
        pattern(5);

    }
    static void pattern(int n){

//        for (int row = 1; row < 2* n; row++) {
//            int tolaColInRow = row >n ? 2*n -row :row;
//            int space = n - tolaColInRow;
//            for (int i = 1; i <= tolaColInRow; i++) {
//                System.out.print("* ");
//
//
//            }
//            for (int s = 1; s <= space; s++) {
//                System.out.print("  ");
//            }
//            for (int i = 1; i <= tolaColInRow; i++) {
//                System.out.print("* ");
//
//            }
//
////            for (int col = 1; col <=tolaColInRow ; col++) {
////                System.out.print("* ");
////            }
////            System.out.println();
//            System.out.println();

        for (int row = 1; row <=n; row++) {
            for (int s = 1; s <= n-row; s++) {
                System.out.print("  ");

            }
            for (int col = 1; col <=row; col++) {
                System.out.print("* ");
            }

            System.out.println();

        }

        }

    }

