/**
 * @Author wwwWitness
 * @Date 2023/1/8 10:01
 * @Version 1.0
 * @Since 1.8
 */
public class ForWork1 {
    public static void main(String[] args) {
        double money = 100000;
        int count = 0;
        while(true){
            if(money > 50000){
                money *= 0.95;
                count++;
                System.out.println("剩余money:"+money);
            }
            else if(money>1000 && money<=50000){
                money -= 1000;
                count++;
                System.out.println("剩余money:"+money);
            }
            else{
                break;
            }
        }
        System.out.println(count);
    }


}
