package kachanovich.lesson11.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {
    public static void main(String[] args) {
        File file = new File("Text.txt");
        String s;
        s = """
                         Современное образование — это получение актуальных знаний в комфортной обстановке в удобное
                         для вас время. Теория подкрепляется практикой, которой уделяют максимум времени. При этом,
                         уроки увлекают, побуждая узнавать все больше информации. В итоге, полученная профессия
                         должна будет приносить не только удовлетворение, но и хорошую прибыль. Именно по этим
                         концепциям была разработана бесплатная обучающая программа, чтобы стать специалистом Junior
                         Java Developer смог каждый желающий.
                         """;
        try (FileWriter fileWriter = new FileWriter(file,true)) {
            for (int i = 0; i < s.length(); i++) {
                fileWriter.write(s.charAt(i));
            }
        }
        catch (IOException e){

        }
    }
}
