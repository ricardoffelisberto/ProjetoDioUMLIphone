package dispositivos.smartphone;

import dispositivos.navegador.NavegadorInternet;
import dispositivos.reprodutor.ReprodutorMusical;
import dispositivos.telefone.AparelhoTelefonico;

public class Smartphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
	public static void main(String[] args) {
		Smartphone iphone = new Smartphone();
		
		iphone.reproduzir();
		iphone.telefonar();
		iphone.navegar();
	}
	
	public void reproduzir() {
		System.out.println("Reproduzindo a música!");
	}
	public void telefonar() {
		System.out.println("Fazendo um telefonema!");
	}
	public void navegar() {
		System.out.println("Navegando pela internet!");
	}
}
