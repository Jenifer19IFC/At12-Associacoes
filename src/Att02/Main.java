package Att02;

public class Main {

	public static void main(String[] args) {
		
		Motor m = new Motor();
		m.setMarca("Fiat");
		m.setPotencia(120);
		m.setCilindros(80);
		m.setCombustivel("Gasolina");
		
		Pessoa p = new Pessoa();
		p.setNome("Jênifer");
		p.setEndereco("Imbuia");
	

		Carro c = new Carro();
		
		c.setFabricante("Fiat");
		c.setModelo("Uno");
		c.setCor("Branco");
		c.setAno(2020);
		c.motor =  m;
		c.dono = p;
		
		System.out.println(c);
		
	}

}
