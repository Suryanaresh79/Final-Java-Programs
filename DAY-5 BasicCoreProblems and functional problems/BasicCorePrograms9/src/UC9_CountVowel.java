import java.util.*;
public class UC9_CountVowel {
	void countNumOFVowel() {
		int vowel=0;
		int consonent=0;
		Scanner inp=new Scanner(System.in);
		String str=new String();
		System.out.println("Enter the String ");
		str=inp.nextLine();
		for(int i=0;i<str.length();i++) {
		if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
			vowel++;

		}
		else if (str.charAt(i)<'z' && str.charAt(i)>'a') {
			consonent++;

		}

	}
		System.out.println("Vowels are "+vowel);
		System.out.println("Consonent are "+consonent);
	}


	public static void main(String[] args) {

		UC9_CountVowel rv=new UC9_CountVowel();
		rv.countNumOFVowel();

	}

}