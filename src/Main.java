public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
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
        int birthRate = 17*1000;
        int mortality = 8*1000;
        for (int i = 0; i < 12 ; i++) {
            birthRate= birthRate+;

            System.out.println(birthRate);


        }
    }
}