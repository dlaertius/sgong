package model;

public class Socio extends Pessoa {

	private String tipoSocio,dataArrecada,profissao,dataFili,email;
	private double valorContri;
	
	public Socio(String nome, String endereco,String compleN, String bairro, String cidade, String estado,String rG, String cPF, String nascimento,String celular, String telefone,String dataFili,String tipoSocio, String dataArrecada, String profissao,String email, double valorContri) {
		super(nome,endereco,compleN,bairro,cidade,estado,rG,cPF,nascimento,celular,telefone);
		this.tipoSocio = tipoSocio;
		this.dataFili = dataFili;
		this.dataArrecada = dataArrecada;
		this.profissao = profissao;
		this.valorContri = valorContri;
		this.email = email;
	}


	//Gets e Sets;
	public String getDataFili() {
		return dataFili;
	}


	public void setDataFili(String dataFili) {
		this.dataFili = dataFili;
	}

	public String getTipoSocio() {
		return tipoSocio;
	}

	public void setTipoSocio(String tipoSocio) {
		this.tipoSocio = tipoSocio;
	}

	public String getDataArrecada() {
		return dataArrecada;
	}

	public void setDataArrecada(String dataArrecada) {
		this.dataArrecada = dataArrecada;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public double getValorContri() {
		return valorContri;
	}

	public void setValorContri(double valorContri) {
		this.valorContri = valorContri;
	}
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}