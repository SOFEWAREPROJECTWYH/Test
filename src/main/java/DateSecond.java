public class DateSecond {
    public String JudgeSecondDay(int year,int month,int day){
        if(month==1||month==3||month==5||
                month==7||month==8||month==10||
                    month==12){
            if(day<=30&&day>=1) return year+"年"+month+"月"+(day+1)+"日";
            if(day==31&&month!=12) return year+"年"+(month+1)+"月"+"1日";
            else if(day==31&&month==12) return year+1+"年"+"1月1日";
            else return "日期不规范";
        }
        if (month==4||month==6||month==9||month==11){
            if(day<=29&&day>=1) return year+"年"+month+"月"+(day+1)+"日";
            if(day==30) return year+"年"+(month+1)+"月"+"1日";
            else return "日期不规范";
        }
        if (month==2&&year%4==0) {
            if (day<=28&&day>=1) return year+"年"+month+"月"+(day+1)+"日";
            if (day==29) return year+"年"+"3月1日";
            else return "日期不规范";
        }else if(month==2&&year%4!=0){
            if (day<=27&&day>=1) return year+"年"+month+"月"+(day+1)+"日";
            if (day==28) return year+"年"+"3月1日";
            else return "日期不规范";
        }
        return "日期不规范";
    }
}
