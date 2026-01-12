class Factorial
{
    public static void main(String[] args)
    {
        int num = 3;
        int result = fact(num);
        System.out.println(result);
    }

    static int fact(int num){

        if (num<=1){
            return 1;

        }
        return num*fact(num-1);
   
    }
       
}