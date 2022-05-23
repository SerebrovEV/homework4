public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

        public static void task2 () {
        int firstFriday = 2;
        while (firstFriday <= 31) {
            System.out.println(firstFriday + "-е число. Необходимо подготовить отчет!");
            firstFriday = firstFriday + 7;
        }
        }

      public  static void task3() {
        int firstYear = 1822;
        int lastYear = 2122;
        for (int i = firstYear; i <= lastYear; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
         }

    }
