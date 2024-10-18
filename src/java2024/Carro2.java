package java2024;

public class Carro2 implements Veiculo1 {

	// Construtor sem parametros(necessario para a linha ' new

	public Carro2() {
		// se houver lógica de inicialização, insira-a aqui!

	}

	@Override
	public void acelerar() {
		System.out.println("O  carro está acelerando ...");
	}

	@Override
	public void frear() {
		System.out.println("O carro está freando...");
	}

	public void acabando() {
		System.out.println("O combustivel está acabando...");
	}

	@Override
	public void combustivel() {

	}

	@Override
	public void pneu() {

	}

}
