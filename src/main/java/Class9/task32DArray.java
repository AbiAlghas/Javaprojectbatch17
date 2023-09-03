package Class9;

public class task32DArray {
    public static void main(String[] args) {
        String[][] students = {
                {"Ayesha", "Giulia", "john", "Deepali"},
                {"A", "A+", "C", "B",}};
        for (int i = 0; i < students[0].length; i++) {
            if (students[1][i].equals("A") || students[1][i].equals("B")) {
                System.out.println(students[0][i]);

            }
        }
    }
}
