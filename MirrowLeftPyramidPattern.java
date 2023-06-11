public class MirrowLeftPyramidPattern {
    static void printStar(int star){
        if(star==0){
            return;
        }
        System.out.print("* ");
        printStar(star-1);
    }

    static void printLine(int row, int n){
        if(row>n){
            return;
        }
        printStar(row);
        System.out.println();
        printLine(row+1, n);
    }

    public static void main(String args[]){
        printLine(1,5);
    }
}
