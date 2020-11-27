package task06Heroes;

import com.github.javafaker.Faker;
import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HeroFactoryImpl implements HeroFactory {

    private Reflections scanner = new Reflections("task06Heroes");
    private List<Class<? extends Hero>> classes;
    private Faker faker = new Faker();
    public HeroFactoryImpl() {
        classes = new ArrayList<>(scanner.getSubTypesOf(Hero.class));
    }

    @SneakyThrows
    @Override
    public Hero createNewHero() {

       return RandomUtil.randomItem(classes).getDeclaredConstructor(String.class).newInstance(faker.funnyName().name());
    }
}
