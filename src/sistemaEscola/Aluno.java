package sistemaEscola;

 public class Aluno {
		
	private String nome;
	private int idade;
	private int turma;
    private Responsavel responsavel;
	
	
	
	
		public Aluno (String Nome, int Idade, int Turma)
		{
			nome = Nome;
			setIdade(Idade);
			setTurma(Turma);
						
					
		}
		
		public int media (float nota1,float nota2,float nota3)
		{
			double resultado = (nota1 + nota2 + nota3)/3;
			
			if(resultado > 60)
			{
				System.out.println(this.nome+"Aprovado");
				return 1;
			}else if(resultado < 40)
			{
				return 2;
			}
			else {
				return 3;
			}
			
		
		}

		public int getTurma() {
			return turma;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String Nome)
		{
			this.nome = Nome;
		}

		public void setTurma(int turma) {
			this.turma = turma;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public Responsavel getResponsavel() {
			return responsavel;
		}

		public void setResponsavel(Responsavel responsavel) {
			this.responsavel = responsavel;
		}
		
		@Override
		public String toString() {
			
			return  "A idade é: " + getIdade() + ", o nome é: "+ getNome();
		}
		

	
}
