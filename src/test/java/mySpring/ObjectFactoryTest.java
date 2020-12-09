package mySpring;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class ObjectFactoryTest {


    private ApplicationContext context;

    @Before
    public void setUp() throws Exception {
        context = new ApplicationContext(new JavaConfig(null, "mySpring"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void injectRandomIntForIncorrectValues() {

        context.getBean(Developer.class);

    }

    @Test
    public void injectRandomIntIsWorking() {

        Soldier soldier = context.getBean(Soldier.class);
        Assert.assertTrue(soldier.getPower() < 15 && soldier.getPower() > 10);
    }

    @Test
    public void objectWasCreatedFromConfiguredClass() {

        Config config = Mockito.mock(Config.class);
        Mockito.when(config.getPackageToScan()).thenReturn("mySpring");
        Mockito.when(config.getImpl(SuperHero.class)).then(invocationOnMock -> Batman.class);

        ApplicationContext context = new ApplicationContext(config);

        SuperHero hero = context.getBean(SuperHero.class);
        Assert.assertEquals(Batman.class, hero.getClass());

    }

    @Test
    public void testSingletonWillBeCreatedOnlyOnce() {
        MySingleton bean1 = context.getBean(MySingleton.class);
        MySingleton bean2 = context.getBean(MySingleton.class);
        context.getBean(MySingleton.class);

        Assert.assertTrue(bean1 == bean2);
        Assert.assertEquals(1,MySingleton.counter);
    }


}