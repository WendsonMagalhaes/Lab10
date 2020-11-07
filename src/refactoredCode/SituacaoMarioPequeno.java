package refactoredCode;


public class SituacaoMarioPequeno extends SituacaoMario {

	public void pegarCogumelo(Mario mario) {
		mario.setSituacao(new SituacaoMarioGrande());
	}

	public void levarDano(Mario mario) throws Exception {
		throw new Exception("Mario morreu.");
	}

	public void pegarFlor(Mario mario) {
		mario.setSituacao(new SituacaoMarioFogo());
	}

}
