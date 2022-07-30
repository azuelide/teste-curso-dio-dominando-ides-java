package sp.dio.me;

import sp.dio.me.model.Coruja;

public class MundoPrograma {

	public static void main(String[] args) {
		
		Coruja coruja = new Coruja ();
		Animais animais = new Animais ();
		
		System.out.println(coruja);
		System.out.println(animais);
		
		/*int a = 2;
		int b = 3;
		System.out.println("Hello World! " + (a+b));*/

	}

}
class Animais {
		private String especie;
		private String origem;
}