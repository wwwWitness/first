/**
 * @Author wwwWitness
 * @Date 2023/1/8 9:42
 * @Version 1.0
 * @Since 1.8
 */
public class For {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            if(i % 2 == 0 ){
                System.out.println(i+"是2的倍数");
                continue;
                //break;
            }
            System.out.println(i);
        }
    }

}
