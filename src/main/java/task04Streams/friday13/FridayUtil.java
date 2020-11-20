package task04Streams.friday13;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class FridayUtil {


    public static void printFriday13(int start, int end) {
        LocalDate startDate = LocalDate.of(start, 1, 13);
        LocalDate endDate = LocalDate.of(end, 12, 14);
        Stream.iterate(startDate, localDate -> localDate.plusMonths(1))
                .limit(ChronoUnit.MONTHS.between(startDate,endDate))
                .filter(localDate -> localDate.getDayOfWeek()== DayOfWeek.FRIDAY)
                .collect(groupingBy(LocalDate::getYear,counting()))
                .entrySet().stream()
                .sorted((o1, o2) -> (int) (o2.getValue()-o1.getValue()))
                .forEach(System.out::println);

    }

    public static void main(String[] args) {
        printFriday13(1900,1920);
    }
}
