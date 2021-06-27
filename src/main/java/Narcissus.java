public class Narcissus {
    public String NarcissusFlower(int num){
        if(num<100||num>1000){
            return "条件不符合";
        }
        int a=num/100;
        int b=num-100*a;
        int c=num-100*a-10*b;
        if(a*a*a+b*b*b+c*c*c==num){
            return "是水仙花";
        }else{
            return "不是水仙花";
        }
    }
}
