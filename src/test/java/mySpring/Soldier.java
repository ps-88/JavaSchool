package mySpring;

import lombok.Getter;

@Getter
public class Soldier {

    @InjectRandomInt(min = 10, max = 15)
    private int power;
}
