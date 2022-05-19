package kachanovich.lesson11.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test3Cat {
    public static void main(String[] args) {
        try(FileInputStream fileInputStream = new FileInputStream("/sysroot/home/user/JobMikola/Images/kitten.jpg!d");
        FileOutputStream fileOutputStream = new FileOutputStream("kitten.jpg")){
            int a;
            while ((a=fileInputStream.read())!=-1){

                fileOutputStream.write(a);
            }
            System.out.println("Done!");
        }
        catch (IOException ex){
            ex.getMessage();
        }
    }
}
