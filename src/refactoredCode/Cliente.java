package refactoredCode;

public class Cliente {
	// Como havia mudanca de comportamento por conta do estado que se encontrava o
	// Mario e muitos "ifs" no codigo para checar o estado e definir o
	// comportamento, optei pelo padrão State que permite a mudança de estado de um
	// objeto dinamicamente.
	public static void main(String[] args) {
		Mario mario = new Mario();
		try {
			mario.pegarCogumelo();
			mario.levarDano();
			mario.pegarFlor();
			mario.pegarFlor();
			mario.levarDano();
			mario.levarDano();
			mario.levarDano();
			mario.levarDano();
			mario.levarDano();
		} catch (Exception e) {
			System.out.println("Acabou o jogo");
		}
	}

}
