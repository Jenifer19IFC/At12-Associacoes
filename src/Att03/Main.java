package Att03;

public class Main {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		p.setEndereco("Imbuia");
		p.setNome("Jênifer");
		
		Banco b = new Banco();
		b.setCodigo(1);
		b.setNome("Itaú");
		b.setNumeroAgencia(8483);
		
		ContaBancaria cb = new ContaBancaria();
		cb.setAgencia(5304);
		cb.setNumeroConta(7142);
		cb.setSaldo(1500);
		cb.banco = b;
		cb.correntista = p;
		
		ContaSimples cs = new ContaSimples();
		cs.setSaldoPoupanca(1500);
		cs.setBanco(b);
		cs.setCorrentista(p);
		cs.setAgencia(321);
		cs.setNumeroConta(998);
		cs.setSaldo(2000);
		
		CartaoDeCredito cc = new CartaoDeCredito();
		cc.setNumero(1234);
		cc.setOperadora("Caixa Econômica");
		cc.setLimite(1000);
		cc.setTipoDeCartao("Nacional");
		
		ContaEspecial ce = new ContaEspecial();
		ce.setDiasSemJuros(7);
		ce.setLimite(1000);
		ce.setCartao(cc);
		ce.setBanco(b);
		ce.setAgencia(678);
		ce.setNumeroConta(987);
		ce.setSaldo(500);
		ce.setCorrentista(p);
		ce.cartao = cc;

		System.out.println(cb);
		System.out.println(cs);
		System.out.println(ce);
		

	}

}
