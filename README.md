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

![Task8](https://user-images.githubusercontent.com/80450495/111903279-88ae2e80-8a52-11eb-878f-222d6a5f9fd2.png)

Скриншот рабочего окна приложения:

![image](https://user-images.githubusercontent.com/80450495/114279189-1bcbfa00-9a3c-11eb-80b5-1f74cdca90c3.png)
