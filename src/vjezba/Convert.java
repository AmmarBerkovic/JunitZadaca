package vjezba;

public class Convert {
	public double poundUKilo(double pounds) {
		return pounds * 2.2046;
	}

	public double kiloUPound(double kilos) {
		return kilos / 2.2046;
	}

	public double cmUInch(double cm) {
		return cm / 2.54;
	}

	public double inchUCm(double inch) {
		return inch * 2.54;
	}

	public double cUF(double c) {
		return (c * 9 / 5) + 32;
	}

	public double fUC(double f) {
		return (41 - 32) * 5 / 9;
	}
}
