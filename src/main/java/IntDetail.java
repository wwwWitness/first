public class IntDetail {
    public static void main(String[] args) {
        //2. Java的整型常量默认为int型，声明long型常量须后加"l"或‘L'
        int n1 = 1;//4个字节
        long n2 = 1l;//8个字节
        long n3 = 2;
        int n4 = 2;
        System.out.println(n3 == n4);//true
    }
}
