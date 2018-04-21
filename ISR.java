package PParcial;


public class ISR {

	private double monto,
				   cuota,
				   porcentaje,
				   pago,
				   total;
	private Persona persona;
	private Deducciones deducciones;
	
	public ISR(String nombre, String rfc, double sueldoMensual, double aguinaldo, double primaRecibida, double medicos, double funerarios, double seguro, double hipotecario, double donativo, double retiro, double transporte, double colegiatura, String nivelEducativo){
		monto=0;
		cuota=0;
		porcentaje=0;
		pago=0;
		total=0;
		persona=new Persona(nombre, rfc, sueldoMensual, aguinaldo, primaRecibida);
		deducciones=new Deducciones(medicos, funerarios, seguro, hipotecario, donativo, retiro, transporte, colegiatura, nivelEducativo);
	}
	
	public double getMonto(){
		return this.persona.totalGravado();
	}
	public double getCuota(){
		return this.cuota;
	}
	public double getPorcentaje(){
		return this.porcentaje;
	}
	public double getPago(){
		return this.pago;
	}
	public double getTotal(){
		return this.total;
	}

	public void pago(){
		this.monto=this.persona.totalGravado()-maximoDeducible();
	}
	
	public double maximoDeducible(){
		double deducible;
		double retiro;
		if (this.deducciones.maximoDeducir()<((this.persona.saldoTotal()*0.10))){
			deducible=this.deducciones.maximoDeducir();
		}
		else{
			deducible=this.persona.saldoTotal()*0.10;
		}
		if (this.deducciones.getRetiro()<((this.persona.saldoTotal()*0.10))){
			retiro=this.deducciones.getRetiro();
		}
		else{
			retiro=this.persona.saldoTotal()*0.10;
		}
		return deducible+retiro;
	}
	
	public void cuotaFija(double monto ){
		if(monto<5952.85){
			this.cuota=0.0;
			this.porcentaje=1.92;
			this.pago=(monto-0.01)*(this.porcentaje/100);
		}
		else if(monto<50524.93){
			this.cuota=114.29;
			this.porcentaje=6.40;
			this.pago=(monto-5952.85)*(this.porcentaje/100);
		}
		else if(monto<88793.05){
			this.cuota=2966.91;
			this.porcentaje=10.88;
			this.pago=(monto-50524.93)*(this.porcentaje/100);
		}
		else if(monto<103218.01){
			this.cuota=7130.48;
			this.porcentaje=16.00;
			this.pago=(monto-88793.05)*(this.porcentaje/100);
		}
		else if(monto<123580.21){
			this.cuota=9438.47;
			this.porcentaje=17.92;
			this.pago=(monto-103218.01)*(this.porcentaje/100);
		}
		else if(monto<249243.49){
			this.cuota=13087.37;
			this.porcentaje=21.36;
			this.pago=(monto-123580.21)*(this.porcentaje/100);
		}
		else if(monto<392841.97){
			this.cuota=39929.05;
			this.porcentaje=23.52;
			this.pago=(monto-249243.49)*(this.porcentaje/100);
		}
		else if(monto<750000.01){
			this.cuota=73703.41;
			this.porcentaje=30.0;
			this.pago=(monto-392841.97)*(this.porcentaje/100);
		}
		else if(monto<1000000.01){
			this.cuota=180850.82;
			this.porcentaje=32.0;
			this.pago=(monto-750000.01)*(this.porcentaje/100);
		}
		else if(monto<3000000.01){
			this.cuota=260850.81;
			this.porcentaje=34.0;
			this.pago=(monto-1000000.01)*(this.porcentaje/100);
		}
		else{
			this.cuota=940850.81;
			this.porcentaje=35.0;
			this.pago=(monto-3000000.01)*(this.porcentaje/100);
		}
	}
								
	public void total(){
		this.total=this.cuota+this.pago;
	}
}

