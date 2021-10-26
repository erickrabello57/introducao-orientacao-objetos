package poo.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {

	public String numCartao;
	private List<Endereco> enderecos;
	
	public void adicionaEndereco(Endereco endereco) {
		if(endereco == null) {
			throw new NullPointerException("Endereco não pode ser nulo");
		}
		getEnderecos().add(endereco);
	}
	
	
	
	private List<Endereco> getEnderecos(){
		if(this.enderecos == null) {
			enderecos = new ArrayList<Endereco>();
		}
		return this.enderecos;
	}
	
	
	
}
