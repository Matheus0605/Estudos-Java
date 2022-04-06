package curso_programacao;

public class Tratamento_de_String {
	public static void main(String[] args) {
		
		String s = "Suzana Matheus Toni";
		String original = "MATHEUS suzana SAZANA matheus    ";

		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 10);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("mat", "suz");
		int i = original.indexOf("ATH");
		int j = original.lastIndexOf("mat");

		System.out.println("Original: - " + original);
		System.out.println("toLowerCase: - " + s01);
		System.out.println("toUpperCase: - " + s02);
		System.out.println("trim: - " + s03 + " -");
		System.out.println("substring(2): - " + s04);
		System.out.println("substring(2,10): - " + s05);
		System.out.println("replace(a, x): - " + s06);
		System.out.println("replace(mat, suz): - " + s07);
		System.out.println("Index of 'ATH' : " + i);
		System.out.println("Last index of 'mat' : " + j);
		
		String[] vect = s.split(" ");
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
	}

}
