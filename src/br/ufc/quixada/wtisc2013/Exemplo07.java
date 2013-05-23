package br.ufc.quixada.wtisc2013;

import java.sql.Timestamp;
import java.util.Calendar;

public final class Exemplo07 {

	public static void main(String[] args) {
		java.util.Date data = Calendar.getInstance().getTime();
		java.sql.Timestamp timeStamp = new Timestamp(data.getTime());
		
		System.out.println("Timestamp é subclasse de Date? " + (timeStamp instanceof java.util.Date));
		System.out.println("Date equals Timestamp? " + data.equals(timeStamp));
		System.out.println("Timestamp equals Date? " + timeStamp.equals(data));
	}
}
