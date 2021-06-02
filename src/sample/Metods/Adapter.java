package sample.Metods;

public class Adapter implements Adaptee<String> {
    Client client;
//Адаптер получает вызовы от клиента через методы клиентского интерфейса, а затем переводит их в вызовы методов обёрнутого объекта в правильном формате.
    public Adapter() {
        client = new Client();
    }

    public String display() {
        return client.display();
    }

    public String[] find(String key) {
        return client.find(key);
    }

    public void insert(String item) {
        client.insert(item);
    }

    public String delete() {
        return client.delete();
    }
}
//класс-адаптер, обеспечивает доступ к функциям пакета, через набор методов
//со структурами данных - вставка (insert), удаление (delete), поиск элемента по заданному ключу ( find).