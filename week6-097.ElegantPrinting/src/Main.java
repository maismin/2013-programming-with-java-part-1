
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        // Write code here
        StringBuilder resultSB = new StringBuilder();
        for (int number : array) {
            resultSB.append(number);
            resultSB.append(", ");
        }
        String result = new String(resultSB.substring(0, resultSB.length()-2));
        System.out.println(result);
    }
}
