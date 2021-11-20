public class Main {

	public static void main(String[] args) {

		/*SistemaDeSom ss =  new SistemaDeSom();
		ss.setTensao(220);
		ss.setPotencia(1500);
		ss.setModelo("J-45");
		ss.setMarca("JBL");
		ss.setConsumo(550);
		
		SistemaDeVideo sv = new SistemaDeVideo();
		sv.setTipo("LED");
		sv.setTensao(110);
		sv.setResolucao("4K");
		sv.setModelo("L500");
		sv.setMarca("LG");
		sv.setConsumo(500);

		HomeTheater ht = new HomeTheater();
		ht.som = ss;
		ht.video = sv;
		System.out.println(ht);*/
		
		HomeTheater ht = new HomeTheater();
		
		ht.som.setTensao(110);
		ht.som.setPotencia(2000);
		ht.som.setModelo("7370");
		ht.som.setMarca("Nokia");
		ht.som.setConsumo(600);
		
		ht.video.setTipo("OLED");
		ht.video.setTensao(120);
		ht.video.setResolucao("4K");
		ht.video.setModelo("L500");
		ht.video.setMarca("LG");
		ht.video.setConsumo(500);
		
		System.out.println(ht);
		
	}
}