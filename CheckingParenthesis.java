import java.util.Scanner;
import java.util.Stack;
public class CheckingParenthesis {
    boolean check(String s){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch == '('|| ch=='{' || ch=='['){
                st.push(ch);
            } else if (ch==')' && st.peek()=='(')  {
                st.pop();
            }
            else if (ch==']' && st.peek()=='[')  {
                st.pop();
            }
            else if (ch=='}' && st.peek()=='{')  {
                st.pop();
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
            }
        }
        if(st.isEmpty()){
            return true;
        }
        else
            return false;
    }
    public static void main(String[] args) {
     CheckingParenthesis cp = new CheckingParenthesis();
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        if(cp.check(s)){
            System.out.println("yes");
        }
        else
            System.out.println("no");
    }
}
