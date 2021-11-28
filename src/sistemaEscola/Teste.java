package sistemaEscola;
import java.util.ArrayList;
import java.util.Collections;


import java.util.Comparator;

public class Teste {
	
	public static void main (String...args)
	{
		Aluno al = new Aluno("Heron",6,1);
		Aluno al2 = new Aluno("Stephanie",7,2);
		Aluno al3 = new Aluno("José",8,2);
		Aluno al4 = new Aluno("Carlos",9,2);
		
		ArrayList<Aluno> lista = new ArrayList<Aluno>();
		lista.add(al);
		lista.add(al2);
		lista.add(al3);
		lista.add(al4);
		
		
	
			

	
	for(int i = 0; i< lista.size(); i++) {
		lista.sort((a1, a2) -> Float.compare(a1.getTurma(),a2.getTurma()));
		System.out.println(lista.get(i));
	}
		
	
			
		
			
		
	
		
	}



}