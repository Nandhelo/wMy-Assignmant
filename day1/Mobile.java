package week1.day1;


	public class Mobile {
		 
		 public void SendSms () {
			 System.out.println("allow me to send sms");}
		 
			 protected void allowVoicecall() {
				 System.out.println("allow only my family to do voice call");}
			 private void takeVedio() 
			 { System.out.println("allow me to take video");}
			 public static void main (String[] args) {
				 Mobile mob=new Mobile();
				 mob.SendSms();
				 mob.allowVoicecall();
				 mob.takeVedio();}
			 
			 
				

}
