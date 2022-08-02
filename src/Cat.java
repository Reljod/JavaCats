import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.awt.FlowLayout;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Cat {

	private final static String CAT_URL = "https://cataas.com/cat/says/";

	private String[] randomTexts = { "Hello", "Hi", "Sup bro", "Sheesh", "Yo wazzup", "Carps carps?" };

	public String wordOfTheDay;

	public Cat() {
		this.wordOfTheDay = getRandomText();
	}

	private String getRandomText() {
		return randomTexts[(int) Math.floor(Math.random() * randomTexts.length)];
	}

	public String getCatOfTheDay() throws MalformedURLException {
		URL url = new URL(CAT_URL + this.wordOfTheDay);
		try {
			var c = ImageIO.read(url);
			ImageIcon image = new ImageIcon(c);
			JFrame frame = new JFrame();
			frame.setLayout(new FlowLayout());
			frame.setSize(800, 800);

			JLabel lbl = new JLabel();
			lbl.setIcon(image);
			frame.add(lbl);
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		} catch (IOException e) {
			e.printStackTrace();
		}

		return "Meowth" + " " + this.getRandomText();
	}
}
