public class Main {
    public static void main(String[] args) {
        Integer number = 7;
        Integer[] list = {4, 3, 6, 2, 8, 1, 9};

        System.out.println(search(number, list));
    }

    public static String search(Integer number, Integer[] list) {
        int initialVal = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(number)) {
                initialVal = i;
                break;
            }
        }
        if (initialVal == 0) {
            return "There is no such number.";
        } else {
            int returnedVal = initialVal + 1;
            return "This number is on position: " + returnedVal;
        }
    }
}