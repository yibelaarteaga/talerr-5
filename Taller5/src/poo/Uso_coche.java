package poo;

public class Uso_coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		coche micoche =new coche();
		
		micoche.establece_color("amarillo");
		
	
		
		System.out.println(micoche.dime_datos_generales());
		
		System.out.println(micoche.dime_color());
		
		micoche.configura_asientos("si");
		
		System.out.println(micoche.dime_asientos());
		
		micoche.configura_climatizador("si");
		
		System.out.println(micoche.dime_climatizador());
		
		System.out.println(micoche.dime_peso_coche());
		
		System.out.println("El precio final del coche es: " + micoche.dime_peso_coche());
		
		
			
		
	}

	
}
