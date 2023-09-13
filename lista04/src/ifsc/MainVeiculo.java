package ifsc;

import java.util.ArrayList;

public class MainVeiculo {

	public static void main(String[] args) {
		
		ArrayList<Veiculo> carros = new ArrayList<>(3);

		Veiculo carro1 = new Veiculo();

		carro1.setNome("Monza");
		carro1.setAno(1982);
		carro1.setCor("Preto");
		carro1.setFabricante("Chevrolet");
		carro1.setNmrRodas(4);

		Veiculo carro2 = new Veiculo();

		carro2.setNome("Uno");
		carro2.setAno(2011);
		carro2.setCor("Prata");
		carro2.setFabricante("Fiat");
		carro2.setNmrRodas(4);

		Veiculo carro3 = new Veiculo();

		carro3.setNome("Impreza");
		carro3.setAno(2008);
		carro3.setCor("Azul");
		carro3.setFabricante("Subaru");
		carro3.setNmrRodas(4);
		
		carros.add(carro1);
		carros.add(carro2);
		carros.add(carro3);
		
		for (Veiculo veiculo : carros) {
			System.out.println(veiculo.getNome());
			System.out.println(veiculo.getAno());
			System.out.println(veiculo.getCor());
			System.out.println(veiculo.getFabricante());
			System.out.println(veiculo.getNmrRodas()+"\n");
		}
		
	}

}
