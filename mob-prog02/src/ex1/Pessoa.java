package ex1;

public class Pessoa {

	private String cpf;
	private String pNome;
	private String sobrenome;
	private String data;
	public Pessoa() {}
	public Pessoa(String cpf, String pNome, String sobrenome, String data) {
		this.cpf = cpf;
		this.pNome = pNome;
		this.sobrenome = sobrenome;
		this.data = data;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getpNome() {
		return pNome;
	}
	public void setpNome(String pNome) {
		this.pNome = pNome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.pNome+" - "+this.cpf+" - "+this.data+" - "+this.sobrenome;
	}
}
