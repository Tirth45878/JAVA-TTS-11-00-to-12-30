package OOPS;
final class User{
	final int id = 1;
	final public void callId() {
//		id++;
		System.out.println(id);
	}
}
class Call extends User{
	public void callId() {
//		super.callId();
		System.out.println("call class");
	}
}
public class FinalKeyword {
	public static void main(String[] args) {
		User u = new User();
		u.callId();
		Call c = new Call();
		c.callId();
	}
}
