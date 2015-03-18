package zad2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PsikusImpl implements Psikus {

	public Integer cyfrokrad(Integer liczba){
		if(Math.abs(liczba.intValue())<10)
			return null;
		int random = new Random().nextInt(("" + liczba.intValue()).length());
		if(liczba<0 && random==0)
			random++;
		String fin="";
		for(int i = 0; i < (""+liczba.intValue()).length(); i++){
			if(i!=random)
				fin+=liczba.toString().charAt(i);
		}
		return Integer.parseInt(fin);
	};
	public Integer hultajchochla(Integer liczba) throws NieudanyPsikusException{
		if(Math.abs(liczba.intValue())<10)
			throw new NieudanyPsikusException();
		String liczbatostr="" + liczba.intValue();
		char[] javawhyyoudoingdis = liczbatostr.toCharArray();
		int random1 = new Random().nextInt(liczbatostr.length());
		if(liczba<0&&random1==0)
			random1++;
		int random2 = new Random().nextInt(liczbatostr.length());
		while(random1==random2||(liczba<0&&random2==0))//Im just lazy i know it shouldn't look like this
			random2 = new Random().nextInt(liczbatostr.length());
		char temp=javawhyyoudoingdis[random1];
		javawhyyoudoingdis[random1]=javawhyyoudoingdis[random2];
		javawhyyoudoingdis[random2]=temp;
		String fin="";
		for (char i:javawhyyoudoingdis)
			  fin += i;
		return Integer.parseInt(fin);
	}
	public Integer nieksztaltek(Integer liczba){
		String liczbatostr="" + liczba.intValue();
		String values="376";
		if(!(liczbatostr.contains("3"))&&!(liczbatostr.contains("7"))&&!(liczbatostr.contains("6")))
			return liczba;
		char[] javawhyyoudoingdis = liczbatostr.toCharArray();
		ArrayList<Integer> godwhyjava = new ArrayList<Integer>();
		for(int i=0;i<javawhyyoudoingdis.length;i++)
			if(values.contains(""+javawhyyoudoingdis[i]))
				godwhyjava.add(i);
		Collections.shuffle(godwhyjava);
		if(javawhyyoudoingdis[godwhyjava.get(0)]=='3')
			javawhyyoudoingdis[godwhyjava.get(0)]='8';
		if(javawhyyoudoingdis[godwhyjava.get(0)]=='7')
			javawhyyoudoingdis[godwhyjava.get(0)]='1';
		if(javawhyyoudoingdis[godwhyjava.get(0)]=='6')
			javawhyyoudoingdis[godwhyjava.get(0)]='9';
		String fin="";
		for (char i:javawhyyoudoingdis)
			  fin += i;
		return Integer.parseInt(fin);
	}
}

	
