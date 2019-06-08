public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int i = 0;
        while (i < amount) {
            System.out.print("*");
            i += 1;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int i = 0;
        while (i < amount) {
            System.out.print(" ");
            i += 1;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int i = 1;
        while (i <= size) {
            printWhitespaces(size - i);
            printStars(i);
            i += 1;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int maxWidth = 2 * height - 1;
        int currentHeight = 1;
        int numStarsOnCurrentHeight;
        
        while (currentHeight <= height) {
            numStarsOnCurrentHeight = 2 * currentHeight - 1;
            printWhitespaces((maxWidth-numStarsOnCurrentHeight)/2);
            printStars(numStarsOnCurrentHeight);
            currentHeight += 1;
        }
        
        int widthStand = 3;
        int heightStand = 2;
        
        for (int i = 0; i < heightStand; i++) {
            printWhitespaces(height-2);
            printStars(widthStand);
        }
        
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
