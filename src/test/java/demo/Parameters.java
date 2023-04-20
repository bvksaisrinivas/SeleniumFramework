package demo;

public class Parameters {

	public void m1(){
		
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		System.out.println(BROWSER);
		System.out.println(URL);
	}
}
