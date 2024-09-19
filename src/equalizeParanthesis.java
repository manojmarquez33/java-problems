import java.util.Scanner;
import java.util.Stack;

class equalizeParanthesis{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        Stack<Character> stack = new Stack<>();

        boolean valid = true;
        for(int i=0;i<s.length();i++){
            char bracket = s.charAt(i);
            if(bracket=='{' || bracket=='(' || bracket=='['){
                stack.push(bracket);
            } else {
                if(bracket=='}' || bracket==')' || bracket==']'){
                    if ((stack.isEmpty())){
                        valid = false;
                        break;
                    }
                    char top = stack.pop();
                    if((bracket=='}' && top!='{') || (bracket==']' && top!='[') ||(bracket==')' && top!='(') ){
                        valid = false;
                        break;
                    }
                }
            }
        }

        if(!stack.isEmpty()){
            valid = false;
        }
        System.out.println(valid ? "Yes" : "No");
    }
}

