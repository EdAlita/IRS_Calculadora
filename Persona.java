package PParcial;

import java.text.DecimalFormat;

public class Persona {

	private String nombre,
				   rfc;
	private double sueldoMensual,
				   aguinaldo,
				   primaRecibida,
				   salarioMinimo,
				   primaExenta;
	
	public Persona (String nombre, String rfc, double sueldoMensual, double aguinaldo, double primaRecibida){
		this.nombre=nombre;
		this.rfc=rfc;
		this.sueldoMensual=sueldoMensual;
		this.aguinaldo=aguinaldo;
		this.primaRecibida=primaRecibida;
		this.salarioMinimo=80.04;
		this.primaExenta=80.04*15;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	public String getRfc(){
		return this.rfc;
	}
	public double getSueldoMensual(){
		return this.sueldoMensual;
	}
	public double getAguinaldo(){
		return this.aguinaldo;
	}
	public double getPrimaRecibida(){
		
		return this.primaRecibida; 
	}
	public double getPrimaExenta(){
		
		return this.primaExenta;
	}

	public double ingresoAnual (){
		
		return this.sueldoMensual*12;
	}
	
	public double aguinaldoExento (){
		
		return this.sueldoMensual/2;
	}
	
	public double aguinaldoGravado(){
		
		return this.aguinaldo-aguinaldoExento();
	}
	
	public double primaVacacionalGravada(){
		
		return this.primaRecibida - this.primaExenta;
	}
	
	public double totalGravado(){
		
		return ingresoAnual()+aguinaldoGravado()+primaVacacionalGravada();
	}
	public double saldoTotal(){
		
		return ingresoAnual()+this.aguinaldo+this.primaRecibida;
	}
}