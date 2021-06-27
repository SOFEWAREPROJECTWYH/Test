import org.junit.Test;

import java.util.Scanner;

public class ScoreGradle {

    public String gradle(int num){
        if(num>=90&&num<=100){
            System.out.println("您的考试成绩等级为A");
            return "A";
        }else if(num>=80&&num<90){
            System.out.println("您的考试成绩等级为B");
            return "B";
        }else if(num>=70&&num<80){
            System.out.println("您的考试成绩等级为C");
            return "C";
        }else if(num>=60&&num<70){
            System.out.println("您的考试成绩等级为D");
            return "D";
        }else if(num>=0&&num<60){
            System.out.println("您的考试成绩等级为E");
            return "E";
        }else{
            System.out.println("您的考试成绩不符合规范");
            return "不符合规范";
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        ScoreGradle scoreGradle=new ScoreGradle();
        scoreGradle.gradle(num);
    }
}
