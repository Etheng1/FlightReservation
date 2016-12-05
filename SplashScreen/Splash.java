package SplashScreen;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.SplashScreen;
import java.awt.geom.Rectangle2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Splash extends JFrame {

	public static SplashScreen loadingScreen;
	public static java.awt.geom.Rectangle2D.Double loadingTextArea;
	public static java.awt.geom.Rectangle2D.Double loadingProgressArea;
	public static Graphics2D loadingGraphics;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		loadingMethod();
		mainMethod();
		if (loadingScreen != null) {
			loadingScreen.close();
		}

	}

	public static void loadingMethod() {
		loadingScreen = SplashScreen.getSplashScreen();
		if (loadingScreen != null) {
			Dimension dim = loadingScreen.getSize();
			int ht = dim.height;
			int wd = dim.width;

			loadingTextArea = new Rectangle2D.Double(15, ht * 0.7, wd * 0.4, 30);
			loadingProgressArea = new Rectangle2D.Double(15, ht * 0.85, wd * 0.4, 25);

			loadingGraphics = loadingScreen.createGraphics();

		}
	}

	public static void loadingText(String string) {
		if (loadingScreen != null) {
			loadingGraphics.setPaint(Color.BLACK);
			loadingGraphics.fill(loadingTextArea);

			loadingGraphics.setPaint(Color.CYAN);
			loadingGraphics.drawString(string, (int) loadingTextArea.getX() + 10, (int) loadingTextArea.getY() + 20);

			loadingScreen.update();
		}
	}

	public static void loadingProgress(int prog) {
		if (loadingScreen != null) {
			loadingGraphics.setPaint(Color.LIGHT_GRAY);
			loadingGraphics.fill(loadingProgressArea);

			loadingGraphics.setPaint(Color.blue);
			loadingGraphics.draw(loadingProgressArea);

			int x = (int) loadingProgressArea.getMinX();
			int y = (int) loadingProgressArea.getMinY();

			int width = (int) loadingProgressArea.getWidth();
			int height = (int) loadingProgressArea.getHeight();

			int doneProg = prog * width / 100;

			loadingGraphics.setPaint(Color.BLUE);
			loadingGraphics.fillRect(x, y, doneProg, height);

			loadingScreen.update();
		}
	}

	public static void mainMethod() {
		for (int i = 1; i <= 10; i++) {
			loadingText("Loading Resources " + i);
			loadingProgress(i * 10);

			try {
				URL url = new URL("https://sites.google.com/site/rohanthepcwizard/games");

				BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

				String str;
				while ((str = in.readLine()) != null) {
					System.out.println(str);
				}
				in.close();

			} catch (MalformedURLException e) {

			} catch (IOException e) {
			}

		}
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Welcome().setVisible(true);
			}
		});
	}
}
