/*
 * The purpose of this class is to model a television
 * @author Xiaozi Wang 09/26/2021
 */

public class Television {
	
	//declare the fields listed in the UML diagram
	//The brand of the TV was created
	private String MANUFACTURER;
	//The size of TV's screen
	private int SCREEN_SIZE;
	//indicates if TV is on or off
	private boolean powerOn;
	//indicateds in which channel is the TV
	private int channel;
	//indicated the volume on TV
	private int volume;
	
	/*
	 * Constructor definition that has two parameters,brand and size.
	 * @param brand
	 * @param size
	 */
	
	public Television(String brand, int size) {
		this.MANUFACTURER = brand;
		this.SCREEN_SIZE = size;
		
		/*Initialize the powerOn field to false (power is off), 
		 *the volume to 20, and the channel to 2.
		 */
		this.powerOn = false;
		this.channel = 2;
		this.volume = 20;
	}
	
	/*
	 * Define accessor methods called getVolume
	 */
	public int getVolume() {
		return volume;
	}
	
	/*
	 * Define accessor methods called getChannel
	 */
	public int getChannel() {
		return channel;
	}
	
	/*
	 * Define accessor methods called getManufacturer
	 */
	public String getManufacturer() {
		return MANUFACTURER;
	}
	
	/*
	 * Define accessor methods called getSCREEN_SIZE
	 */
	public int getScreenSize() {
		return SCREEN_SIZE;
	}
	
	/*
	 * Define a mutator method called setChannel accepts 
	 * a value to be stored in the channel field.
	 */
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	/*
	 * Define a mutator method called power that changes 
	 * the state from true to false or from false to true.
	 */
	public void power() {
		powerOn = !powerOn; //Copy words from the file that given
	}
	
	/*
	 * Define two mutator methods to change the volume. One method 
	 * should be called increaseVolume and will increase the volume by 1. 
	 * The other method should be called decreaseVolume and will decrease the volume by 1.
	 */
	public void increaseVolume() {
		this.volume++;
	}
	public void decreaseVolume() {
		this.volume--;
	}

}
