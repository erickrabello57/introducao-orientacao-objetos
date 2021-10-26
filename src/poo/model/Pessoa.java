package poo.model;

public class Pessoa {

		private static final int TAMANHO_CPF = 11;
		private static final int TAMANHO_CNPJ = 14;
		
		public enum TipoPessoa{
			FISICA,
			JURIDICA
		}
		
		public Integer codigo;
		public String nome;
		private String documento;
		public TipoPessoa tipoPessoa;
		
		
		public String getDocumento() {
			return this.documento;
		}
		public void setDocumento(String doc) {
			if(doc == null || doc.isEmpty()) {
				throw new RuntimeException("Documento não pode ser nulo ou vazio");
			}
			
			if(doc.length() == TAMANHO_CNPJ) {
				setDocumento(doc, tipoPessoa = TipoPessoa.JURIDICA);
			} else if(doc.length() == TAMANHO_CPF) {
				setDocumento(doc, tipoPessoa = TipoPessoa.FISICA);
			} else {
				throw new RuntimeException("Documento inválido para pessoa física ou jurídica");
			}
			this.documento = doc;
		}
		
		private void setDocumento(String documento, TipoPessoa tipo) {
			this.documento = documento;
			this.tipoPessoa = tipo;
		}
}
