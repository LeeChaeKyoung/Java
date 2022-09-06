import java.util.*;
/*class VarEx1{
    public static void main(String[] args){
        int year = 0;
        int age = 22;

        System.out.println(year);
        System.out.println(age);

        year = age + 2000;
        age = age + 2203;

        System.out.println(year);
        System.out.println(age);
    }
}*/

/*class VarEx2{
    public static void main(String[] args){
        int x = 10, y=20;
        int tmp = 0;

        System.out.println("x :"+x+" y:"+y);

        tmp = x;
        x=y;
        y= tmp;

        System.out.println("x :"+x+" y:"+y);

    }
}*/

/*class StringEx{
    public static void main(String[] args){
        String name = "Ja"+"va";
        String str = name + 8.0;

        System.out.println(name);
        System.out.println(str);
        System.out.println(7 +" ");
        System.out.println(" "+7);
        System.out.println(7 + "");
        System.out.println(""+"");
        System.out.println(7 + 7+ "");
        System.out.println(""+7+7);
    }
}*/

/*class PrintEx1{
    public static void main(String[] args){
        byte b =1 ;
        short s = 2;
        char c = 'A';

        int finger = 10;
        long big = 100_000_000_000L;
        long hex = 0xffff_ffff_ffff_ffffL;

        int octNum = 010;
        int hexNum = 0x10;
        int binNum = 0b10;
    
        System.out.printf("b=%d%n", b);
        System.out.printf("s=%d%n",s);
        System.out.printf("c=%c, %d, %n",c,(int)c);
        System.out.printf("finger=[%5d]%n", finger);
        System.out.printf("finger=[%-5d]%n", finger);
        System.out.printf("finger=[%05d]%n", finger);
        System.out.printf("big=%d%n",big);
        System.out.printf("hex=%#x%n",hex);
        System.out.printf("octNum=%o , %d%n", octNum, octNum);
        System.out.printf("hexNum=%x , %d%n", hexNum, hexNum);
        System.out.printf("binNum=%s , %d%n", Integer.toBinaryString(binNum), binNum);
    }
}*/

/*class PrintEx1{
    public static void main(String[] args){
        String url = "www.codechobo.com";

        float f1 = .10f;
        float f2 = 1e1f;
        float f3 = 3.14e3f;
        Double d = 1.23456789;

        System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
        System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
        System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);

        System.out.printf("d=%f%n", d);
        System.out.printf("d=%14.10f%n",d);

        System.out.printf("[12345678901234567890]%n");
        System.out.printf("[%s]%n,url");
        System.out.printf("[%20s]%n,url");
        System.out.printf("[%-20s]%n,url");
        System.out.printf("[%.8s]%n,url");

    }
}*/

/*class ScannerEx{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("두자리 정수 하나 입력");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);
        
        System.out.println("입력내용 : "+input);
        System.out.printf("num=%d%n",num);
    }
}*/

/*class OverflowEx{
    public static void main(String[] args){
        short sMin = -32768;
        short sMax = 32767;
        char cMin = 0;
        char cMax = 65535;

        System.out.println("sMin = "+sMin);
        System.out.println("sMin-1 : "+(short)(sMin-1));
        System.out.println("sMax = "+sMax);
        System.out.println("sMax+1 = "+(short)(sMax+1));
        System.out.println("cMin = "+(int)cMin);
        System.out.println("cMin-1 = "+ (int)--cMin);
        System.out.println("cMax = "+(int)cMax);
        System.out.println("cMax+1 = "+(int)++cMax);
    }
}*/

/*class CastingEx1{
    public static void main(String[] args){
        double d = 85.4;
        int score = (int)d;

        System.out.println(("score : " +score));
        System.out.println("d = "+d);

    }
}*/
