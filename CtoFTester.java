public class CtoFTester{
	public static void main(String[] args){
		System.out.println(celsiusToFahrenheit(0));
		System.out.println(fahrenheitToCelsius(32));
	}
	public static float celsiusToFahrenheit(float c){
		return c * 9 / 5 + 32;
	}
	public static float fahrenheitToCelsius(float f){
		return (f - 32) / 9 * 5;
	}
}
