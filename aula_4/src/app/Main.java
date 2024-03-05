package app;

import model.Banco;
import model.Usuario;
import view.Mensagens;

public class Main {

	public static void main(String[] args) {
		Mensagens mensagem = new Mensagens();
		
		String Nome, Celular, Email, Senha, Cpf, opcao;
		int opcaoNum;
		
		do {
			opcao = mensagem.solicitarEntrada("Sistema Bancario"
							+ "\nDigite a opção desejada"
							+ "\n1. Cadastrar Banco"
							+ "\n2. Cadastrar Usuário"
							+ "\n3. Sair"
							);
			
			opcaoNum = Integer.parseInt(opcao);
			
			switch(opcaoNum) {
				case 1:
				String nomeBanco;
				nomeBanco = mensagem.solicitarEntrada("Digite o nome do banco");
					Banco novoBanco = new Banco(nomeBanco);
					mensagem.mostrarMensagemDeSucesso(
							"Banco Cadastrado com sucesso"
							+ novoBanco.getBanco()
							);
				break;
				
				case 2:
				Nome = mensagem.solicitarEntrada("Digite o seu Nome ");
				Cpf = mensagem.solicitarEntrada("Digite o seu Cpf ");
				Celular = mensagem.solicitarEntrada("Digite o seu Celular ");
				Email = mensagem.solicitarEntrada("Digite o seu Email ");
				Senha = mensagem.solicitarEntrada("Digite a sua Senha ");
				Usuario usuario = new Usuario(Nome, Celular, Email, Senha, Cpf);
				mensagem.mostrarMensagemDeSucesso(usuario.getUsuario());
				break;
				
				case 3:
					System.exit(0);
				break;
				
			}
			
		} while(opcaoNum == 3); 
		
	}

}