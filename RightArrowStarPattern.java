public class RightArrowStarPattern {
    static void printStar(int star){
        if(star==0){
            return;
        }
        System.out.print("*");
        printStar(star-1);
    }

    static void printBlank(int blank){
        if(blank==0){
            return;
        }
        System.out.print("  ");
        printBlank(blank-1);
    }

    static void upperHalfPattern(int row, int n){
        if(row==0){
            return;
        }
        printBlank(n-row+1);
        printStar(row);
        System.out.println();
        upperHalfPattern(row-1, n);
    }

    static void lowerHalfPattern(int row, int n){
        if(row>n){
            return;
        }
        printBlank(n-row+1);
        printStar(row);
        System.out.println();
        lowerHalfPattern(row+1, n);
    }

    public static void main(String args[]){
        final int n = 5;
        upperHalfPattern(n, n);
        lowerHalfPattern(2,n);
    }
}
