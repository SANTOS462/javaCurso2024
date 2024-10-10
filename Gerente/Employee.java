
public class Employee {
	protected String name;
	protected double salary;

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	// Método para Calcular o bonus de 10% do salário:
	public double calculateBonus() {
		return this.salary * 0.10;
	}

	// Método para exibir os dados do empregado:
	public void showEmployeeData() {
		System.out.println("Nome" + name);
		System.out.println("Salario:" + salary);

			System.out.println("Nome" + name);
			System.out.println("Salario:" + salary);
			System.out.println("Salario: +  total + 300");
		 
	}

}
