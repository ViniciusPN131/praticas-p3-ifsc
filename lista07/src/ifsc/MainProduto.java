package ifsc;

import java.util.ArrayList;

public class MainProduto {

	public static void main(String[] args) {

		ArrayList<Desktop> desktops = new ArrayList<>();

		Desktop d1 = new Desktop();
		Desktop d2 = new Desktop();
		Desktop d3 = new Desktop();

		ArrayList<String> pecasd1 = new ArrayList<>();
		d1.setGamer(true);
		pecasd1.add("Processador: I9 13600k");
		pecasd1.add("Placa Mãe: X790");
		pecasd1.add("Memoria RAM: 128GB DDR5");
		pecasd1.add("Fonte: corsair HX1500I");
		pecasd1.add("SSD NVMe 2.0 2TB");
		pecasd1.add("Placa de video: RTX 5090");
		pecasd1.add("Gabinete: Cooler Master COSMOS C700M");
		pecasd1.add("Water cooler: Corsair ICUE H170I ELITE CAPELLIX XT");
		pecasd1.add("Cooler: KIT GAMER UNI FAN SL-INF 120");
		d1.setPecas(pecasd1);

		ArrayList<String> pecasd2 = new ArrayList<>();
		d2.setGamer(true);
		pecasd2.add("Processador: I9 12600k");
		pecasd2.add("Placa Mãe: X790");
		pecasd2.add("Memoria RAM: 128GB DDR5");
		pecasd2.add("Fonte: corsair HX1500I");
		pecasd2.add("SSD NVMe 2.0 2TB");
		pecasd2.add("Placa de video: RTX 5090");
		pecasd2.add("Gabinete: Cooler Master COSMOS C700M");
		pecasd2.add("Water cooler: Corsair ICUE H170I ELITE CAPELLIX XT");
		pecasd2.add("Cooler: KIT GAMER UNI FAN SL-INF 120");
		d2.setPecas(pecasd2);

		ArrayList<String> pecasd3 = new ArrayList<>();
		d3.setGamer(true);
		pecasd3.add("Processador: I9 11600k");
		pecasd3.add("Placa Mãe: X790");
		pecasd3.add("Memoria RAM: 128GB DDR5");
		pecasd3.add("Fonte: corsair HX1500I");
		pecasd3.add("SSD NVMe 2.0 2TB");
		pecasd3.add("Placa de video: RTX 5090");
		pecasd3.add("Gabinete: Cooler Master COSMOS C700M");
		pecasd3.add("Water cooler: Corsair ICUE H170I ELITE CAPELLIX XT");
		pecasd3.add("Cooler: KIT GAMER UNI FAN SL-INF 120");
		d3.setPecas(pecasd3);

		desktops.add(d1);
		desktops.add(d2);
		desktops.add(d3);

		ArrayList<Smartphone> smartphones = new ArrayList<>(3);

		Smartphone celulas1 = new Smartphone();
		celulas1.setDimensoesTela("6 polegadas");
		celulas1.setMarca("Xiaomi");

		Smartphone celulas2 = new Smartphone();
		celulas2.setDimensoesTela("7 polegadas");
		celulas2.setMarca("Sansung");

		Smartphone celulas3 = new Smartphone();
		celulas3.setDimensoesTela("5 polegadas");
		celulas3.setMarca("Nokia");

		smartphones.add(celulas1);
		smartphones.add(celulas2);
		smartphones.add(celulas3);

		System.out.println("____________DESKTOPS______________");

		int nmr = 1;
		for (Desktop desktop : desktops) {

			System.out.println("Computador " + nmr + ":\n");
			if (desktop.getGamer()) {
				System.out.println("Gamer");
			} else {
				System.out.println("Não gamer");
			}

			ArrayList<String> pecas = desktop.getPecas();
			for (String peca : pecas) {
				System.out.println(peca);
			}
			System.out.println();

			nmr++;
		}

		System.out.println("____________SMARPHONES______________");
		nmr = 1;
		for (Smartphone smartphone : smartphones) {

			System.out.println("Smartphone " + nmr + ": \n");
			System.out.println(smartphone.getDimensoesTela());
			System.out.println(smartphone.getMarca());
			System.out.println();
			nmr++;
		}

	}

}
