package com.developersboard.io;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;

public class ConnectingStreams {

    public static void main(String[] args) {

        var outputPath = "src/main/java/com/developersboard/io/sample-out.txt";
        var inputPath = "src/main/java/com/developersboard/io/sample-in.txt";

        try (var in = new BufferedReader(new InputStreamReader(new FileInputStream(inputPath), StandardCharsets.UTF_8));
             var out = new PrintWriter(new OutputStreamWriter(new FileOutputStream(outputPath), StandardCharsets.UTF_8))) {

            String line;
            while ((line = in.readLine()) != null) {
                out.println(line);
            }

            out.println(LocalDateTime.now());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
