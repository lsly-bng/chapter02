package com.javaex.ex08;

public class TV {

	// field
	private int channel;
	private int volume;
	private boolean power;

	// constructor
	public TV() {
	}

	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	// method - g/s
	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean isPower() {
		return power;
	}

	// method - general
	public void power(boolean on) {
		if (on == true) {
			this.power = true;
		} else {
			this.power = false;
		}
	}

	public void channel(int channel) {
		if (this.power == true) {
			if (channel > 255) {
				this.channel = 255;
			} else if (channel < 1) {
				this.channel = 1;
			} else {
				this.channel = channel;
			}
		} else {
			System.out.println("Power is off");
		}
	}

	public void channel(boolean up) {
		int nextChannel;
		if (this.power == true) {
			if (up == true) {
				nextChannel = this.channel + 1;
			} else {
				nextChannel = this.channel - 1;
			}
			this.channel(nextChannel);
		}
	}

	public void volume(int volume) {
		if (this.power == true) {
			if (volume > 100) {
				this.volume = 100;
			} else if (volume < 0) {
				this.volume = 0;
			} else {
				this.volume = volume;
			}
		} else {
			System.out.println("Power is off");
		}
	}

	public void volume(boolean up) {
		int nextVolume;
		if (this.power == true) {
			if (up == true) {
				nextVolume = this.volume + 1;
			} else {
				nextVolume = this.volume - 1;
			}
			this.volume(nextVolume);
		}
	}

	public void status() {
		String powerOn;
		if (this.power == true) {
			powerOn = "on";
		} else {
			powerOn = "off";
		}

		System.out.println("Power:" + powerOn + "	Channel:" + this.channel + "	Volume:" + this.volume);

	}
}
