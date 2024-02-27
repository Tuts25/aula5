package model;

public class Usuario {
private String Nome, Celular, Email, Senha, Cpf;

private boolean EstaLogado;

  Usuario (String Nome, String Celular, String Email, String Cpf, String Senha) {
this.Nome = Nome;
this.Celular = Celular;
this.Email = Email;
this.Senha = Senha;
this.Cpf = Cpf;
}

void Autenticacao (String Email, String Senha) {
	if(this.Email == Email && this.Senha == Senha) {
		EstaLogado = true;
		
	}
}

public String getUsuario() {
	return ("\nNome" + this.Nome
			+"\nCpf" + this.Cpf
			+"\nCelular" + this.Celular
			+"\nEmail" + this.Email
			+"\nSenha" + this.Senha
			+"\nEstaLogado" + this.EstaLogado);
}
}
