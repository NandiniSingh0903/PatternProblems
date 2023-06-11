public class HeartStarPattern {
    static void printStar(int star){
        if(star==0){
            return;
        }
        System.out.print("* ");
        printStar(star-1);
    }

    static void printBlank(int blank){
        if(blank==0){
            return;
        }
        System.out.print(" ");
        printBlank(blank-1);
    }

    static void upperHalfPattern(int row, int n){
        if(row>n/2){
            return;
        }

        if(row==n){
            printStar(n);
        }

        else{
            printStar(row);
            printBlank(n/2-row);
            printBlank(n/2-row);
            printStar(row);
        }

        System.out.println();
        upperHalfPattern(row+1,n);
    }

    static void lowerHalfPattern(int row, int n){
        if(row==0){
            return;
        }

        printBlank(n-row);
        printStar(row);
        System.out.println();
        lowerHalfPattern(row-1,n);
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.print(" ");
        upperHalfPattern(2, n);
        lowerHalfPattern(n, n);
    }
}
