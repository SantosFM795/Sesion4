package Banco;

import java.util.List;

public class Cuenta {
	
	private String numero;
	private String titular;
	private Double saldo;
	List<Movimiento> Movimientos;
	
	public Cuenta(String numero, String titular, Double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public void ingreso(Double x) {
		this.setSaldo(550.0);
	}
	public void reintegro(Double x) {
		this.setSaldo(350.0);
	}
}
