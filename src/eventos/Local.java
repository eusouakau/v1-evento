package eventos;

public class Local {
	private String instituicao;
	private String telefone;
	private String organizador;

	public Local() {

	}

	public Local(String instituicao, String telefone, String organizador) {
		this.instituicao = instituicao;
		this.telefone = telefone;
		this.organizador = organizador;
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getOrganizador() {
		return organizador;
	}

	public void setOrganizador(String organizador) {
		this.organizador = organizador;
	}

	@Override
	public String toString() {
		return "\nInstituicao: " + instituicao + "\nTelefone: " + telefone + "\nOrganizador: " + organizador;
	}

}
