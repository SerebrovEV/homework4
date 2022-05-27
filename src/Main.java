import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        int i = 0;
        while (i < 10) {
            System.out.print(++i + " ");
            }
        System.out.println();
        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

        public static void task2 () {
        int firstFriday = 5;
        for (int currentFriday = firstFriday; currentFriday <= 31; currentFriday += 7) {
            System.out.println(currentFriday + "-е число. Необходимо подготовить отчет!");
        }
        }

      public  static void task3() {
        int currentYear = LocalDate.now().getYear();
        int firstYear = currentYear - 200;
        int lastYear = currentYear + 100;
        //int year = firstYear;
        for (int year = firstYear; year <= lastYear; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }// break;
        }
        //  System.out.println(year);
         }

    }
