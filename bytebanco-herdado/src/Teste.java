
public class Teste {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Vinicius Lemes de Oliveira");
		g1.setCpf("159.329.356-93");
		g1.setSalario(5000.0);
        
        
        System.out.println(g1.getCpf());
        System.out.println(g1.getNome());
        System.out.println(g1.getSalario());
        
        //g1.setSenha(7135);
        
        //g1.salario = 500;
        
       // boolean autenticou = g1.autentica(7135);
        //System.out.println(autenticou);
        //System.out.println(g1.getBonificacao());
	}

}
