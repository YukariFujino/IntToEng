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
        	int b=n/10;
        	sb.append(sennokurai(n));	
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
        static String junokurai(int n){
        	int a = n%10;
        	String ichi = ichinokurai(a);
        	int b = n/10;
        	String ju ="";
        	if(b==1) return teen(n);
        	if(b==2) ju= "twenty ";
        	if(b==3) ju= "thirty ";
        	if(b==4) ju= "fourty ";
        	if(b==5) ju= "fifty ";
        	if(b==6) ju= "sixty ";
        	if(b==7) ju= "sevent ";
        	if(b==8) ju= "eighty ";
        	if(b==9) ju= "ninety ";
        	
        	return ju+ichi;
        }
        static String hyakunokurai(int n){
        	int a = n/100;
        	int b = n%100;
        	String hyaku="";
        	if(a !=0){
        		hyaku=ichinokurai(a)+" hundred ";
        	}
        	
        	return hyaku+junokurai(b);
        }
        static String sennokurai(int n){
        	int a =n/1000;
        	int b =n%1000;
        	String sen="";
        	if(a==10){
        		sen="ten thousand ";
        	}else if(a !=0){
        		sen=ichinokurai(a)+" thousand ";
        	}
        	return sen+hyakunokurai(b);
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
