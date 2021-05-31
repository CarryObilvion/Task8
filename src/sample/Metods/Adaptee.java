package sample.Metods;

public interface Adaptee<ItemType> {
    String display();
    ItemType[] find(String key);
    void insert(ItemType item);
    ItemType delete();

    //сторонний интерфейс, который Клиент не может использовать напрямую.
}
