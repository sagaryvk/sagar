
public class TestWifi {
		
	public static void main(String[] args) {	
	WifiAccount accObj = new WifiAccount("A101", 123, 50, 48, 100);
	accObj.display();
	WifiUsers[] userObj = new WifiUsers[3];
	userObj[0] = new WifiUsers("Mike",accObj.getData()/userObj.length , "216.58.26");
	userObj[1] = new WifiUsers("Mike",accObj.getData()/userObj.length , "216.58.24");
	userObj[2] = new WifiUsers("Raj",100f/3 , "216.58.25");
	accObj.setUsers(userObj);
	WifiUsers[] users = accObj.getUsers();
	System.out.println("----------------------------------");
	System.out.println("Details for Account :"+accObj.getAccountId());
	for(int i=0;i<users.length;i++)
	{
		System.out.println("User"+(i+1)+" Name: "+users[i].getName());
		System.out.println("User"+(i+1)+" Data: "+users[i].getUserData());
		System.out.println("User"+(i+1)+" I.P Address: "+users[i].getIpAddress());
		System.out.println("------------------------------------------------");
	}
		
	}
}
