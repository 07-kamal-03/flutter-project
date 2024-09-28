public class Demo {
    public static void main(String[] args) {
        int count=0,para=0;
        String s = "(1+(2*3)+((8)/4))+1";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                para++;
            }
            else if(s.charAt(i)==')'){
                para--;
            }
            count = Math.max(para, count)
    }
    System.out.println(para);
}
}