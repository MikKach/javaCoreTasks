package kachanovich.lesson4;

public class Task8 {
    public static void main(String[] args) {
        String star = "*";
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4-i; j++) {
                System.out.print(" ");
            }
            System.out.print(star);
            star+="*";
            System.out.println();
        }

    }
}
