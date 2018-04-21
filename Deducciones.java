package PParcial;
public class Deducciones {
	
	private double medicos,
		   		   funerarios,
		   		   seguro,
		   		   hipotecario,
		   		   donativo,
		   		   retiro,
		   		   transporte,
		   		   colegiatura;
	private String nivelEducativo;
	
	public Deducciones (double medicos, double funerarios, double seguro, double hipotecario, double donativo, double retiro, double transporte, double colegiatura, String nivelEducativo){
		this.medicos=medicos;
		this.funerarios=funerarios;
		this.seguro=seguro;
		this.hipotecario=hipotecario;
		this.donativo=donativo;
		this.retiro=retiro;
		this.transporte=transporte;
		this.colegiatura=colegiatura;
		this.nivelEducativo=nivelEducativo;
	}

	public double maximoDeducir (){
		return this.medicos+this.funerarios+this.seguro+this.hipotecario+this.donativo+this.transporte+deducibleColegiatura();
	}
	
	public double getMedicos(){
		return this.medicos;
	}
	public double getFunerarios(){
		return this.funerarios;
	}
	public double getSeguro(){
		return this.seguro;
	}
	public double getHipotecario(){
		return this.hipotecario;
	}
	public double getDonativo(){
		return this.donativo;
	}
	public double getRetiro(){
		return this.retiro;
	}
	public double getTransporte(){
		return this.transporte;
	}
	public double getColegiatura(){
		return this.colegiatura;
	}
	public String getNivelEducativo(){
		return this.nivelEducativo;
	}
	
	public double deducibleColegiatura (){
		double deducibleColegiatura;
		if (this.nivelEducativo.equals("Primaria")){
			deducibleColegiatura=12900.0;
		}
		else if (this.nivelEducativo=="Secundaria"){
			deducibleColegiatura=19900.0;
		}else{
			deducibleColegiatura=24500.0;
		}
		if (this.colegiatura<deducibleColegiatura){
			return this.colegiatura;
		}
		else{
			return deducibleColegiatura;
		}
	}
	
}
