public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(" ");


        // Conditional operator part 2
        System.out.println("Условный оператор часть 2");
        System.out.println(" ");


        // task 1
        System.out.println("Задача 1");

        int clientOS = 1;

        String message = (clientOS == 0) ? "Установите версию приложения для iOS по ссылке" :
                "Установите версию приложения для Android по ссылке";
        System.out.println(message);


        // task 2
        System.out.println("Задача 2");

        int clientDeviceYear = 2015;

        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }

        if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }


        // task 3
        System.out.println("Задача 3");

        int year = 2024;

        if (year > 1584) {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        } else {
            System.out.println("Год не может быть меньше 1585");
        }


        // task 4
        System.out.println("Задача 4");

        int deliveryDistance = 95;
        String deliveryMessage;

        if (deliveryDistance < 20) {
            deliveryMessage = "Срок доставки 1 день.";
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryMessage = "Срок доставки 2 дня.";
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            deliveryMessage = "Срок доставки 3 дня.";
        } else {
            deliveryMessage = "Свыше 100 км доставки нет.";
        }

        System.out.println(deliveryMessage);


        // task 5
        System.out.println("Задача 5");

        int monthNumber = 12;

        switch (monthNumber) {
            case 12, 1, 2 -> System.out.println("Зима");
            case 3, 4, 5 -> System.out.println("Весна");
            case 6, 7, 8 -> System.out.println("Лето");
            case 9, 10, 11 -> System.out.println("Осень");
            default -> System.out.println("Такого месяца нет.");
        }

        
    }
}