package pt1;

public abstract class PaperDecorator implements Paper {
	protected Paper decoratedPaper;
	public PaperDecorator (Paper decoratedPaper) {
		this.decoratedPaper = decoratedPaper;
	}
	public void create() {
		decoratedPaper.create();
	}
}
