package model;

import java.util.ArrayList;
import java.util.UUID;

public class Banco {

	private String nome_banco;
	private String certificado_autorizacao;
	private ArrayList<Usuario> usuarios;
	
	public Banco(String nome) {
		this.nome_banco = nome;
		this.certificado_autorizacao
		= UUID.randomUUID().toString();
	}

    public String CriarUsuario(String Nome, String Celular, String Email, String Senha, String Cpf) {
    	Usuario usuarioNovo = new Usuario(Nome,Celular,Email,Senha,Cpf);
    	usuarios.add(usuarioNovo);
    	
    	return "Usuario cadastrado com sucesso";
    }
    
    public String getBanco() {
    	return(
    	"\nNome do banco: " + this.nome_banco
    	+"\nCertificado: " + this.certificado_autorizacao
    		   );
    			
    }
}