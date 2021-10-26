package poo.model;

public class Endereco {

	public enum TipoEndereco{
		RESIDENCIAL, 
		ENTREGA, 
		TRABALHO};
	
	public String rua;
	public String numero;
	public String complemento;
	public String bairro;
	public String estado;
	public String cep;
	public TipoEndereco tipoEndereco;
	
}
