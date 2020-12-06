package mySpring;

public interface Config {
    <T> Class<? extends T> getImpl(Class<T> type);

    String getPackageToScan ();

}
