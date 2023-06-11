public class NumberLeftandRightTrianglePattern {
    static void printNum(int start, int end){
        if(start>end){
            return;
        }
        System.out.print(start+" ");
        printNum(start+1, end);
    }

    static void printNumRev(int start, int end){
        if(start<end){
            return;
        }
        System.out.print(start+" ");
        printNumRev(start-1, end);
    }

    static void printBlank(int blank){
        if(blank==0){
            return;
        }
        System.out.print(" ");
        printBlank(blank-1);
    }

    static void printLine(int row, int n, int start, int end){
        if(row>n){
            return;
        }

        printNum(start, end);
        printBlank(4*(n-row));
        printNumRev(end, start);
        System.out.println();
        printLine(row+1,n, start, end+1);
    }
    public static void main(String[] args) {
        int n = 5;
        printLine(1,n,1,1);
    }
}
