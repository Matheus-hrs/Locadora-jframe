package locadoras;

public class Cliente {
	
		private String Nome;
		private String RG;
		private String nascimento;
		private boolean alugando;
		private Carro end;
		
		//construtor
		
		public Carro getEnd() {
			return end;
		}

		public void setEnd(Carro end) {
			this.end = end;
		}
		
		public Cliente() {
			
			this.end = new Carro();
			
		}

		public Cliente(String nome,String rg,String nasciment,boolean alug) 
		{
			Nome=nome;
			RG=rg;
			this.nascimento=nasciment;
			this.alugando=alugando;
			this.end = new Carro();
		}
		
		public Cliente(String nom,String rg,String nasciment,boolean alug, Carro end) 
		{
			Nome=nom;
			RG=rg;
			this.nascimento=nasciment;
			this.alugando=alugando;
			this.end = end;
		}
		
		//Metodos de acesso
		


		public String getNome() {
			return Nome;
		}



		public void setNome(String nome) {
			Nome = nome;
		}



		public String getRG() {
			return RG;
		}



		public void setRG(String rG) {
			RG = rG;
		}



		public String getNascimento() {
			return nascimento;
		}



		public void setNascimento(String nascimento) {
			this.nascimento = nascimento;
		}



		public boolean isAlugando() {
			return alugando;
		}



		public void setAlugando(boolean alugando) {
			this.alugando = alugando;
		}



		public void Alugueis (int alugueis_atuais) {
			System.out.println("Total de alugueis ate o momento "+alugueis_atuais+"!");
		}
		
		  public String Informacao(){
			  
		        return "Nome do Cliente: " + Nome + "\n" +
		        "Documento: " + RG + "\n" +
		        "Data de nascimento: " + nascimento + "\n" + "Carro:" + end.getModelo();
		        
		    }
	}