package Utility;

public class Finra {


        public static int numbers() {
            for (int i = 1; i <= 30; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FINRA");
                } else if (i % 3 == 0) {
                    System.out.println("FIN");
                } else if (i % 5 == 0) {
                    System.out.println("RA");
                } else {
                    System.out.println(i);
                }

            }
            return 0;
        }

    public static void main(String[] args) {

        System.out.println(numbers());
    }
    }


