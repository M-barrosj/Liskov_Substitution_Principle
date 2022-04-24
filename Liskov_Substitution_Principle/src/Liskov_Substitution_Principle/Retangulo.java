package Liskov_Substitution_Principle;

public class Retangulo {
	protected int m_largura;
	protected int m_altura;
	
	public void setLargura(int largura) {
		m_largura = largura;
	}
	
	public int getLargura() {
		return m_largura;
	}
	
	public void setAltura(int altura) {
		m_altura = altura;
	}
	
	public int getAltura() {
		return m_altura;
	}
	
	public int getArea() {
		return m_largura * m_altura;
	}
	

}
