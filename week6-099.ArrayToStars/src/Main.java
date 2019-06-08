
public class Main {

    public static void main(String[] args) {
        // test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {
        // write code here
        for (int numStars : array) {
            StringBuilder stars = new StringBuilder();
            for (int i = 0; i < numStars; i++) {
                stars.append("*");
            }
            System.out.println(stars.toString());
        }
    }
}
