package mySpring;

import lombok.Data;

@Data
public class BenchmarkToggle implements BenchmarkToggleMBean{
    private boolean enabled=true;

    @Override
    public void shutDown(int code) {
        System.out.println("code = " + code);
        System.exit(code);
    }
}
