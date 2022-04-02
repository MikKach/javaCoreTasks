package kachanovich.lesson6.task4_2;

public class RecursionAandB {
    /*
            Даны два целых числа A и В. Выведите все числа от A до B включительно,
         в порядке возрастания, если A < B, или в порядке убывания в противном случае. Использовать рекурсию.
     */

    private int a;
    private int b;

    public RecursionAandB() {
    }

    public RecursionAandB(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void allNumber() {
        if(this.a<this.b){
            increasingNumbers();
            System.out.println();
        }
        else {
            descendingNumbers();
            System.out.println();
        }
    }

    private void increasingNumbers() {
        if (this.a <= this.b) {
            System.out.printf("%d ", this.a);
            this.a++;
            increasingNumbers();
        }
    }

    private void descendingNumbers(){
        if (this.a >= this.b) {
            System.out.printf("%d ", this.a);
            this.a--;
            descendingNumbers();
        }
        System.out.println();
    }
}
