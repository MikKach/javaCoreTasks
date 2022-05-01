package kachanovich.lesson11.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Test2Reader {
    public static void main(String[] args) {
        File file = new File("Text.txt");
        try(FileReader fileReader = new FileReader(file)){
            while (fileReader.ready()){

            }
        }
        catch (IOException e){
            e.getMessage();
        }
    }
}
