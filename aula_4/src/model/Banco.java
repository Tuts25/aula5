package model;

public class Banco {

	private String nome_banco;
	private String certificado_autorizacao;
	
	public String getNomeBanco() {
    return nome_banco;
		
}
	
    public String CertificadoAutorizacao() {
	return certificado_autorizacao;
    }
    public void setNomeBnaco (String Nome) {
    	this.nome_banco = Nome;
    	
    }
    public void setCertificadoAutorizacao (String Certificado) {
    	this.certificado_autorizacao = Certificado;
    
    }	
}
