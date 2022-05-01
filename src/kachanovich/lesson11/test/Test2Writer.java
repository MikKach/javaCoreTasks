package kachanovich.lesson11.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test2Writer {
    public static void main(String[] args) {
        String text = """
                         Современное образование — это получение актуальных знаний в комфортной обстановке в удобное
                         для вас время. Теория подкрепляется практикой, которой уделяют максимум времени. При этом,
                         уроки увлекают, побуждая узнавать все больше информации. В итоге, полученная профессия
                         должна будет приносить не только удовлетворение, но и хорошую прибыль. Именно по этим
                         концепциям была разработана бесплатная обучающая программа, чтобы стать специалистом Junior
                         Java Developer смог каждый желающий.
                         """;
        File file = new File("Text.txt");
        try(FileWriter fileWriter = new FileWriter(file)){
            for (int i = 0; i < text.length(); i++) {
                fileWriter.write(text.charAt(i));
            }
            System.out.println("Done!!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
