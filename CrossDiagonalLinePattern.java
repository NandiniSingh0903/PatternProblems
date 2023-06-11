public class CrossDiagonalLinePattern {
    static void printLine(int i, int j, int n){
        if(i>n){
            return;
        }

        if(j==n){
            System.out.println();
            printLine(i+1, 1, n);
            return;
        }

        if(i==j || i+j == n){
            System.out.print("* ");
        }

        else{
            System.out.print(" ");
        }

        printLine(i, j+1, n);
    }
    public static void main(String args[]){
        final int n = 4;
        printLine(1,1,n+1);
    }
}
