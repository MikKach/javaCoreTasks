package kachanovich.lesson9.examcloudsTasks.task3;

public class Task3 {
    /*
        Напишите метод, заменяющий в строке каждое второе вхождение «object-oriented programming» (не учитываем
    регистр символов) на «OOP». Например, строка:
        "Object-oriented programming is a programming language model organized around objects rather than "actions"
        and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla."
        должна быть преобразована в
        "Object-oriented programming is a programming language model organized around objects rather than "actions"
        and data rather than logic. OOP blabla. Object-oriented programming bla."
     */
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Object-oriented programming is a programming language model organized " +
                "around objects rather than \"actions\" and data rather than logic. Object-oriented programming " +
                "blabla. Object-oriented programming bla.");
        System.out.println(sb1.toString());
        StringBuilder sbNew = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Object-oriented programming");
        int num = 0;

        boolean bool;
        for (int i = 0; i < sb1.length(); i++) {
            if ((sb1.charAt(i) == 'o' || sb1.charAt(i) == 'O') && (i + sb2.length() < sb1.length())) {
                bool = false;
                for (int j = i + 1, l = 1; l < sb2.length(); j++, l++) {
                    if (sb1.charAt(j) != sb2.charAt(l)) {
                        bool = true;
                        break;
                    }
                }
                if (bool) {
                    sbNew.append(sb1.charAt(i));
                    continue;
                }
                num++;
                if (num % 2 == 0) {
                    sbNew.append("OOP");
                    i += sb2.length()-1;
                } else {
                    sbNew.append(sb2);
                    i += sb2.length()-1;
                }
            } else {
                sbNew.append(sb1.charAt(i));
            }
        }
        System.out.println(sbNew.toString());
    }


}
