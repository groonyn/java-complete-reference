//Compute distance light travels using long variables

class Light{
	public static void main(String args[]){

		int lightSpeed;
		long days;
		long seconds;
		long distance;

		//approximate speed of light in miles per second
		lightSpeed = 186000;

		days = 1000; // specify number od days here

		seconds = days * 24 * 60 * 60; //convert to seconds

		distance = lightSpeed * seconds; //compute distance

		System.out.print("In "+days);
		System.out.println(" days light will travel about ");
		System.out.println(distance + " miles");
	}
}