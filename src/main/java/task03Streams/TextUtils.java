package task03Streams;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class TextUtils {

    @SneakyThrows
    public static double avgLength(File file) {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        return bufferedReader.lines().flatMap(lines -> Arrays.stream(lines.split("\\W+"))).mapToInt(String::length)
                .average().getAsDouble();


    }
    @SneakyThrows
    public static long countWords(File file) {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        return bufferedReader.lines().flatMap(lines -> Arrays.stream(lines.split("\\W+"))).count();
    }

}
