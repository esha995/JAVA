public class Conditions {
    // if-else , loop ......
    public static void main (String args[])
    {
        /*
        syntax of if 
        if(boolean expression t or f)
        {
            // body 
        }
        else{
            // do this
        }
        */
        //........................
 
        int salary = 24500;
        if(salary>10000){
            salary= salary+2000;
        }
        else{
            salary=salary+100;
        }
        System.out.println(salary);
        ///////////////////////////////////////////////

        // multiples if-else
        if(salary> 1000){
            salary +=2000;

        }
        else if(salary>20000){
            salary +=3000;

        }
        else{
            salary += 1000;
        }
        System.out.println(salary);


    }
}
