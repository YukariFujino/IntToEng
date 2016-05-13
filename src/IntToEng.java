import java.util.Scanner;

public class IntToEng {
	   // メインメソッド
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));
    }
	
        static String translateEng(int n) {	
        	if(n==0)return "zero";
        	StringBuffer sb=new StringBuffer();
        	int a=n%10;
        	int b=n/10;
        	if(b==1) {
        		sb.append(teen(n)) ;     		
        	}
        	else{
        		sb.append(junokurai(b));
        		sb.append(ichinokurai(a));
        	}
            return sb.toString();     
        }
        static String ichinokurai(int a){
        	if(a==1)return "one";
        	if(a==2)return "two";
        	if(a==3)return "three";
        	if(a==4)return "four";
        	if(a==5)return "five";
        	if(a==6)return "six";
        	if(a==7)return "seven";
        	if(a==8)return "eight";
        	if(a==9)return "nine";
        	return "";
        }
        static String junokurai(int b){
        	if(b==2) return "twenty";
        	if(b==3) return "thirty";
        	if(b==4) return "fourty";
        	if(b==5) return "fifty";
        	if(b==6) return "sixty";
        	if(b==7) return "seventy";
        	if(b==8) return "eighty";
        	if(b==9) return "ninety";
        	
        	return "";
        }
        static String teen(int n){
        	if(n==10) return "ten";
        	if(n==11)return "eleven";
        	if(n==12) return "twelve";
        	if(n==13) return "thirteen";
        	if(n==14) return "fourteen";
        	if(n==15) return "fifteen";
        	if(n==16) return "sixteen";
        	if(n==17) return "seventeen";
        	if(n==18) return "eighteen";
        	if(n==19) return "nineteen";
        	
        	return "";
        }
}
