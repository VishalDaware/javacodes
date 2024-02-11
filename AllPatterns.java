import java.util.*;

public class AllPatterns {
    public static void main(String arg[]) {

        // solid rectangle
        /*
         * int n = 5;
         * int m = 4;
         * for (int i = 1; i <= n; i++) {
         * for (int j = 1; j <= m; j++) {
         * System.out.print("* ");
         * }
         * System.out.println();
         * }
         * 
         * // Hollow rectangle
         * int r = 5;
         * int c = 4;
         * for (int i = 1; i <= r; i++) {
         * for (int j = 1; j <= c; j++) {
         * if (i == 1 || j == 1 || i == r || j == c) {
         * System.out.print("* ");
         * } else {
         * System.out.print("  ");
         * }
         * }
         * System.out.println();
         * 
         * }
         */

        /*
         * // half pyramid
         * int n = 5;
         * for (int i = 1; i <= n; i++) {
         * for (int j = 1; j <= i; j++) {
         * System.out.print("* ");
         * }
         * System.out.println("  ");
         * }
         * // down-inverted half pyramid
         * int m = 5;
         * for (int i = n; i >= 1; i--) {
         * for (int j = 1; j <= i; j++) {
         * System.out.print("* ");
         * }
         * System.out.println();
         * }
         */

        /*
         * // Right reflected half pyramid
         * int n = 5;
         * for (int i = 1; i <= n; i++) {
         * for (int j = 1; j <= n - i; j++) {
         * System.out.print("  ");
         * }
         * for (int k = 1; k <= i; k++) {
         * System.out.print("* ");
         * }
         * System.out.println();
         * }
         * // down reflected half pyramid
         * int m = 5;
         * for (int i = m; i >= 1; i--) {
         * for (int j = 1; j <= n - i; j++) {
         * System.out.print("  ");
         * }
         * for (int k = 1; k <= i; k++) {
         * System.out.print("* ");
         * }
         * System.out.println();
         * }
         */

        // Diamond pattern
        /*
         * int n = 5;
         * for (int i = 1; i <= n + 1; i++) {
         * for (int j = 1; j <= (n - i) + 1; j++) {
         * System.out.print("  ");
         * }
         * for (int k = 1; k <= i; k++) {
         * System.out.print("* ");
         * }
         * for (int l = 2; l <= i; l++) {
         * System.out.print("* ");
         * }
         * System.out.println();
         * 
         * }
         * for (int i = n; i >= 1; i--) {
         * for (int j = 1; j <= (n - i) + 1; j++) {
         * System.out.print("  ");
         * }
         * for (int k = 1; k <= i; k++) {
         * System.out.print("* ");
         * }
         * for (int l = 2; l <= i; l++) {
         * System.out.print("* ");
         * }
         * System.out.println();
         * 
         * }
         */
        // or
        /*
         * int m = 4;
         * for (int i = 1; i <= m + 1; i++) {
         * for (int j = 1; j <= (m - i) + 1; j++) {
         * System.out.print("  ");
         * }
         * for (int k = 1; k <= (i * 2) - 1; k++) {
         * System.out.print("* ");
         * }
         * System.out.println();
         * }
         * for (int i = m; i >= 1; i--) {
         * for (int j = 1; j <= (m - i) + 1; j++) {
         * System.out.print("  ");
         * }
         * for (int k = 1; k <= (i * 2) - 1; k++) {
         * System.out.print("* ");
         * }
         * System.out.println();
         * 
         * }
         */

        // Butterfly pattern
        int n = 4;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print("  ");
            }
            for (int l = 0; l <= i; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            for (int k = 1; k <= (n - i) * 2; k++) {
                System.out.print("  ");
            }
            for (int l = 0; l <= i; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
