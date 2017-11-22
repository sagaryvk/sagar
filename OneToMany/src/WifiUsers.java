
public class WifiUsers {
private String name;
private float userData;
private String ipAddress;
public WifiUsers(String name, float userData, String ipAddress) {
	super();
	this.name = name;
	this.userData = userData;
	this.ipAddress = ipAddress;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getUserData() {
	return userData;
}
public void setUserData(float userData) {
	this.userData = userData;
}
public String getIpAddress() {
	return ipAddress;
}
public void setIpAddress(String ipAddress) {
	this.ipAddress = ipAddress;
}
public void display()
{
	System.out.println("Name: "+getName());
	System.out.println("User Data: "+getUserData()+" Gbps");
	System.out.println("Ip Address: "+getIpAddress()+" mbps");

	}
}
