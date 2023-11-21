class Aluno{
	//Atributo
	private String Nome;
	
	//Metodo
	public void inserirNome () {
		Nome = System.in.toString();
	}
	public String recuperarNome() {
		return Nome;
	}
}