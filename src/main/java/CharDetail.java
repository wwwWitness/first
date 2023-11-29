public class CharDetail {
    public static void main(String[] args) {
        //在java中,char的本质是一个整数，在输出时，是unicode码对应的字符
        char c1 = 97;
        System.out.println(c1);//a

        char c2 = 'a';//输出a对应的数字
        System.out.println((int)c2);//97

        char c3 = '王';
        System.out.println((int)c3);

        char c4 = '浩';
        System.out.println((int)c4);

        char c5 = 29579;
        System.out.println(c5);

        char c6 = 28009;
        System.out.println(c6);
        System.out.println(""+c5+""+c6);

        //char类型是可以进行运算的，相当于一个整数，因为他都对应有Unicode码
        System.out.println('a' + 10);//107
        System.out.println('王' + 10);
    }
}
