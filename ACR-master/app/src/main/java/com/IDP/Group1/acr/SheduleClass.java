package com.IDP.Group1.acr;

import android.widget.DatePicker;

class SheduleClass {
	int hour, minute, date, month, year;
	int[] day;
	boolean type, isAM, isEnabled;
	//0 : one time
	//1 : weekly

	public SheduleClass(int hour, int minute, int[] day, boolean isAM) {
		this.hour = hour;
		this.minute = minute;
		this.day = day;
		this.isAM = isAM;
		this.type = true;
		this.isEnabled = true;
		date = month = year = -1;
	}

	public SheduleClass(int hour, int minute, int date, int month, int year, boolean isAM) {
		this.hour = hour;
		this.minute = minute;
		this.date = date;
		this.month = month;
		this.year = year;
		this.isAM = isAM;
		this.type = false;
		this.isEnabled = true;
		day = new int[7];
		for (int i = 0; i < 7; i++) {
			day[i] = 0;
		}
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public boolean isEnabled() {
		return isEnabled;
	}

	public void setEnabled(boolean enabled) {
		isEnabled = enabled;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int[] getDay() {
		return day;
	}

	public void setDay(int[] day) {
		this.day = day;
	}

	public boolean isType() {
		return type;
	}

	public void setType(boolean type) {
		this.type = type;
	}

	public boolean isAM() {
		return isAM;
	}

	public void setAM(boolean AM) {
		isAM = AM;
	}
}
