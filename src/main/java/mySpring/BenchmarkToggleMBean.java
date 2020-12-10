package mySpring;

public interface BenchmarkToggleMBean {
    boolean isEnabled();

    void setEnabled(boolean enabled);

    void shutDown (int code);
}
