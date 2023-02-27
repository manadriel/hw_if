public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }

    public static void task1 () {   //just test if
        System.out.println("Задача 1");
        int age = 12;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " , то он совершеннолетний.");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + " ,то он не достиг совершеннолетия, нужно немного подождать.");
        }
    }

    public static void task2 () {   //if with temp
        System.out.println("Задача 2");
        int temp = 5;
        System.out.println(" Температура " + temp + " градусов");
        if (temp >=5) {
            System.out.println(" Сегодня тепло, можно идти без шапки");
        } else {
            System.out.println(" На улице холодно, нужно надеть шапку");
        }
    }
    public static void task3 () { //if speed
        System.out.println("Задача 3");
        int speed = 69;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " ,то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " ,то можно ездить спокойно");
        }
    }
    public static void task4 () { //what u need to go if u age is...
        System.out.println("Задача 4");
        int age = 33;
        if (age >= 2 && age <= 6 ) {
            System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить в детский сад.");
        }
        if (age >= 7 && age <= 18 ){
            System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить в школу.");
        }
        if (age >= 18 && age <= 24 ){
            System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить в университет.");
        } else {
            System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить на работу.");
        }
    }
    public static void task5 () { //age and attraction
        System.out.println("Задача 5");
        int age = 7;
        if (age < 5 ) {
            System.out.println("Если возраст ребенка равен " + age + " ,то он не может кататься на аттракционе.");
        }
        if (age >= 5 && age <= 14 ){
            System.out.println("Если возраст ребенка равен " + age + " ,то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else {
            System.out.println("Если возраст ребенка равен " + age + " ,то ему можно кататься на аттракционе в без сопровождения взрослого.");
        }
    }
    public static void task6 () { //traind and place
        System.out.println("Задача 6");
        int allPlace = 102;
        int sittingPlace = 60;
        int standingPlace = allPlace - sittingPlace;
        int occupiedPlace = 32 ;
        if (occupiedPlace < 60) {
            System.out.println("В вагоне " + occupiedPlace + " занятых мест. Есть сидячие и стоячие места.");
        } else if (occupiedPlace > standingPlace && occupiedPlace < allPlace) {
            System.out.println("В вагоне " + occupiedPlace + " занятых мест. Есть стоячие места.");
        } else {
            System.out.println("В вагоне " + occupiedPlace + " занятых мест. Вагон забит.");
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int one = 12;
        System.out.println(one + " первое число");
        int two = 6;
        System.out.println(two + " второе число");
        int three = 165;
        System.out.println(three + " третье число");
        if (one < two && two > three) {
            System.out.println("второе число самое большое");
        } else if (two < three && three > one) {
            System.out.println("третье число самое большое");
        } else {
            System.out.println("первое число самое большое");
        }
    }


}