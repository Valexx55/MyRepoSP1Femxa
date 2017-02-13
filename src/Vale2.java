import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;


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
		
		System.out.println("Buenos dï¿½as");

	}
	
	public static void metodoDuqueYSusana ()
	{
		System.out.println("Buenas tardes Valeriano");
		System.out.println("¿Que qué hizo el rayo? Volver a perder :(");
		System.out.println("Qué realista eres, SUSAN");
	}

	public static String unirCadenas (String cadena1, String cadena2)
	{
		String frase_junta = null;
		
		frase_junta = cadena1 + cadena2;
		cadena2.replace(" ","");
		cadena1=cadena1.replace(" ", "");
//Ni VOLANDO VOY Ni qué pasa aquí...HOLA MUNDO
		return frase_junta;
	}
}
