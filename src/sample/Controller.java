package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import sample.Metods.Adapter;

public class Controller {
    public ListView listView;
    public AnchorPane collectionButtons;
    public TextField searchInput;
    public TextField insertInput;

    Adapter adapter = new Adapter();

    public void insert(ActionEvent actionEvent) {
        String newItem = insertInput.getText();
        // чтоб не добавлять пустые элементы
        if (newItem.isEmpty() || newItem.isBlank()) {
            return;
        }
        adapter.insert(newItem);
        displayCollection();
    }

    public void delete(ActionEvent actionEvent) {
        String newItem = insertInput.getText();
        if (newItem.isEmpty() || newItem.isBlank()){
            return;
        }
            adapter.delete();
            displayCollection();
    }

    public void search() {
        String searchKey = searchInput.getText();
        if (searchKey.isEmpty() || searchKey.isBlank()) {
            displayCollection();
            return;
        }

        String[] searchResult = adapter.find(searchKey);
        if (searchResult.length == 0) {
            clearListView();
            listView.getItems().add("Элементов не найдено");
            return;
        }

        clearListView();
        listView.getItems().addAll(searchResult);
    }

    public void addModule(ActionEvent actionEvent) {


            insertInput.setText("Модуль");
            displayCollection();


    }

    public void addSubs(ActionEvent actionEvent) {


            insertInput.setText("Подсистема");
            displayCollection();


    }

    public void addLibr(ActionEvent actionEvent) {

           
            insertInput.setText("Библиотека");
            displayCollection();


    }


    private void clearListView() {listView.getItems().clear();}

    private void displayCollection() {
        clearListView();
        String[] items = adapter.display().split(" ");
        listView.getItems().addAll(items);
    }


}


