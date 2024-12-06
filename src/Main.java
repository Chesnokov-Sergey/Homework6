import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Домашняя работа 2
        // Задача 1
        System.out.println("Задача 1");
        checkWhichYear(2024);
        checkWhichYear(2025);
        checkWhichYear(2028);

        // Задача 2
        System.out.println("Задача 2");
        defineClassDevice(0, 2023);
        defineClassDevice(1, 2025);
        defineClassDevice(3, 2022);

        // Задача 3
        System.out.println("Задача 3");
        System.out.println("Потребуется " + calcDeliveryDay(68) + " дня для доствки");
        System.out.println("Потребуется " + calcDeliveryDay(28) + " дня для доствки");
    }

    public static void checkWhichYear(int year) {
        if (year > 1584 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — не високосный год");
        }
    }

    public static void defineClassDevice(int clientOS, int year) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && year > currentYear) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && year > currentYear) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        } else {
            System.out.println("Не известная версия ОС");
        }
    }

    public static int calcDeliveryDay(int distance) {
        int deliveryDays;
        if (distance <= 20) {
            deliveryDays = 1;
        } else if (distance <= 60) {
            deliveryDays = 1 + 1;
        } else {
            deliveryDays = 1 + 1 + 1;
        }
        return deliveryDays;
    }
}

//        // Домашняя работа
//        // Задача 1
//        System.out.println("Задача 1");
//        String firstName = "Ivan";
//        String middleName = "Ivanovich";
//        String lastName = "Ivanov";
//        String fullName = lastName + " " + firstName + " " + middleName;
//        System.out.println("Ф. И. О. сотрудника — " + fullName);
//
//        // Задача 2
//        System.out.println("Задача 2");
//        fullName = "Ivanov Ivan Ivanovich";
//        fullName = fullName.toUpperCase();
//        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());
//
//        // Задача 3
//        System.out.println("Задача 3");
//        fullName = "Иванов Семён Семёнович";
//        fullName = fullName.replace("ё", "е");
//        System.out.println("Данные Ф. И. О. сотрудника — " + fullName);
