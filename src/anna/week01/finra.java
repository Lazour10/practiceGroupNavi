package anna.week01;

public class finra {
    public static void FINRA(){
        for (int i = 1; i <=30 ; i++) {
            if(i%3 == 0 && i%5 == 0){
                System.out.print("FINRA");
            } else if(i%3 == 0){
                System.out.print("FIN");
            }else if(i%5 == 0){
                System.out.print("RA");
            } else{
                System.out.print(i);
            }
        }
    }
}
