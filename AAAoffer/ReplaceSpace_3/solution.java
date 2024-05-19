package AAAoffer.ReplaceSpace_3;

public class solution {
    public String replaceSpace(String s){
        //常规方法 用stringbuilder
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if (s.charAt(i)==' ') {
                builder.append("%20");
            }else{
                builder.append(s.charAt(i));
            }
        }
        return builder.toString();
    }

    public String replaceSpace2(String s){
        //采用原地扩容的思想
        int count=0;
        for(int i=0;i<s.length();i++){
            if (s.charAt(i)==' ') {
                count++;
            }
        }
        char []res=new char[s.length()+2*count];
        int k=res.length-1;
        for(int i=s.length()-1;i>=0;i--){
            if (s.charAt(i)==' ') {
                res[k--]='0';
                res[k--]='2';
                res[k--]='%';
            }
            else{
                res[k--]=s.charAt(i);
            }
        }
        return res.toString();
    }
}
