package refactoredCode;

public class Mario {
	public SituacaoMario situacao;
	public long pontuacao = 0;
	
	public Mario() {
		this.pontuacao = 0;
		this.situacao = new SituacaoMarioPequeno();
	}

	public void pegarCogumelo() {
		situacao.pegarCogumelo(this);
	}

	public void levarDano() throws Exception {
		situacao.levarDano(this);
	}

	public void pegarFlor() {
		situacao.pegarFlor(this);
	}

	public void setSituacao(SituacaoMario situacao) {
		this.situacao = situacao;
	}

	public void setPontucao() {
		this.pontuacao += 1000;

	}

}
