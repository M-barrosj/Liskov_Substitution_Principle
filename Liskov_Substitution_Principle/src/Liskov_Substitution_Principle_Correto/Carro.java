package Liskov_Substitution_Principle_Correto;

public class Carro extends Veiculo{

	@Override
	public void LigarMotor() {
		InjetarGasolina();
		
	}

	public void InjetarGasolina() {
			
	}

	@Override
	public void Acelerar() {
		
		
	}
	

}
