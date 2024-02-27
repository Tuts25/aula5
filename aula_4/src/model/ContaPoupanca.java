package model;

public class ContaPoupanca extends Conta{
	private double rendimento;
	ContaPoupanca (String email) {
		super(email);
		this.rendimento = rendimento;
	}


	public String Saque(double ValorSaque){
	if(ValorSaque <= saldo){
		saldo =- ValorSaque;
		return (
				"Valor Sacado" + ValorSaque 
				+ "\nValor Saldo Após o Saque: " + saldo
				);
	} else {
		return "Saldo insuficiente";
			}
		}


	public String Deposito (double ValorDepositado) {
	saldo += (ValorDepositado + (ValorDepositado*rendimento));
	return("Valor Sacado: " + ValorDepositado
			+ "\nValor Saldo Após o Saque: " + saldo);
	}

	public double getSaldo() {
		return saldo;
	}
	}
