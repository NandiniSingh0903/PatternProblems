public class HollowSquarePattern {
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

        System.out.print("  ");
        printBlank(blank-1);
    }

    static void printLine(int x, int y, int n){
        if(x>n && y>n){
            return;
        }

        if(x==1 || y==1 || x==n || y==n){
            printStar(n);
        }

        else{
            System.out.print("* ");
            printBlank(n-2);
            System.out.print("* ");
        }
        
        System.out.println();
        printLine(x+1, y+1, n);
        
    }

    public static void main(String args[]){
        int n = 6;
        printLine(1, 1, n);
    }
}
