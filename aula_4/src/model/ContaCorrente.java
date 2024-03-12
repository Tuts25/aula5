package model;

public class ContaCorrente extends Conta{
	private double ValorTaxa;
	
public ContaCorrente (String email,double ValorTaxa){
	super(email);
		this.ValorTaxa = ValorTaxa;
	}

public String Saque(double ValorSaque){
	if(ValorSaque + ValorTaxa <= saldo){
		saldo =- ValorTaxa;
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
	saldo += ValorDepositado;
	return("Valor Sacado: " + ValorDepositado
			+ "\nValor Saldo Após o Saque: " + saldo);
		}

public double getSaldo() {
	return saldo;
	}
}