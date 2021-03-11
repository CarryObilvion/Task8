package sample.Metods;
/**
 *  это класс, который может одновременно работать и с клиентом, и с сервисом.
 *  Он реализует клиентский интерфейс  и содержит ссылку на объект сервиса.
 *  Адаптер получает вызовы от клиента через методы клиентского интерфейса,
 *  а затем переводит их в вызовы методов обёрнутого объекта в правильном формате.
 * @author Kozhevnikov Alexander pPi-171
 * @version 1.3
 */
public class Adapter implements Adaptee {
    Client pr;
    int maxSize = 10;

    public Adapter() {
        pr = new Client();
    }

    public String displ() {
        return pr.display1();
    }

    @Override
    public void inSert(long item) {
        pr.insert(item);
    }

    @Override
    public long poisk() {
        return pr.peekMin();
    }

    @Override
    public long Remuve() {
        return pr.remove();
    }

}