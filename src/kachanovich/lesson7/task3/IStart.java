package kachanovich.lesson7.task3;

public interface IStart {
    /*
    Создаем интерфейс IStart. В интерфейсе определяем методы:
    • предстартовая проверка систем(возвращает true/false)
    • запуск двигателей(void)
    • старт(void)
     */
    boolean checkSystem();
    void engineStarting();
    void start();
}
