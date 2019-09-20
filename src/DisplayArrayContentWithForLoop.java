
public class DisplayArrayContentWithForLoop {

	public static void main(String[] args) {
		int arrayOfNumbers[] = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < arrayOfNumbers.length; i++) {
			System.out.println(i + "de element: " + arrayOfNumbers[i]);
		}
		
		System.out.println("------------");
		
		float[] soundtrackDuration  = new float[4];

	    soundtrackDuration[0] = 20.01f;
	    soundtrackDuration[1] = 273.01f;
	    soundtrackDuration[2] = 140;
	    soundtrackDuration[3] = 92;

	    for(int index=0; index < soundtrackDuration.length; index++) {
	   
	      System.out.println("Soundtrack duration " + index + ": " + soundtrackDuration[index]);
	    }
	}
}