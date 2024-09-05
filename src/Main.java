public class Main {
    public static void main(String[] args) {
        //Задача №1
        int clientOS = 1;  //0 — iOS, 1 — Android
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
        System.out.println();

        //Задача №2
        int clientOSB = 1;
        int clientDeviceYear = 2015;
        if (clientOSB == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOSB == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOSB == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOSB == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();

        //Задача №3
        //Решение №1
        int year = 2024;
        if (year >= 1584 && ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0))) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
        System.out.println();

        //Задача №4
        int deliveryDistance = 29;

        if (deliveryDistance <= 20) {
            System.out.println("На доставку потребуется 1 день");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("На доставку потребуется 2 дня");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("На доставку потребуется 3 дня");
        } else if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        }
        System.out.println();

        //Задача №5
        int monthNumber = 5;
        switch (monthNumber) {
            case 12, 1, 2 -> System.out.println("Зимний месяц");
            case 3, 4, 5 -> System.out.println("Весенний месяц");
            case 6, 7, 8 -> System.out.println("Летний месяц");
            case 9, 10, 11 -> System.out.println("Осенний месяц");
            default -> System.out.println("Такого месяца не существует");
        }
    }
}