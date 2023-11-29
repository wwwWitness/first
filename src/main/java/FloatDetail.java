public class FloatDetail {
    public static void main(String[] args) {
        //Java的浮点型常量(具体值)默认为double型，声明float型常量，须后加‘f'或‘F'
        //float n1 = 1.1; 错误少f
        float n1 = 1.1f;
        double n2 = 1.1;
        double n3 = 1.1f;//对 四个字节 能放入八个字节中
        System.out.println();

        //十进制数形式:姆:5.12  512.0f .512  (必须有小数点)
        double n4 = .123;
        System.out.println(n4);
        //科学计数法形式:如:5.12e2[] 5.12E-2[]
        System.out.println(5.12e2);//512.0
        System.out.println(5.12E-2);//0.0512

        //通常情况下，应该使用double型,因为它比float型更精确。
        //[举例说明]double num9 = 2.1234567851;float num10 = 2.1234567851F;
        double n9 = 2.1234567851;
        float n10 = 2.1234567851f;
        System.out.println(n9);
        System.out.println(n10);

        //浮点数使用陷阱: 2.7 和 8.1 / 3 比较
        double n11 = 2.7;
        double n12 = 8.1 / 3;
        System.out.println(n11);
        System.out.println(n12);//接近2.7的一个小数
        System.out.println(n11 == n12);//false
        System.out.println(Math.abs(n11 - n12));
    }
}
