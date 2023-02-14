package com.xworkz.inheritanceWithCasting.boot;
import com.xworkz.inheritanceWithCasting.thing.Device;
import com.xworkz.inheritanceWithCasting.thing.Camera;
public class DeviceRunner {

	public static void main(String[] args)
	{
		Camera camera=new Camera();
		camera.capture();
		String string=camera.getBrand();
		System.out.println(string);
		
		Device device=new Camera();
		String string1=device.getBrand();
		System.out.println(string1);
		
		Camera casting=(Camera) device;
		casting.capture();
	}

}
