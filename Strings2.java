import javax.swing.JOptionPane;

public class Strings2 {
	public static void main(String[] args) {
/*		char[] myChars = {'a', 'f', 'b', 'e', 'z', 'i'};
		String myStr= "";
		System.out.println(myStr);
		myStr = myStr.copyValueOf(myChars);
		System.out.println(myStr);
		System.out.println(myChars);

		String abc = "abcdefghijklmnopqrstuvwxyz";
		System.out.println("String abc ends with xyz. True or False? " + abc.endsWith("xyz"));

		// Other methods: contentEquals, equals, equalsIgnoreCase, getChars, hashCode, intern, 
		// isEmpty, lastIndexOf, matches, replace, replaceFirst, replaceAll, split, startsWith,
 		// subSequence, subString, toCharArray, toString, trim, valueOf
*/		String randomS = "abcdefghijkl";
		double myMoney = 10000;
		String moneyOutput;
		moneyOutput = String.format("$%,.2f ", myMoney);
		JOptionPane.showMessageDialog(null, moneyOutput );
		
		System.out.println(moneyOutput.indexOf("1"));
		System.out.println("This is a test");
		
		for (int i =0; i<randomS.length(); i++) {
			System.out.println(randomS.charAt(i));	
		}
		System.exit(0);

	}
}
