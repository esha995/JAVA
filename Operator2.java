public class Operator2 {
    public static void main(String args[]){
        boolean r= true;
        if(!r)
        {
            System.out.println(" r is true");
        }
        else{
            System.out.println("r is false");
        }
        int a=2;
        if(a%2==0 && a%4==0)
        {
            System.out.println("&& operator");

        }
        else{
            System.out.println("no && operator");
        }
        if(a%2==0 || a%4==0)
        {
            System.out.println("&& operator");

        }
        else{
            System.out.println("no && operator");
        }
        if(a%2==0 ^ a%4==0)
        {
            System.out.println("^ operator");

        }
        else{
            System.out.println("no ^ operator");
        }
        int k=10;
         int i=(k<10)?k:0;
         System.out.println("i is"+i);
    }
    
}
// boolean operator