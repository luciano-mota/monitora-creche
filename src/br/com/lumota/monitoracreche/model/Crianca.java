package br.com.lumota.monitoracreche.model;

public class Crianca {
	public  static  int count = 1;
	private int id;
	private String nome;
	private String idade;
	private String pai;
	private String cpfPai;
	private String mae;
	private String cpfMae;
	private Turma turma;
	private String endereco;
	private String bairro;
	private String cep;
	private String telefone;
	private String celular;
	
	public Crianca() {
		this.id = count++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getPai() {
		return pai;
	}
	public void setPai(String pai) {
		this.pai = pai;
	}
	public String getCpfPai() {
		return cpfPai;
	}
	public void setCpfPai(String cpfPai) {
		this.cpfPai = cpfPai;
	}
	public String getMae() {
		return mae;
	}
	
	public void setMae(String mae) {
		this.mae = mae;
	}
	public String getCpfMae() {
		return cpfMae;
	}
	public void setCpfMae(String cpfMae) {
		this.cpfMae = mae;
	}
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;	
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	
	@Override
	public String toString() {
		return "Crianca [id=" + id + ", nome=" + nome + ", idade=" + idade + ", pai=" + pai + ", mae=" + mae
				+ ", turma=" + turma + "]";
	}
	
	


}
