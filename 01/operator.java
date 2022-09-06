import javax.swing.plaf.synth.SynthSeparatorUI;

/*class OperatorEx1{
    public static void main(String[] args){
        int i =5;
        i ++;
        System.out.println(i);

        i= 5;
        ++i;
        System.out.println(i);
    }
}*/

/*class OperatorEx2{
    public static void main(String[] args){
        int i =5, j=0;

        j= i++;
        System.out.println("j=i++ 실행후, i= "+i+" j="+j);

        i=5;
        j=0;

        j=++i;
        System.out.println("j=++i; 실행후, i= "+i+" j="+j);
    }
}*/

/*class OperatorEx3{
    public static void main(String[] args){
        int i = 5, j=5;
        System.out.println(i++);
        System.out.println(++j);
        System.out.println("i = "+i+"j = "+j);
    }
}*/

/*class OperatorEx4{
    public static void main(String[] args){
        int i = -10;
        i = +i;
        System.out.println(i);

        i= -10;
        i = -i;
        System.out.println(i);
    }
}*/

/*class OperaterEx5{
    public static void main(String[] args){
        int a = 10, b=4;

        System.out.printf("%d + %d = %d%n", a, b , a+b);
        System.out.printf("%d - %d = %d%n", a, b , a-b);
        System.out.printf("%d * %d = %d%n", a, b , a*b);
        System.out.printf("%d / %d = %d%n", a, b , a/b); //int 타입이라서 소수점이 버려진다
        System.out.printf("%d / %f = %f%n", a, (float)b , a/(float)b); //float 하면 자동 형변환? 으로 float로 변환되서 소수점을 가지나?
    }
}*/

/*class OperaterEx7{
    public static void main(String[] args){
        byte a = 10;
        byte b = 30;
        byte c =(byte)(a * b);
        System.out.println(c); // 300-256 = 44(값손실)
    }
}*/

/*class OperaterEx8{
    public static void main(String[] args){
        int a = 1_000_000;
        int b = 2_000_000;

        long c = a*b ;

        System.out.println(c); // 이미 a*b 에서 오버플로우
    }
}*/

/*class OperaterEx9{
    public static void main(String[] args){
        long a = 1_000_000 * 1_000_000;
        long b = 1_000_000 * 1_000_000L;

        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}*/

/*class OperaterEx10{
    public static void main(String[] args){
        int a = 1000000;

        int result1 = a*a/a;
        int result2 = a/a*a;

        System.out.println(result1); //먼저 오버플로우가 나서 다른 값이됨
        System.out.println(result2);
    }
}*/

/*class OperaterEx11{
    public static void main(String[] args){
       char a = 'a';
       char d = 'd';
       char zero = '0';
       char two = '2';

       System.out.printf("'%c' -'%c'= %d%n", d, a, d-a);
       System.out.printf("'%c' -'%c'= %d%n", two, zero, two-zero);
       System.out.printf("'%c' = %d%n", a, (int)a);
       System.out.printf("'%c' = %d%n", d, (int)d);
       System.out.printf("'%c' = %d%n", two, (int)two);
       System.out.printf("'%c' = %d%n", zero, (int)zero);
    }
}*/

/*class OperatorEx12{
    public static void main(String[] orgs){
        char c1 = 'a';
        char c2 = c1;
        char c3 = ' ';

        int i = c1+1;

        c3 = (char)(c1 +1);
        c2++;
        c2++;

        System.out.println("i = "+i);
        System.out.println("c2 = "+c2);
        System.out.println("c3 = "+c3);
    }
}*/

class Operator15{ // 대문자 변경
    public static void main(String[] args){
        char lowerCase = 'a';
        char upperCase = (char)(lowerCase -32);
        System.out.println(upperCase);
    }
}




