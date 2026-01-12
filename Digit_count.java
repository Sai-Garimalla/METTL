class Digit_count{
static int digitcount(int num)
    {
        int count=0;
        while (num>0){
            num=num/10;
	count++;
        }
        return count; 
    }
    public static void main(String[] args)
    {
        int num=10;
        
        int result = digitcount(num);
        System.out.println(result);
    }
    
}