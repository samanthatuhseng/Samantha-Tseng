import java.util.Scanner;

public class Main {
    //Code your solution to problem number one here
    static int problemOne(String s){
        int answer = 0;
        for(int i =0;i <s.length(); i++){
            if((s.charAt(i)=='a')||(s.charAt(i)=='e')||(s.charAt(i)=='i')||(s.charAt(i)=='o')||(s.charAt(i)=='u')){
                answer++;
            }
        }
        return answer;
    }
    //Code you problem number two here
    static int problemTwo(String s){
        int answer = 0;
        for(int i = 0; i<s.length()-2; i++){
            if(s.substring(i,i+3).equals("bob")){
                answer++;
            }
        }
        return answer;
    }
    //Code your solution to problem number 3 here
    static String problemThree(String s){
        String builder = "";
        String[] data = new String[s.length()];
        int pos = 0;
        for(int i=0;i<s.length();i++){
            if(i ==s.length()-2){
                if(s.charAt(i)<=s.charAt(i+1)){
                    builder+= s.charAt(i);
                    builder+= s.charAt(i+1);
                    data[pos] = builder;
                    break;
                }else{
                    builder+= s.charAt(i);
                    data[pos] = builder;
                    break;
                }
            }
            if(s.charAt(i)<=s.charAt(i+1)){
                builder += s.charAt(i);
                }
                else{
                    builder+= s.charAt(i);
                    data[pos] = builder;
                    pos++;
                    builder="";
            }
            }
            int biggest = 0;
            int pos2 = 0;
        for(int i=0;i<data.length;i++){
            if(data[i]==null){
                break;
            }
            else if(data[i].length() > biggest ){
                biggest=data[i].length();
                pos2=i;
            }
        }


        return data[pos2];
    }
    public static void main(String[] args) {



        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */



    }
}
