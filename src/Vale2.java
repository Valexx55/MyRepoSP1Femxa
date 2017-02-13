
public class Vale2 {
	
	public int saludo (String nombre)
	{
		int nletrassaludo = 0;
		
		System.out.println("Hola " + nombre);
		for (int i = 0; i < nombre.length(); i++) {
			nletrassaludo++;
		}
		//GRACIAS ISA! :)
		
		return nletrassaludo;
	}
	
	
	
	public static void main(String[] args)
	{
		
		System.out.println("Buenos d�as");

	}
	
	public static void metodoDuque ()
	{
		System.out.println("Buenas tardes Valeriano");		
	}

	public static String unirCadenas (String cadena1, String cadena2)
	{
		String frase_junta = null;
		
		frase_junta = cadena1 + cadena2;
		cadena2.replace(" ","");
		cadena1=cadena1.replace(" ", "");
//VOLANDO VOY
		return frase_junta;
	}
}
