package main;

public class RomanNumerals {
	
	private ArabicToRoman[] 	arabicToRoman;
	private String 				romanNumber;
	private int					arabicNumber;
	
	public RomanNumerals(int _arabicNumber) {		
		romanNumber = "";
		arabicNumber = _arabicNumber;
		
		fillArabicToRoman();
		algoRoman();
	}

	private void algoRoman() {
		for (int i = arabicToRoman.length - 1; i >= 0; i--) {
			
			if (i > 0)
				arabicToRomanConsumer(arabicToRoman[i], arabicToRoman[i - 1]);
			else
				arabicToRomanLastConsumer(arabicToRoman[i]);
		}
	}
	
	private void arabicToRomanConsumer(ArabicToRoman symbolEquvalence, ArabicToRoman previous) {
				
		while (arabicNumber > 0 && arabicNumber >= (symbolEquvalence.arabicInt - previous.arabicInt)) {
		
			if (arabicNumber == (symbolEquvalence.arabicInt - previous.arabicInt)) {
				romanNumber += previous.romanChar + symbolEquvalence.romanChar;
				arabicNumber -= symbolEquvalence.arabicInt - previous.arabicInt;
			}
			
			if (arabicNumber >= symbolEquvalence.arabicInt) {
				romanNumber += symbolEquvalence.romanChar;
				arabicNumber -= symbolEquvalence.arabicInt;
			}
		}
	}
	
	private void arabicToRomanLastConsumer(ArabicToRoman symbolEquvalence) {
		
		while (arabicNumber > 0)
		{			
			romanNumber += symbolEquvalence.romanChar;
			arabicNumber -= symbolEquvalence.arabicInt;
		}
	}


	private void fillArabicToRoman() {
		arabicToRoman = new ArabicToRoman[4];
		arabicToRoman[0] = new ArabicToRoman('I', 1);
		arabicToRoman[1] = new ArabicToRoman('V', 5);
		arabicToRoman[2] = new ArabicToRoman('X', 10);		
		arabicToRoman[3] = new ArabicToRoman('L', 50);		
	}

	public String getRomanNumber() {		
		return romanNumber;
	}
	
	private class ArabicToRoman {
		public char 	romanChar;
		public int		arabicInt;
		
		public ArabicToRoman(char _romanChar, int _arabicInt) {
			romanChar = _romanChar;
			arabicInt = _arabicInt;
		}
	}

}
