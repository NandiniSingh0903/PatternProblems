public class LeftArrowStarPattern {
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
        System.out.print(" ");
        printBlank(blank-1);
    }

    static void upperHalfPattern(int row){
        if(row==0){
            return;
        }
        printBlank(row-1);
        printStar(row);
        System.out.println();
        upperHalfPattern(row-1);
    }

    static void lowerHalfPattern(int row, int n){
        if(row>=n){
            return;
        }
        printBlank(row);
        printStar(row+1);
        System.out.println();
        lowerHalfPattern(row+1,n);
    }

    public static void main(String args[]){
        final int n = 5;
        upperHalfPattern(n);
        lowerHalfPattern(1,n);
    }
}
