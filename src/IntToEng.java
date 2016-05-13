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
        		
        	
        	return "";
        }
        static String teen(int n){
        	return "";
        }
}
