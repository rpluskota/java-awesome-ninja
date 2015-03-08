package zad2;

import java.util.Random;

public class PsikusImpl implements Psikus {

	public Integer cyfrokrad(Integer liczba){
		if(Math.abs(liczba.intValue())<10)
			return null;
		int random = new Random().nextInt(("" + Math.abs(liczba.intValue())).length());
		String fin="";
		for(int i = 0; i < random; i++){
			if(Integer.parseInt(Character.toString(liczba.toString().charAt(i)))!=random)
				fin+=liczba.toString().charAt(i);
		}
		return Integer.parseInt(fin);
	};
	public Integer hultajchochla(Integer liczba) throws NieudanyPsikusException{
		return 1;
	}
	public Integer nieksztaltek(Integer liczba){
		return 1;
	}
}

	
