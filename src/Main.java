public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }
    public static void task1(){
        System.out.println("Задача 1");
        int contribution = 15000;
        int total = 0;
        int month = 0;
        while (total <= 2_459_000){
            month=month+1;
            total=total+contribution;
            System.out.println("Месяц " + month + " ,сумма накоплений равна " + total + " рублей");
        }
    }
    public static void task2(){
        System.out.println("Задача 2");
        int i = 0;
        while (i<10) {
            i=i+1;
            System.out.print(i+ " ");
        }
        System.out.println();

        for (int y = 10; y > 0; y= y-1) {
            System.out.print(y+ " " );
        }

        System.out.println();
    }
    public static void task3(){
        System.out.println("Задача 3");
        int totalPopulation = 12_000_000;
        int birthRate = 17;
        int mortality = 8;
        int year = 1;
        while (year<=10) {
            int yearRatio = totalPopulation/1000;
            int mortalityYear = mortality*yearRatio;
            int birthRateYear = birthRate*yearRatio;
            totalPopulation=(totalPopulation+birthRateYear)-mortalityYear;
            System.out.println("Год - " +year+ " численность населения составляет " + totalPopulation);
            year++;


        }

    }
    public static void task4() {
        System.out.println("Задача 4");
        int depositAmount = 15000;
        int total = 0;
        double monthPercents = 0.07;
        for (int month = 1 ; total<12000000; month++) {
            total = total+total/100;
            total = (int) ((total+depositAmount) * (1 + monthPercents));
            System.out.println("Месяц " +month+ " сумма " +total);
        }
    }
    public static void task5(){
        System.out.println("Задача 5");
        int depositAmount = 15000;
        int total = 0;
        double monthPercents = 0.07;
        for (int month = 1 ; total<12000000; month++) {
            total = total+total/100;
            total = (int) ((total+depositAmount) * (1 + monthPercents));
            if ( month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма " + total);
            }
        }
    }
    public static void task6(){
        System.out.println("Задача 6");
        int depositAmount = 15000;
        int total = 0;
        double monthPercents = 0.07;
        for (int month = 1 ; month <= 108; month++) {
            total = total+total/100;
            total = (int) ((total+depositAmount) * (1 + monthPercents));
            if ( month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма " + total);
            }
        }
    }
}