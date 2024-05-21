package AAAoffer.IsNumber_19;

public class solution {
    public boolean isNumber(String s){
        //字符可能出现的情况：1、数字 2、小数点 3、e/E 4、-+ 5、其他字符
        if (s==null ||s.length()<=0) {
            return false;
        }
        char[] res = s.trim().toCharArray();
        if (res.length<=0) {
            return false;
        }
        
        boolean is_dot=false;
        boolean is_e_or_E=false;
        boolean is_num=false;

        int len=res.length;
        for(int i=0;i<len;i++){
            if (res[i]>='0'&&res[i]<='9') {
                is_num=true;
            }else if (res[i]=='.') {
                //前面不能时小数点 or e/E
                if(is_dot||is_e_or_E){
                    return false;
                }
                is_dot=true;
            }else if (res[i]=='e'||res[i]=='E') {
                //前面必须要有一个数字，前面不能出现重复的e/E
                if (is_e_or_E||!is_num) {
                    return false;
                }
                is_e_or_E=true;
                is_num=false;
            }else if (res[i]=='-' || res[i]=='+') {
                if (i!=0 && res[i-1]!='e' && res[i-1]!='E') {
                    return false;
                }
            }else{
                return false;
            }
        }
        return is_num;
    }
}
