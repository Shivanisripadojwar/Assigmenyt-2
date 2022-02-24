
public class Trigonometry {
void trig(double degrees,String functions) {
	double tan=0;
	switch(functions) {
	
		case "sin":
			double sin = Math.sin(degrees);
			System.out.println(sin);
			break;
		case "cos":
			double cos = Math.cos(degrees);
			System.out.println(cos);
			break;
		case "tan":
			tan = Math.tan(degrees);
			System.out.println(tan);
			break;
		case "cot":
			double cot = 1/tan ;
			System.out.println(cot);
			break;	
		default:
		System.out.println("select valid function");
	}
}
}
