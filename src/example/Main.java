package example;

import processing.core.PApplet;

/**
 * Thanks to our hero Abe Pazos at https://vimeo.com/channels/p5idea, who
 * teaches us how to use Processing inside IDEA
 */
public class Main extends PApplet {
	public static void main(String[] args) {
		PApplet.main(new String[]{Main.class.getName()});
	}

	@Override
	public void settings() {
		size(700, 600);
	}

	@Override
	public void setup() {
		rectMode(RADIUS);
		colorMode(HSB, 360f, 100f, 100f, 100f);

		for (int i=0; i<8; i++) {
			System.out.printf("    RAM8(in=in, address=address[3..5], " +
							"load=, "+
							"out=out%d);%n",
					i);
		}
	}

	@Override
	public void draw() {
		background(210, 100, 30, 100);
		rect(mouseX, mouseY, 20, 20);
	}

	@Override
	public void mousePressed() {
		System.out.println(mouseX);
	}
}