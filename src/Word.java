
public class Word {

	private String w;
	public Word() {
		ConnectXML con = new ConnectXML();
		w = con.generateWord();
	}
	public String generateLetters() {
		if (w.length()<12) {
			return "ch_r____r";
		}
		return "";
	}
}
