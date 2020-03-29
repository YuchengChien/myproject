package com.jason.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTester {
    public static void main(String[] args) throws IOException {
        File jkDir = new File("D:\\jk");
        jkDir.mkdir();
        FileWriter fileWriter = new FileWriter("D:\\jk\\output.txt");
        fileWriter.write("abc");
        fileWriter.flush();
        fileWriter.close();
    }
}
