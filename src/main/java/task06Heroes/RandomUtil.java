package task06Heroes;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Random;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RandomUtil {
    private static Random random = new Random();

    public static int getIntBetween(int min, int max) {
        return random.nextInt(max - min) + min;
    }

    public static <T> T randomItem(List<T> list) {
        int random = RandomUtil.getIntBetween(0, list.size());
        return list.get(random);
    }

}
