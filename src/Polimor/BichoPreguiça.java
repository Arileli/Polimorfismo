package Polimor;

public class BichoPreguiça extends Animal{
	public void Sobir() {
		System.out.println("Bicho preguiça sobi na árvore!");
		
		
	}
	
	public static void main(String[] args) {
		BichoPreguiça preguiça = new BichoPreguiça();
		preguiça .setNome("Nana");
		preguiça .setIdade(6);
		preguiça .setSom("a a a a a a");
		
		System.out.println("Nome: "+preguiça.getNome());
		System.out.println("Idade: "+preguiça.getIdade()+ " anos ");
		System.out.println("Som: "+preguiça.getSom());
		preguiça.Sobir();
	}
}
