package Polimor;

public class Cavalo extends Animal{
	public void correr() {
		System.out.println("Cavalo corre!");
		
		
	}
	
	public static void main(String[] args) {
		Cavalo house = new Cavalo();
		house.setNome("Luffy");
		house.setIdade(10);
		house.setSom("hinn in in...");
		
		System.out.println("Nome: "+house.getNome());
		System.out.println("Idade: "+house.getIdade()+ " anos ");
		System.out.println("Som: "+house.getSom());
		house.correr();
	}
}
