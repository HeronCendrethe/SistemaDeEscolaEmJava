package sistemaEscola;

public class Responsavel {
	
	public String nome;
	public int idade;
	public String cpf;
	
	
	public Responsavel(String Nome, int Idade,String Cpf)
	{
		 nome = Nome;
		 idade =  Idade;
		 cpf = Cpf;
		
	}
	
	public int soma(int n1,int n2)
	{
		
		int resultado = n1 + n2;
		return resultado;
		
	}
	
}
