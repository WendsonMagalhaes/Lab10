package refactoredCode;

public class SituacaoMarioFogo extends SituacaoMario{
	
	public void pegarCogumelo(Mario mario) {
		mario.setPontucao();
	}
	public void levarDano(Mario mario) throws Exception{
		mario.setSituacao(new SituacaoMarioGrande());
	}
	public void pegarFlor(Mario mario) {
		mario.setPontucao();
	}

}
