public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();


    }

    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            i++;
            total += salary;
        }
        System.out.println("Месяц " + i + ", сумма накоплений равна " + total + "рублей");

    }


    public static void task2() {
        System.out.println("Задача 2");
        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(" " + a + " ");
        }
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            System.out.print(" " + i + " ");


        }
    }

    public static void task3() {
        System.out.println();
        System.out.println("Задача 3");
        int populationY = 12_000_000;
        int theBirthRateIs = 17; // на 1_000
        int mortality = 8; // на 1_000
        int dif = theBirthRateIs - mortality;
        for (int i = 1; i <= 10; i++) {
            populationY += populationY * dif / 1000;

            System.out.println("Год " + i + " , численность населения составляет " + populationY);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int salary = 15000;
        float total = 0f;
        int i = 0;
        float percent = 1.07f;
        while (total <= 2_459_000) {
            i++;
            total = (total + salary) * (percent);


            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }


    public static void task5() {
        System.out.println("Задача 5");
        int salary = 15000;
        float total = 0f;
        int i = 0;
        float percent = 1.07f;
        while (total <= 2_459_000) {
            i++;
            total = (total + salary) * (percent);
            if (i % 6 == 0) {

                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        float salary = 15000f;
        int total = 0;
        int i = 0;
        float percent = 1.07f;
        while (i <= 109) {
            i++;
            total = (int) ((total + salary) * (percent));
            if (i % 6 == 0) {

                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int day = 5;
        for (day = 5; day <= 31; day = day + 7) {

            System.out.println("Сегодня пятница, " + day + " -е число. Необходимо подготовить отчет");
        }
    }


    public static void task8() {
        System.out.println("Задача 8");
        int cometFliesYears = 79;
        for (int yearCometAppearance = 0; yearCometAppearance <= 2122; yearCometAppearance = yearCometAppearance + 79) {
            if (yearCometAppearance >= 1822)

                System.out.println(yearCometAppearance);
        }
    }
}





















