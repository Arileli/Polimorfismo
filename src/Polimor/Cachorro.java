package Polimor;

	public class Cachorro extends Animal{

	public void correr() {
		System.out.println("Cachorro corre!");
		
		
	}
	public static void main(String[] args) {
		Cachorro dog = new Cachorro();
		dog.setNome("Thor");
		dog.setIdade(5);
		dog.setSom("AuAuAUAu...");
		
		System.out.println("Nome: "+dog.getNome());
		System.out.println("Idade: "+dog.getIdade()+ " anos ");
		System.out.println("Som: "+dog.getSom());
		dog.correr();
		
		Animal pi = new Animal("Odin", 10 , "Au");
		System.out.println("Nome: "+pi.getNome());
		System.out.println("Idade: "+pi.getIdade()+" anos");
		System.out.println("Som: "+pi.getSom());
	}

}
