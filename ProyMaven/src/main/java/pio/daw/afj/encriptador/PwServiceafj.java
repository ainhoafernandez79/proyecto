package pio.daw.afj.encriptador;

import org.jasypt.util.password.BasicPasswordEncryptor;
public class PwServiceafj {

	private BasicPasswordEncryptor passwordEncryptor;
	public PwServiceafj() {
		this.passwordEncryptor = new BasicPasswordEncryptor();

	}
		public String encriptarContrasena(String contrasena) {
			return passwordEncryptor.encryptPassword(contrasena);

		}
		public boolean verificarContrasena(String contrasena,String contrasenaEncriptada) {
			return passwordEncryptor.checkPassword(contrasena, contrasenaEncriptada);
		}
	
}
