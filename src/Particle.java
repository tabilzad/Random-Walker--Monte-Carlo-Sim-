import java.util.Random;

public class Particle {

	public int x;
	public int y;
	public int steps = 0;

	Particle(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void show() {
		System.out.println("{" + x + "," + y + "}: STEP:" + steps);
	}

	public void modulo(int m) {

		x = Math.floorMod(x, m);
		y = Math.floorMod(y, m);

	}

	public int index() {
		return steps;

	}

	public boolean equals(int x, int y) {
		if (this.x == x && this.y == y) {
			return true;
		} else
			return false;

	}

	public void step() {
		Random ran = new Random();
		int Low = 1;
		int High = 100;
		int r = ran.nextInt(High - Low + 1) + Low;

		if (r <= 25)
			x--;
		else if (r <= 50)
			x++;
		else if (r <= 75)
			y--;
		else if (r <= 100)
			y++;

		steps++;
	}

}
