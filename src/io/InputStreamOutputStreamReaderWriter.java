package io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;

/**
 * Lernziel: Ein-/Ausgabeströme
 * `InputStream`
 * `OutputStream`
 * `Reader`
 * `Writer`
 * Konkrete Klassen und Fabriken
 */

public class InputStreamOutputStreamReaderWriter {
    public static void main(String[] args) throws IOException {
//        StringWriter writer = new StringWriter();
//        writeNow(writer);
//        System.out.println(writer.toString());
        try (Writer writer = Files.newBufferedWriter(Paths.get("datum-zeit.txt"))) {
            writeNow(writer);
        }
        try (Reader reader = Files.newBufferedReader(Paths.get("datum-zeit.txt"))) {
//            while (reader.ready()) {
//                System.out.println((char) reader.read());
//            }
            for (int c; (c = reader.read()) != -1; )
                System.out.println((char) c);
        }
    }

    private static void writeNow(Writer writer) throws IOException {
        writer.write(LocalDateTime.now().toString());
    }
}
