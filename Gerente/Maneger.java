
public class Maneger  extends  Employee {
     private String department;



public Maneger(String name, double salary, String department) {
	super(name, salary);
	this.department = department;
	
	
}	
	


// Método para  calcular o bonus de 20% do saário:
@Override
public double calculateBonus() {
	return this.salary * 0.20;
	
	

}
	
// Método para exibir dados do gerente:
@Override
public void showEmployeeData() {
	super.showEmployeeData();
	System.out.println("Departamento:" + department);
	
	
	
}
	
	
}







