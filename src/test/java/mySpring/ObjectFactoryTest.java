package mySpring;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class ObjectFactoryTest {


    @Test(expected = IllegalArgumentException.class)
    public void injectRandomIntForIncorrectValues() {
        ObjectFactory.getInstance().createObject(Developer.class);

    }

    @Test
    public void injectRandomIntIsWorking() {

        Soldier soldier = ObjectFactory.getInstance().createObject(Soldier.class);
        Assert.assertTrue(soldier.getPower() < 15 && soldier.getPower() > 10);
    }

    @Test
    public void objectWasCreatedFromConfiguredClass() {

        Config config = Mockito.mock(Config.class);
        Mockito.when(config.getImpl(SuperHero.class)).then(invocationOnMock -> Batman.class);

        ObjectFactory.getInstance().setConfig(config);
        SuperHero hero = ObjectFactory.getInstance().createObject(SuperHero.class);
        Assert.assertEquals(Batman.class, hero.getClass());

    }
}