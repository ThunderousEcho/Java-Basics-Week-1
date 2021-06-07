public class SampleSingleton {
	
	private static SampleSingleton instance = new SampleSingleton();
	
	public static SampleSingleton getInstance() {
		return instance;
	}
}