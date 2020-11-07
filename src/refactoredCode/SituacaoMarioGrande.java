package refactoredCode;

public class SituacaoMarioGrande extends SituacaoMario{
	
	public void pegarCogumelo(Mario mario) {
		mario.setPontucao();
	}
	public void levarDano(Mario mario) throws Exception{
		mario.setSituacao(new SituacaoMarioPequeno());
	}
	public void pegarFlor(Mario mario) {
		mario.setSituacao(new SituacaoMarioFogo());
	}

}
