package task03Lambda;


public interface Action<T> {
    void doAction(T t);
}