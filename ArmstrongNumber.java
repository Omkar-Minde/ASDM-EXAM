
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int rem,newnum=0,temp;
		 int num=153;
		 
		 temp=num;
		 
		 while(temp>0) {
			 rem=temp%10;
			 newnum=newnum + rem*rem*rem;
			 temp=temp/10;
		 }
		
		 if(newnum==num) {
			 System.out.println("The Number is ArmstrongNumber :"+newnum);
			 
		 }
		 else {
			 System.out.println("The Number is not ArmstrongNumber :"+newnum);
		 }
	}

}
