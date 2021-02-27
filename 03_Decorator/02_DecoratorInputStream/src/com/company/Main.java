package com.company;

import com.company.decorators.LowerCaseInputStream;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        int c;
        String filepath = "src/com/company/files/test.txt";
        try {
            InputStream in = new LowerCaseInputStream(
                new BufferedInputStream(
                    new FileInputStream(filepath)
                )
            );

            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
