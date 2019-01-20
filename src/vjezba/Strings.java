package vjezba;

public class Strings {
	public int duz(String poruka) {
		return poruka.length();
	}

	public String parni(String poruka) {
		String parni = "";
		for (int i = 1; i < poruka.length(); i += 2) {
			if (Character.isLetter(poruka.charAt(i))) {
				parni += poruka.charAt(i);
			}
		}
		return parni;
	}

	public String neparni(String poruka) {
		String neparni = "";
		for (int i = 0; i < poruka.length(); i += 2) {
		    if (Character.isLetter(poruka.charAt(i))) {
			neparni += poruka.charAt(i);
		    }
		}
		return neparni;
	}

	public String up(String poruka) {
		String upper = "";
		for (int i = 0; i < poruka.length(); i++) {
		    if (Character.isUpperCase(poruka.charAt(i))) {
			upper += poruka.charAt(i);
		    }
		}
		return upper;
	}

	public String low(String poruka) {
		String lower = "";
		for (int i = 0; i < poruka.length(); i++) {
		    if (Character.isLowerCase(poruka.charAt(i))) {
		    	lower += poruka.charAt(i);
		    }
		}
		return lower;
	}

	public String nonChars(String poruka) {
		String nesto = "";
		for (int i = 0; i < poruka.length(); i++) {
		    if (!(Character.isLetter(poruka.charAt(i)))) {
		    	nesto += poruka.charAt(i);
		    }
		}
		return nesto;
	}
}
