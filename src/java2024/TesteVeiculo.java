package java2024;

public class TesteVeiculo {
	public static void main(String[] args) {
		Carro carro = new Carro("Toyota", "Corrola", 2004, 4);
		Carro carro2 = new Carro("Bmw", "Corrola", 2004, 2);
		Moto moto = new Moto("Honda", "CB500", 2019, true);
		Moto moto2 = new Moto("Hiamaha", "CB500", 2019, true);

		System.out.println("Detalhes do Carro");
		carro.exibirDetalhes();

		System.out.println("\nDetalhes da Moto:");
		moto.exibirDetalhes();

		System.out.println("Detalhes do Carro 2:");
		carro2.exibirDetalhes();

		System.out.println("\nDetalhes da Moto:");
		moto2.exibirDetalhes();

	}

}
