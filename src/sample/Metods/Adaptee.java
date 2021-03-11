package sample.Metods;
/**
 * Cторонний интерфейс/класс,
 * к-й Клиент не может использовать напрямую.
 * @author Kozhevnikov Alexander pPi-171
 * @version 1.3
 */
public interface Adaptee {
    void inSert(long item);
    long poisk();
    long  Remuve();
}
