package mySpring;

import java.util.Map;

public class BankServiceImpl implements BankService {
    @Override
    public void doWork() {
        System.out.println("working...");
    }


    @Override
    @Benchmark
    public void drinkBeer() {
        System.out.println("drinking..");
    }

    public static void main(String[] args) {
        ApplicationContext context = new ApplicationContext(new JavaConfig(Map.of(), "mySpring"));
        BankService bankService = context.getBean(BankService.class);
        bankService.doWork();
        bankService.drinkBeer();

    }
}
