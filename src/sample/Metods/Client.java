package sample.Metods;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class Client {
    // реализует логику очереди (Queue)
    private final ArrayDeque<String> queueArray;    // Этот класс представляют обобщенную двунаправленную очередь

    public Client() {
        queueArray = new ArrayDeque<>();
    }

    public void insert(String item) {
        queueArray.add(item);
    }

    public String[] find(String key) {
        ArrayList<String> result = new ArrayList<>();
        queueArray.forEach(item -> {
            // добавляем в лист, если в строке содержится ключ
            if (item.contains(key)) {
                result.add(item);
            }
        });
        // передаётся указатель на функцию new, чтобы ArrayList перевести в обычный массив
        return result.toArray(String[]::new);
    }


    public String delete() {
        return queueArray.pop();
    }


    public String display() {
        StringBuilder stringBuilder = new StringBuilder();

        queueArray.forEach(item -> {
            stringBuilder.append(item);
            stringBuilder.append(' ');
        });

        return stringBuilder.toString();
    }

}

