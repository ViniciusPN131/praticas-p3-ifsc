package ifsc;

public class MainAnimal {

	public static void main(String[] args) {
		Cachorro fimas = new Cachorro();
		
		fimas.setNome("Fimas");
		fimas.setRaca("salsicha");
		fimas.setComprimento(50f);
		fimas.setCor("Branco");
		fimas.setEcossistema("IFSC");
		fimas.setNmrDePatas(4);
		
		Gato gatao = new Gato();
		
		gatao.setNome("NGGCT");
		gatao.setRaca("Persa");
		gatao.setComprimento(40f);
		gatao.setCor("Preto");
		gatao.setEcossistema("Planeta Terra");
		gatao.setNmrDePatas(3);
		
		fimas.late();
		
		System.out.println(fimas.getNome());
		System.out.println(fimas.getRaca());
		System.out.println(fimas.getComprimento());
		System.out.println(fimas.getCor());
		System.out.println(fimas.getEcossistema());
		System.out.println(fimas.getNmrDePatas()+"\n");
		
		gatao.mia();
		
		System.out.println(gatao.getNome());
		System.out.println(gatao.getRaca());
		System.out.println(gatao.getComprimento());
		System.out.println(gatao.getCor());
		System.out.println(gatao.getEcossistema());
		System.out.println(gatao.getNmrDePatas());
		
	}

}
