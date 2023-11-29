public class While01 {
    public static void main(String[] args) {
        int x = 0;
        while (x < 10){
            System.out.println("x:"+x);
            x++;
        }

        do{
            System.out.println("x:"+x);
            x++;
        }while (x<20);

    }
}
