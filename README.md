# Назначение программы

Данная программа предназначен для работы с "особой" структурой данных (упорядоченный массив) с набором собственных методов и приватных полей.

# Область применения программы

Шаблон Адаптер позволяет в процессе проектирования не принимать во внимание возможные различия в интерфейсах уже существующих классов. Если есть класс, обладающий требуемыми методами и свойствами (по крайней мере, концептуально), то при необходимости всегда можно воспользоваться шаблоном Адаптер для приведения его интерфейса к нужному виду.

* Позволяет варьировать внутреннее представление объекта;

* Отделяет процесс конструирования объекта от его внутреннего представления

# Описание проекта

Проект представляет собой оконное приложение. Изначальный вид проекта - AnchorPane с пустым списком внутри. При нажатии на угловую кнопку - выпадает еще один AnchorPane с 2 блоками элементов. Первый включает в себя TextField, label, Button. При нажатии на кнопку, в список добавляется текст с предыдущим элементом списка + введенное в TextField значение. В следующем блоке имеется кнопка поиска и кнопка удаления последнего добавленного текстового элемента.

# Паттерн

Адаптер (англ. Adapter) — структурный шаблон проектирования, предназначенный для организации использования функций объекта, недоступного для модификации, через специально созданный интерфейс. Другими словами — это структурный паттерн проектирования, который позволяет объектам с несовместимыми интерфейсами работать вместе.

# Реализация проекта

Проект построен согласно диаграмме классов.

![image](https://user-images.githubusercontent.com/80450495/120190209-f334d500-c220-11eb-8b75-ff6521a05b98.png)

Скриншот рабочего окна приложения:

![image](https://user-images.githubusercontent.com/80450495/120190353-2aa38180-c221-11eb-9d62-34ef723b02d8.png)
![image](https://user-images.githubusercontent.com/80450495/120190376-3131f900-c221-11eb-9f19-82cb4516807b.png)
![image](https://user-images.githubusercontent.com/80450495/120190396-368f4380-c221-11eb-9310-59090728e04d.png)
![image](https://user-images.githubusercontent.com/80450495/120190429-4018ab80-c221-11eb-9365-1b30057a9a7a.png)
кнопка удалить, удаляет первые добавленные элекменты.
![image](https://user-images.githubusercontent.com/80450495/120190450-4870e680-c221-11eb-898d-9fd892d27f4f.png)



