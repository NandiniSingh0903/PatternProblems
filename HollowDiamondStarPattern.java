public class HollowDiamondStarPattern {
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

    static void printUpperHalf(int row, int n){
        if(row>n/2){
            return;
        }

        if(row==1){
            printStar(n);
        }

        else{
            printStar(n/2-row+1);
            printBlank(2*(row-1));
            printStar(n/2-row+1);
        }

        System.out.println();
        printUpperHalf(row+1, n);
    }

    static void printLowerHalf(int row, int n){
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
        printLowerHalf(row+1,n);
    }
    public static void main(String args[]){
        int n = 10;
        printUpperHalf(1, n);
        printLowerHalf(1,n);
    }
}
