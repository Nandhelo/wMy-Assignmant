package week1.day1;

public class MobileCall {


		public void makeCall(String mobilemodel,float mobileweight)
		{
			System.out.println("mobilemodel =Samsung");
			System.out.println(mobileweight);
		}
		
		public void sendMsg(boolean  fullCharged,int mobileCost)
		{
			System.out.println(fullCharged);
			System.out.println(mobileCost);
		}
		public static void main(String[] args) {
		
			MobileCall mob= new MobileCall();
			mob.makeCall("samsung", 65f);
			mob.sendMsg(true,700);
			System.out.println("This is my Mobile");
					

		} 

	}  


