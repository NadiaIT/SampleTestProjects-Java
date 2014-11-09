package window;

public class Calculate {
	double ai;
	double bi;

	public double add(String a, String b) {
		ai = Double.parseDouble(a);
		bi = Double.parseDouble(b);
		return (ai + bi);
	}

	public double substract(String a, String b) {
		ai = Double.parseDouble(a);
		bi = Double.parseDouble(b);
		return (ai - bi);
	}

	public double multiple(String a, String b) {
		ai = Double.parseDouble(a);
		bi = Double.parseDouble(b);
		return (ai * bi);
	}

	public double division(String a, String b) {
		ai = Double.parseDouble(a);
		bi = Double.parseDouble(b);
		return (ai / bi);
	}

	public double mod(String a, String b) {
		ai = Double.parseDouble(a);
		bi = Double.parseDouble(b);
		return (ai % bi);
	}

	public double sqrrt(String a) {
		ai = Double.parseDouble(a);
		return Math.sqrt(ai);
	}

	public double sqr(String a) {
		ai = Double.parseDouble(a);
		return (ai * ai);
	}

	public double invrse(String a) {
		ai = Double.parseDouble(a);
		return (1 / ai);
	}

}
