package Goldman_Sachs;

public class DemicalConversion {
		/**
		 * Return the fraction output in the following way Examples: If after decimal,
		 * repeating numbers are there in the output . eg. 1/3=0.333333333, this should
		 * be represented as 0.(3) 6/11=0.54545454, this should be represented as 0.(54)
		 * fractionRepresentation(1,2)=0.5 fractionRepresentation(1,3)=0.(3)
		 * fractionRepresentation(6,11)=0.(54)
		 * https://www.tutorialspoint.com/program-to-show-decimal-number-from-rational-number-representation-in-cplusplus
		 */
		public static String fractionRepresentation(int num, int den) {
			if (num == 0)
				return String.valueOf(0);

			if (den == 0)
				throw new IllegalArgumentException("Denominator can't be 0");

			float d = (float) num / (float) den;
			String number = String.valueOf(d);
			String result = number.substring(0, number.indexOf(".") + 1);
			String decimal = number.substring(number.indexOf(".") + 1);

			int i = 0;
			boolean repeated = false;
			String repeatedValue = "";
			while (i < decimal.length()) {
				if (repeatedValue.length() > 0 && (i + repeatedValue.length() < decimal.length())
						&& decimal.substring(i, i + repeatedValue.length()).equals(repeatedValue)) {
					repeated = true;
					break;
				} else {
					repeatedValue = repeatedValue + decimal.charAt(i);
					i++;
				}
			}

			result += (repeated? "("+repeatedValue+")" : decimal);
			return result;
		}


		public static void main(String args[]) {
			System.out.println(fractionRepresentation(1, 2) + " " + fractionRepresentation(1, 3) + " "
					+ fractionRepresentation(6, 11));

			if (fractionRepresentation(1, 2).equals("0.5") && fractionRepresentation(6, 11).equals("0.(54)")
					&& fractionRepresentation(1, 3).equals("0.(3)")) {
				System.out.println("All passed");
			} else {
				System.out.println("Failed");}}}
			

