/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package new_io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author huynq
 */
public class FileReadWriteRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        Path pathFileToRead = Paths.get("./resource/data.txt");

        // 1- if file not contain many lines (< 1_000_000 )
//        List<String> readAllLines = Files.readAllLines(pathFileToRead);
//
//        System.out.println(readAllLines);
        // 2- many lines
        Stream<String> lines = Files.lines(pathFileToRead);

//        lines.forEach(System.out::println);
//        lines.filter(s -> s.contains("acad"))
//                .forEach(System.out::println);
//        lines.map(String::toUpperCase)
//                .forEach(System.out::println);
        // 3- Write to a file
        Path pathFileToWrite = Paths.get("./resource/file-write.txt");

        List<String> list = List.of("Apple", "Boy", "Dog", "Cat", "D06-K11", "Everythings");

        Files.write(pathFileToWrite, list);

        //
        List<String> students = List.of(
                new Student("student 1", "email 1", "phone 1").toString(),
                new Student("student 2", "email 2", "phone 2").toString(),
                new Student("student 3", "email 3", "phone 3").toString()
        );

        Path studentFile = Paths.get("./resource/students.txt");
        Files.write(studentFile, students);

    }

}
