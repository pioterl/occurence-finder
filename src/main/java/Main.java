public class Main {

    public static void main(String[] args) {
        Integer number = 3;
        Integer[] list = {4, 3, 0, 6, 2, 8, 1, 9};

        System.out.println(search(number, list));
    }

    public static String search(Integer number, Integer[] list) {
        int value = -1;
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(number)) {
                value = i;
                break;
            }
        }
        return getResult(value);
    }

    private static String getResult(int value) {
        if (value == -1) {
            return "There is no such number.";
        } else {
            int returnedVal = value + 1;
            return "This number is on position: " + returnedVal;
        }
    }
}