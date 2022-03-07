import service.impl.InterfaceCollectionImpl;

public class InterfaceCollectionMain {

    public static void main(String[] args) {

        InterfaceCollectionImpl interfaceCollection = new InterfaceCollectionImpl();
        System.out.println("Заполняем массив");
        interfaceCollection.add("ValueOne");
        interfaceCollection.add(2);
        interfaceCollection.add(3);
        System.out.println(interfaceCollection.toString());
        System.out.println("==========");

        System.out.println("Добавляем значение в массив");
        interfaceCollection.add(4);
        System.out.println(interfaceCollection.toString());
        System.out.println("==========");

        System.out.println("Добавляем значение в массив по индексу");
        interfaceCollection.add(2, 10);
        interfaceCollection.add(3, 11);
        interfaceCollection.add(4, "Twelve");
        System.out.println(interfaceCollection.toString());
        System.out.println("==========");

        System.out.println("Удаляем значение в массиве");
        interfaceCollection.delete(10);
        System.out.println(interfaceCollection.toString());
        System.out.println("==========");

        System.out.println("Вызываем значение по индексу из массива");
        System.out.println(interfaceCollection.get(5));
        System.out.println("==========");

        System.out.println("Смотрим есть ли значение в массиве");
        System.out.println(interfaceCollection.contain(1));
        System.out.println("==========");

        System.out.println("Очищаем массив");
        interfaceCollection.clear();
        System.out.println(interfaceCollection.toString());
        System.out.println("==========");

        InterfaceCollectionImpl interfaceCollectionEquals1 = new InterfaceCollectionImpl();
        InterfaceCollectionImpl interfaceCollectionEquals2 = new InterfaceCollectionImpl();

        interfaceCollectionEquals1.add(1);
        interfaceCollectionEquals1.add(2);
        interfaceCollectionEquals1.add(3);

        interfaceCollectionEquals2.add("One");
        interfaceCollectionEquals2.add(2);
        interfaceCollectionEquals2.add(3);

        System.out.println("Сравниваем коллекции: " + interfaceCollectionEquals1.toString() + " и " + interfaceCollectionEquals2.toString());
        System.out.println(interfaceCollectionEquals1.equals(interfaceCollectionEquals2));
        System.out.println("==========");

        System.out.println("Размер массива " + interfaceCollection.toString());
        System.out.println(interfaceCollection.size());
        System.out.println("==========");

        System.out.println("Размер массива " + interfaceCollectionEquals1.toString());
        System.out.println(interfaceCollectionEquals1.size());
        System.out.println("==========");

    }
}
