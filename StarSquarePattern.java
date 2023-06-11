public class StarSquarePattern {
    static void printStar(int star){
        if(star==0){
            return;
        }
        System.out.print("* ");
        printStar(star-1);

    }

    static void printLine(int row, int x){
        if(row==0){
            return;
        }

        printStar(x);
        System.out.println();
        printLine(row-1,x);
    }
    public static void main(String args[]){
        int size = 6;
        printLine(size, size);
    }
}
