package Polimor;

public class BichoPregui�a extends Animal{
	public void Sobir() {
		System.out.println("Bicho pregui�a sobi na �rvore!");
		
		
	}
	
	public static void main(String[] args) {
		BichoPregui�a pregui�a = new BichoPregui�a();
		pregui�a .setNome("Nana");
		pregui�a .setIdade(6);
		pregui�a .setSom("a a a a a a");
		
		System.out.println("Nome: "+pregui�a.getNome());
		System.out.println("Idade: "+pregui�a.getIdade()+ " anos ");
		System.out.println("Som: "+pregui�a.getSom());
		pregui�a.Sobir();
	}
}
