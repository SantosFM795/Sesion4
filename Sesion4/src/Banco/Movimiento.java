package Banco;

public class Movimiento {
	public Movimiento(double importe, String detalle, signo signo) {
		super();
		this.importe = importe;
		this.detalle = detalle;
		this.signo = signo;
	}
	private double importe;
	enum signo{D,H}; 
	private signo signo;
	private String detalle;
}
