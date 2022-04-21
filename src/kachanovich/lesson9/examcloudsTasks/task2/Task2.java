package kachanovich.lesson9.examcloudsTasks.task2;

public class Task2 {
    /*
    1 Дано два числа, например 3 и 56, необходимо составить следующие строки:
      3 + 56 = 59
      3 – 56 = -53
      3 * 56 = 168.
      Используем метод StringBuilder.append().
    2 Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(), StringBuilder.deleteCharAt().
    3 Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
     */
    public static void main(String[] args) {
        //1
        int num1 = 3;
        int num2 = 56;
        StringBuilder sb1 = new StringBuilder();
        sb1.append(num1).append(" + ").append(num2).append(" = ").append(num1+num2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(num1).append(" - ").append(num2).append(" = ").append(num1-num2);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(num1).append(" * ").append(num2).append(" = ").append(num1*num2);
        System.out.println("//1");
        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb3);

        //2
//        sb1.delete(6,9).insert(6," равно ");
//        sb2.delete(6,9).insert(6," равно ");
//        sb3.delete(6,9).insert(6," равно ");
//        System.out.println("//2");
//        System.out.println(sb1);
//        System.out.println(sb2);
//        System.out.println(sb3);

        //3
        sb1.replace(6,9," равно ");
        sb2.replace(6,9," равно ");
        sb3.replace(6,9," равно ");
        System.out.println("//3");
        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb3);
    }
}
