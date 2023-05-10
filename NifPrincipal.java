package actividad24;

public class NifPrincipal {

	public static void main(String[] args) {
		NIF n1 = new NIF();
		NIF n2 = new NIF(12345);
		NIF n3 = new NIF(12345678);
		NIF n4 = new NIF(123456789);
		n1.mostrarNif();
		System.out.println();
		n2.mostrarNif();
		System.out.println();
		n3.mostrarNif();
		System.out.println();
		n4.mostrarNif();
		n1.leer();
		System.out.println();
		n1.mostrarNif();
	}

}
