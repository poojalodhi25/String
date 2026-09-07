public class PString{
   public static Boolean isPalindromeString(String str){
	int left=0;
	int right=str.length()-1;

	while(left<right){
	   if(str.charAt(left) !=str.charAt(right)){
		return false;
		
	   }
           left++;
	   right--;
	}
	return true;
	
}
public static void main(String[] args){
	String str="madan";
	Boolean result=isPalindromeString(str);
	System.out.println(result);
	}
}