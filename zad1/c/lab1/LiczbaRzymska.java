package lab1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LiczbaRzymska {
	private int value;
	private static final Map<Integer,String> CHARACTERS=new HashMap<Integer,String>();
	private static ArrayList<Integer> keys=new ArrayList<Integer>();
	public LiczbaRzymska(int value){
		if (value<=0)
			throw new ArithmeticException("value must be above 0!");
		this.value=value;
		if(CHARACTERS.isEmpty()){
			CHARACTERS.put(1, "I");
			CHARACTERS.put(2, "II");
			CHARACTERS.put(3, "III");
			CHARACTERS.put(4, "IV");
			CHARACTERS.put(5, "V");
			CHARACTERS.put(6, "VI");
			CHARACTERS.put(7, "VII");
			CHARACTERS.put(8, "VIII");
			CHARACTERS.put(9, "IX");
			CHARACTERS.put(10, "X");
			CHARACTERS.put(20, "XX");
			CHARACTERS.put(30, "XXX");
			CHARACTERS.put(40, "XL");
			CHARACTERS.put(50, "L");
			CHARACTERS.put(60, "LX");
			CHARACTERS.put(70, "LXX");
			CHARACTERS.put(80, "LXXX");
			CHARACTERS.put(90, "XC");
			CHARACTERS.put(100, "C");
			CHARACTERS.put(200, "CC");
			CHARACTERS.put(300, "CCC");
			CHARACTERS.put(400, "CD");
			CHARACTERS.put(500, "D");
			CHARACTERS.put(600, "DC");
			CHARACTERS.put(700, "DCC");
			CHARACTERS.put(800, "DCCC");
			CHARACTERS.put(900, "CM");
			CHARACTERS.put(1000, "M");
			CHARACTERS.put(1500, "MD");
			CHARACTERS.put(2000, "MM");
		}
	}
	public String toString(){
		
		
		for (Map.Entry<Integer,String> entry : CHARACTERS.entrySet()) {
			keys.add(entry.getKey());

		}
		Collections.sort(keys);
		Collections.reverse(keys);
		
		int val=this.value;
		int mod;
		String fin="";
		for (Integer key : keys) {
			mod=val/key;
			val-=mod*key;
			for(int i=0;i<mod;i++){
				fin+=CHARACTERS.get(key);
			}
			
		}
		return fin;
	}
}
