package anna;

public class Divisible_3_5_15 {
    public static void Divisible3_5_15(int a){
        String divisibleBy15 = "divisibleBy15: ";
        String divisibleBy5 = "divisibleBy5: ";
        String divisibleBy3 = "divisibleBy3: ";

        for (int i = 1; i <= a; i++) {
            if(i%15==0){
                divisibleBy15 +=" " + i;
            }else if(i%3==0){
                divisibleBy3 +=" " + i;
            }else if(i%5 == 0){
                divisibleBy5 +=" " + i;
            }
        }
        System.out.println(divisibleBy15);
        System.out.println(divisibleBy5);
        System.out.println(divisibleBy3);
    }
}
