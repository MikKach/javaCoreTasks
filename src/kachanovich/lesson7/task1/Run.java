package kachanovich.lesson7.task1;

import kachanovich.lesson7.task1.hands.SamsungHand;
import kachanovich.lesson7.task1.hands.SonyHand;
import kachanovich.lesson7.task1.hands.ToshibaHand;
import kachanovich.lesson7.task1.heads.SamsungHead;
import kachanovich.lesson7.task1.heads.SonyHead;
import kachanovich.lesson7.task1.heads.ToshibaHead;
import kachanovich.lesson7.task1.legs.SamsungLeg;
import kachanovich.lesson7.task1.legs.ToshibaLeg;

public class Run {
    /*
       Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
       Класс SonyHead является примером реализацией головы от Sony.
       Создайте 3 робота с разными комплектующими.
       Например у робота голова и нога от Sony а, рука от Samsung.
       У всех роботов вызовите метод action.
       Среди 3-х роботов найдите самого дорогого.
       */
    public static void main(String[] args) {
        Robot robot1 = new Robot(new SamsungHead(30), new SonyHand(0), new SamsungLeg(0));
        Robot robot2 = new Robot(new ToshibaHead(20), new ToshibaHand(0), new SamsungLeg(0));
        Robot robot3 = new Robot(new SonyHead(10), new SamsungHand(0), new ToshibaLeg(0));
        robot1.action();
        System.out.println();
        robot2.action();
        System.out.println();
        robot3.action();
        System.out.println();
        priceMax(robot1, robot2, robot3);

    }

    private static void priceMax(Robot... robots) {
        int max = robots[0].getPrice();
        int index = 1;
        for (int i = 0; i < robots.length; i++) {
            if (max < robots[i].getPrice()) {
                max = robots[i].getPrice();
                index = i+1;
            }
        }
        System.out.printf("Самый дорогой робот %d, его цена %d\n", index,max);
    }
}
