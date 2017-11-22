
public class WifiAccount {
private String AccountId;
private int RouterNumber;
private float speed;
private float price;
private float data;
public WifiAccount(String accountId, int routerNumber, float speed, float price,float data) {
	super();
	AccountId = accountId;
	RouterNumber = routerNumber;
	this.speed = speed;
	this.price = price;
	this.data = data;
}
public String getAccountId() {
	return AccountId;
}
public void setAccountId(String accountId) {
	AccountId = accountId;
}
public int getRouterNumber() {
	return RouterNumber;
}
public void setRouterNumber(int routerNumber) {
	RouterNumber = routerNumber;
}
public float getSpeed() {
	return speed;
}
public void setSpeed(float speed) {
	this.speed = speed;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public float getData() {
	return data;
}
public void setData(float data) {
	this.data = data;
}


private WifiUsers[] users;
public WifiUsers[] getUsers() {
	return users;
}
public void setUsers(WifiUsers[] users) {
	this.users = users;
}

public void display()
{
	System.out.println("Account Id: "+getAccountId());
	System.out.println("Router Number: "+getRouterNumber());
	System.out.println("Speed: "+getSpeed()+" mbps");
	System.out.println("Data: "+getData()+" Gbps");
	System.out.println("Price: "+getPrice()+" $");
	}

}
