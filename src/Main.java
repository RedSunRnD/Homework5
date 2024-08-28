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
        int clientOSB = 0;
        int clientDeviceYear = 2015;
        if (clientOSB == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        System.out.println();

        //Задача №3
        //Решение №1
        int year = 2024;
        /*
        if (year >= 1584 && ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0))) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
        */

        //Решение №2
        if (year >= 1584){
            if (year % 400 == 0){
                System.out.println(year + " год является високосным.");
            } else if (year % 100 != 0 && year % 4 == 0) {
                System.out.println(year + " год является високосным.");
            } else {
                System.out.println(year + " год не является високосным.");
            }
        } else {
            System.out.println(year + " год не является високосным.");
        }
        System.out.println();

        //Задача №4
        int deliveryDistance = 29;
        int deliveryTime = 0;
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет.");
        } else {
            if (deliveryDistance <= 20) {
                deliveryTime += 1;
            } else if (deliveryDistance <= 60) {
                deliveryTime += 2;
            } else {
                deliveryTime += 3;
            }
            System.out.println("Потребуется дней: " + deliveryTime);
        }
        System.out.println();

        //Задача №5
        int monthNumber = 13;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осенний месяц");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}