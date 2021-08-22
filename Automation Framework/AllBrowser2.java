
public class AllBrowser {
	public static void main(String[] args) {
		InternetExplorer ie = new InternetExplorer();
		Firefox ff = new Firefox();
		Chrome ch = new Chrome();
		ie.launch();
		ff.launch();
		ch.launch();
	}

}
