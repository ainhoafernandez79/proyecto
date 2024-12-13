package pio.daw.afj.encriptador;

public class PwServiceafjTest {

	public static void main(String[] args) {
		
		PwServiceafj servicio = new PwServiceafj();
		String password = "miSuperPassword";
		String passwordEncriptada = servicio.encriptarContrasena(password);
		System.out.println("Prueba de alumno afj");
		System.out.println("La contraseña encriptada es:" +passwordEncriptada);
	
		//Vamos a verificarlo
		boolean esValida = servicio.verificarContrasena(password, passwordEncriptada);
		System.out.println("La contraseña encriptada es valida:" +esValida);
	
	}

}
