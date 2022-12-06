package com.developersboard.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;

public class BasicBinaryDataReadingAndWriting {

    public static void main(String[] args) {

        var outputPath = "src/main/java/com/developersboard/io/sample-out.txt";
        var inputPath = "src/main/java/com/developersboard/io/sample-in.txt";

        resetFiles(outputPath);

        copyFileContent(outputPath, inputPath);
    }

    private static void copyFileContent(String outputPath, String inputPath) {
        try {
            try (var in = new FileInputStream(inputPath);
                 var out = new FileOutputStream(outputPath);
                 var outputStreamWriter = new OutputStreamWriter(out)) {

                byte[] buffer = new byte[1024];
                int length;
                while((length = in.read(buffer)) != -1) {
                    out.write(buffer, 0, length);
                }

                outputStreamWriter.write(LocalDateTime.now().toString());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void resetFiles(String outputPath) {
        try {
            Files.deleteIfExists(Paths.get(outputPath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
