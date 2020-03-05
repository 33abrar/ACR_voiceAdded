package com.IDP.Group1.acr;

import java.util.ArrayList;
import java.util.List;

public class User implements java.io.Serializable {

	String name, email, machineID, contactInfo;
	List<String> notification;
	boolean isPowerOn, isSleep, isRinging;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMachineID() {
		return machineID;
	}

	public void setMachineID(String machineID) {
		this.machineID = machineID;
	}

	public String getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}

	public List<String> getNotification() {
		return notification;
	}

	public void setNotification(List<String> notification) {
		this.notification = notification;
	}

	public boolean isPowerOn() {
		return isPowerOn;
	}

	public void setPowerOn(boolean powerOn) {
		isPowerOn = powerOn;
	}

	public boolean isSleep() {
		return isSleep;
	}

	public void setSleep(boolean sleep) {
		isSleep = sleep;
	}

	public boolean isRinging() {
		return isRinging;
	}

	public void setRinging(boolean ringing) {
		isRinging = ringing;
	}

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

	public List<SheduleClass> getShedules() {
		return shedules;
	}

	public void setShedules(List<SheduleClass> shedules) {
		this.shedules = shedules;
	}

	int battery;
	List<SheduleClass> shedules;

	User() {
		name = email = machineID = "";
		isPowerOn = isSleep = isRinging = false;
		battery = 0;
		notification = new ArrayList<String>();
		shedules = new ArrayList<>();
//		dummyData();
//		writeData();


		name = "wazed rifat";
		email = "wazedrifat@gmail.com";
		machineID = "1234";
		contactInfo = "01684855907";

		battery = 100;

		notification.add("welcome to our ACR service");
		notification.add("please scan your room");
		notification.add("you battery is fully charged");
		notification.add("add a schedule for cleaning you room daily");

		int[] a = new int[7];

		a[0] = a[1] = a[2] = 1;
		a[3] = a[4] = a[5] = a[6] = 0;

		shedules.add(new SheduleClass(1, 10, 23 ,8, 2019, true));
		shedules.add(new SheduleClass(2, 20, 13 ,7, 2018, false));
		shedules.add(new SheduleClass(3, 30, a, true));
	}

//	private void dummyData() {
//		name = "wazed rifat";
//		email = "wazedrifat@gmail.com";
//		machineID = "1234";
//		contactInfo = "01684855907";
//
//		battery = 100;
//
//		notification.add("welcome to our ACR service");
//		notification.add("please scan your room");
//		notification.add("you battery is fully charged");
//		notification.add("add a schedule for cleaning you room daily");
//
//		int[] a = new int[7];
//
//		a[0] = a[1] = a[2] = 1;
//		a[3] = a[4] = a[5] = a[6] = 0;
//
//		shedules.add(new SheduleClass(1, 10, 23 ,8, 2019, true));
//		shedules.add(new SheduleClass(2, 20, 13 ,7, 2018, false));
//		shedules.add(new SheduleClass(3, 30, a, true));
//	}

//	public void writeData() {
//		FirebaseFirestore db = FirebaseFirestore.getInstance();
//		DocumentReference dr = db.document("user/data");
//		User object = this;
//		dr.set(object);
//	}
//
//	public User readData() {
//		User ret = null;
//
//		try {
//			FileInputStream fileIn = new FileInputStream("/tmp/user.ser");
//			ObjectInputStream in = new ObjectInputStream(fileIn);
//			ret = (User) in.readObject();
//			in.close();
//			fileIn.close();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//
//		return ret;
//	}
}
