public class Operator1 {
    public static void main(String args[])
    {
        int a =4;
        int b=2;

         b += a;  // b= b+a
        int c= a++; // c=a;//a=a+1;
        int d=a++;
        int e=--a;
        int f= a--;
        int g=a++ + b;

        System.out.println("values:"+a);
        System.out.println("values:"+b);
        System.out.println("values:"+c);
        System.out.println("values:"+d);
        System.out.println("values:"+e);
        System.out.println("values:"+f);
        System.out.println("values:"+g);

    }
}
// Airthmetic operator
// + * - / % += -= *= /= %= ++ --