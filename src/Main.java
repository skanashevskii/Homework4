import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task2_1();
        task2_2();
        task2_3();
        task2_4();
        task2_5();

    }

    public static void task1() {
        System.out.println("Задача 1");
        // Пишем код для задачи 1
        int age = 15;
        if (age >= 18) {
            System.out.println("Если возрат человека равен " + age + " он совершеннолетний");
        } else {
            System.out.println("Если возрат человека равен " + age + ", он не достиг совершеннолетия, надо подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        // Пишем код для задачи 2
        int airTemperature = 5;
        if (airTemperature < 5) {
            System.out.println("На улице " + airTemperature + " градуса, на улице холодно, нужно надеть шапку");
        } else {
            System.out.println("На улице " + airTemperature + " градусов, сегодня тепло, можно идти без шапки");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        // Пишем код для задачи 3
        int speedCar = 65;
        if (speedCar > 60) {
            System.out.println("Cкорость " + speedCar + " км/ч, придется заплатить штраф ");
        } else {
            System.out.println("Cкорость " + speedCar + " км/ч, можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        // Пишем код для задачи 4
        int age = 5;
        if (age >= 2 && age < 7) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в садик");
        } else if (age >= 7 && age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age >= 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }


    }

    public static void task5() {
        System.out.println("Задача 5");
        // Пишем код для задачи 5
        int age = 3;
        boolean adults = true;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        } else if (age >= 5 && age < 14 && adults) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении");
        } else {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        // Пишем код для задачи 6
        int totalPlacesOccupied = 61;

        if (totalPlacesOccupied >= 0 && totalPlacesOccupied < 60) {
            System.out.println("Есть сидячие места и стоячие");
        } else if (totalPlacesOccupied >= 60 && totalPlacesOccupied < 102) {
            System.out.println("Остались только стоячие места");
        } else {
            System.out.println("Вагон забит");
        }

    }

    public static void task7() {
        System.out.println("Задача 7");
        // Пишем код для задачи 7
        int one = 8;
        int two = 5;
        int three = 5;

        if (one > two && one > three && one != two && one != three) {
            System.out.println("one, больше two и three");
        } else if (one == two && one > three && one != three) {
            System.out.println("one, больше three и равно two");
        } else if (one > two && one == three && one != two) {
            System.out.println("one, больше two и равно three");
        } else if (two > one && two > three && two != one && two != three) {
            System.out.println("two, больше one и three");
        } else if (two == one && two > three && two != three) {
            System.out.println("two, больше three и равно one");
        } else if (two > one && two == three && two != one) {
            System.out.println("two, больше one и равно three");
        } else if (two == one && two == three) {
            System.out.println("Все числа равны");
        } else {
            System.out.println("three, больше two и one");
        }
    }

    public static void task2_1() {
        System.out.println("Задача 1 часть 2");
        // Пишем код для задачи 1
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

    }

    public static void task2_2() {
        System.out.println("Задача 2 часть 2");
        // Пишем код для задачи 2
        int clientOS = 1;
        int clientDeviceYear = 2014;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Уточните параметры телефона");
        }
    }

    public static void task2_3() {
        System.out.println("Задача 3 часть 2");
        // Пишем код для задачи 3
        int year = 2021;
        if (year % 4 == 0 && year % 100 > 0) {
            System.out.println(year + " г. високосный");
        } else if (year % 100 == 0 && year % 400 == 0) {
            System.out.println(year + " г. високосный");
        } else {
            System.out.println(year + " г. не високосный");
        }
    }

    public static void task2_4() {
        System.out.println("Задача 4 часть 2");
        // Пишем код для задачи 4
        int deliveryDistance = 95;
        if (deliveryDistance > 0 && deliveryDistance <= 20) {
            System.out.println("На доставку потребуется дней: 1");

        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("На доставку потребуется дней: 2");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("На доставку потребуется дней: 3");
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }

    }

    public static void task2_5() {
        System.out.println("Задача 5 часть 2");
        // Пишем код для задачи 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;

            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }


    }


}