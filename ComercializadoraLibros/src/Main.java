

public class Main {

	public static void main(String[] args) {

		Libros lbr1 = new Libros("La piedra Filosofal", 30);
		Libros lbr2 = new Libros("Metamorfosis", 28);
		
		Cd Cd1 = new Cd("Anima Christe", 15);
		Cd Cd2 = new Cd("Shape of you", 21);

		System.out.println("***********LIBROS***********");
		System.out.println("USTED TIENE QUE CANCELAR POR EL LIBRO DE FRIDA KALO:" + lbr1.getValor1() +  "$");
		System.out.println("EL LIBRO DE LUISITO COMUNICA CUESTA : " + lbr2.getValor1() +  "$"); 
		
		System.out.println("************CD***************                                                ");
		
		System.out.println("EL VALOR DEL CD DE ANIMA CHRISTE ES :" +  Cd1.getValorcd1() +  "$");
		System.out.println("EL VALOR DEL CD DE SHAPE OF YOU ES : "  + Cd2.getValorcd1() +  "$");
	}

}
