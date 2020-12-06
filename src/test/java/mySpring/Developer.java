package mySpring;

import lombok.Getter;

@Getter
public class Developer {

    @InjectRandomInt(min = 10, max = -5)
    private int experience;
}
