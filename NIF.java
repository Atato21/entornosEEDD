package actividad24;

import java.util.Formatter;
import java.util.Scanner;

public class NIF {
	private int dni;
	private char letra;
	
	public NIF() {
		this.dni=0;
		this.letra=' ';
	}
	public NIF(int dni) {
		if (calcularDigitos(dni)==8) {
			ajustarLetra(dni);
			setDni(dni);
		}else if(calcularDigitos(dni)<8) {
			ajustarLetra(dni);
			setDni(dni);
		}else if(calcularDigitos(dni)>8) {
			setDni(0);
		}

	}
	public int getDni(){
		return this.dni;
	}
	public void setDni(int dni){
		ajustarLetra(dni);
		this.dni=dni;
	}
	public char getLetra() {
		return this.letra;
	}
	public void setLetra(char letra) {
		this.letra=letra;
	}
	public void leer() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca los 8 digitos de su DNI: ");
		int dni = sc.nextInt();
		setDni(dni);
	}
	public void mostrarNif() {
		if(this.dni==0) {
			System.out.println("NIF no valido");
		}
		if(calcularDigitos(this.dni)==8){
			System.out.println(this.dni + "-" + this.letra);
		}
		if(calcularDigitos(this.dni)<8&&this.dni!=0) {
			Formatter fmt = new Formatter();
			fmt.format("%08d", dni);
			System.out.println(fmt + "-" + this.letra);
		}
		
	}
	private void ajustarLetra(int dni){
		switch(dni%23) {
		case 0: letra='T'; break; case 1: letra='R'; break;
		case 2: letra='W'; break; case 3: letra='A'; break;
		case 4: letra='G'; break; case 5: letra='M'; break;
		case 6: letra='Y'; break; case 7: letra='F'; break;
		case 8: letra='P'; break; case 9: letra='D'; break;
		case 10: letra='X'; break; case 11: letra='b'; break;
		case 12: letra='N'; break; case 13: letra='J'; break;
		case 14: letra='Z'; break; case 15: letra='S'; break;
		case 16: letra='Q'; break; case 17: letra='V'; break;
		case 18: letra='H'; break; case 19: letra='L'; break;
		case 20: letra='C'; break; case 21: letra='K'; break;
		case 22: letra='E'; break;
		}
	}
	private int calcularDigitos(int dni) {
		int aux=0,cifra=0;
		while(dni!=0) {
			aux=dni%10;
			dni=dni/10;
			cifra++;
		}
		return cifra;
	}

}
