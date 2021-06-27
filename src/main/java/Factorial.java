public class Factorial {

    public String answer(int n){
        int sum=1;
        if(n==0) return 1+"";
        if(n>0){
            for(int i=n;i>1;i--){
                sum*=i;
            }
            return sum+"";
        }
        if(n<0) return "结果不规范";
        return "结果不规范";
    }
}
