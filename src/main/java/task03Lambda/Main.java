package task03Lambda;

import lombok.SneakyThrows;

import javax.swing.*;
import java.util.List;
import java.util.function.Consumer;

import static java.util.Arrays.asList;

public class Main {

    @SneakyThrows
    public static <T> void forEachWithDelay (List <T> list, int delay, Consumer <T> action) {
        for (T t : list) {
            action.accept(t);
            Thread.sleep(delay);
        }
    }

    public static void main(String[] args) {

        List <Integer> nums = asList(34,46,76,97,3,2);
        forEachWithDelay(nums,250,x -> System.out.println(x));

    }
}
