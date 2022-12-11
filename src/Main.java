public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        char clientOS = 0;
        switch (clientOS) {
            case 1:
                System.out.println("«Установите версию приложения для Android по ссылке»");
                break;
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке»");
        }

    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOs = 0;
        int clientDeviceYear = 2012;

        if (clientOs == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию для IOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для IOS по сылке");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по сылке");
            }
        }
    }


    public static void task3() {
        System.out.println("Задача 3");
        int year = 2024;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " Является высокосным");
        } else {
            System.out.println(year + " не является высокостным");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        System.out.println("Потребуется дней: " + deliveryDays);

        }


    public static void task5 () {
        System.out.println("Задача 5");
        int mountNumber = 14;
        switch (mountNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
                case 6:
                case 7:
                case 8:
                System.out.println("Лето");
                break;
                case 9:
                case 10:
                case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Некоректный месяц: " + mountNumber);

        }

        }
}

