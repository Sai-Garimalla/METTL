class   Count_Even{
    public static void main(String[] args) {
        int num1 = 1111;
        int num2=10;
        int num3=1092;
        int num4=96;
        int num5=0;
        int result =counteven(num1,num2,num3,num4,num5);
        System.out.println(result);
 
    }
    static int counteven(int num1 , int num2,int num3,int num4, int num5){
        int count=0;
        
        if(num1%2==0){
            count++;
        }
        if(num2%2==0){
            count++;
        }
        if (num3%2==0){
            count++;
        }
        if(num4%2==0){
            count++;
        }
        if(num5%2==0){
            count++;
        }
        return count;
    }
}