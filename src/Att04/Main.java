package Att04;

public class Main {

	public static void main(String[] args) {
		
		Hd hd = new Hd();
		hd.setCapacidade(8);
		hd.setMarca("Samsung");
		hd.setModelo("HD SATA");
		hd.setRpm(15000);
		
		Memoria mem = new Memoria();
		mem.setCapacidade(4);
		mem.setMarca("Adata");
		mem.setModelo("DDR3");
		mem.setVelocidade(3200);
		
		Processador p = new Processador();
		p.setCache(128);
		p.setClock(12);
		p.setMarca("Intel");
		p.setModelo("ADM Ryzen");
		
		PlacaMae pm = new PlacaMae();
		pm.setHd(hd);
		pm.setMarca("Asus");
		pm.setMemoria(mem);
		pm.setModelo("LNVNB161216");
		pm.setProcessador(p);
		
		Gabinete g = new Gabinete();
		
		g.setBaias(4);
		g.setModelo("ATX");
		g.setTipo("Full Tower");
		g.setPlacamae(pm);
		
		EquipamentoEletronico ee = new EquipamentoEletronico();
		ee.setConsumo(500);
		ee.setTensao(120);

		Mouse m = new Mouse();
		m.setMarca("Logitech");
		m.setTipo("M170");
		
		Teclado t = new Teclado();
		t.setMarca("Casio");
		t.setTipo("Sem fio");
		
		Monitor mon = new Monitor();
		mon.setMarca("LG");
		mon.setResolucao("4K");
		mon.setTipo("LED");
		
		Computador c = new Computador();
		c.setMarca("Lenovo");
		c.setModelo("Ideaped S145");
		c.setTensao(220);
		c.setConsumo(270);
		c.gabinete = g;
		c.teclado = t;
		c.mouse = m;
		c.monitor = mon;
		
		System.out.println(pm);
		System.out.println(c);
	}

}
