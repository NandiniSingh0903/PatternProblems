public class HollowInvertedPyramid {
    static void printStar(int star){
        if(star==0){
            return;
        }
        System.out.print("*    ");
        printStar(star-1);
    }

    static void printBlank(int blank){
        if(blank==0){
            return;
        }
        System.out.print("  ");
        printBlank(blank-1);
    }

    static void printLine(int row, int n){
        if(row==0){
            return;
        }

        if(row==n){
            printStar(row);
        }

        else if(row==1){
            printBlank(n-row+1);
            printStar(1);
        }

        else{
            printBlank(n-row);
            printStar(1);
            printBlank(2*row-3);
            printStar(1);
        }

        System.out.println();
        printLine(row-1, n);
    }

    public static void main(String args[]){
        printLine(5,5);
    }   
}
