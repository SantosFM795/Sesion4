package Banco;

import java.util.ArrayList;
import java.util.List;

import Banco.Movimiento.signo;

public class Cuenta {
	
	private String numero;
	private String titular;
	private Double saldo;
	List<Movimiento> Movimientos;
	
	public Cuenta(String numero, String titular, Double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.Movimientos = new ArrayList<Movimiento>();
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
		this.setSaldo(x + this.getSaldo());
		Movimiento nuevo = new Movimiento(x, "Ingreso de "+x, signo.H);
		Movimientos.add(nuevo);
	}
	public void reintegro(Double x) {
		if(this.getSaldo()==-500.0 || this.getSaldo()-x<-500.0) {
			System.out.println("Fondos insuficientes (saldo "+this.getSaldo()+") en la cuenta "+this.getNumero()+ " para el reintegro de "+x);
		}
		else {
			this.setSaldo(this.getSaldo()-x);
			Movimiento nuevo = new Movimiento(x, "Reintegro de "+x, signo.D);
			Movimientos.add(nuevo);
		}
	}
}
