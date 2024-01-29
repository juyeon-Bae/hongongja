package sec07.exam01;

public class RemoteControlMain {

	public static void main(String[] args) {
		 Television tv = new Television();
		 Audio audio = new Audio();
		
		 tv.turnOff();
		 tv.turnOn();
		 tv.setVolume(5);
		 System.out.println();
		 
		 audio.turnOff();
		 audio.turnOn();
		 audio.setVolume(10);

	}

}
