public class Triangle {
    public String triangleType(int a, int b, int c){
        if(a<=0||b<=0||c<=0){
            System.out.println("边值不合法");
            return "边值不合法";
        }else if(a+b<=c||a+c<=b||b+c<=a){
            System.out.println(a+","+b+","+c+"这三条边不可以构成三角形");
            return a+","+b+","+c+"这三条边不可以构成三角形";
        }else if(a==b&&c!=b){
            System.out.println(a+","+b+","+c+"这三条边可以构成一个等腰三角形");
            return a+","+b+","+c+"这三条边可以构成一个等腰三角形";
        }else if(a==b&&b==c){
            System.out.println(a+","+b+","+c+"这三条边可以构成等边三角形");
            return a+","+b+","+c+"这三条边可以构成等边三角形";
        }else if(a*a==b*b+c*c||b*b==a*a+c*c||c*c==a*a+b*b){
            System.out.println(a+","+b+","+c+"可以构成直角三角形");
            return a+","+b+","+c+"可以构成直角三角形";
        }else{
            System.out.println(a+","+b+","+c+"可以构成普通三角形");
            return a+","+b+","+c+"可以构成普通三角形";
        }
    }
}
