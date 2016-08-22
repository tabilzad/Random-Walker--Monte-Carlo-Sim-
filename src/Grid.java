import java.util.ArrayList;
import java.util.Random;

public class Grid {

	public static int trap = 4;
	public static int Grid_size = 9;
	public static int Iterations = 10000000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList();

		for (int i = 1; i <= Iterations; i++) {
			int x = trap, y = trap;
			while (x == trap && y == trap) {
				x = randomize();
				y = randomize();
			}

			Particle p = new Particle(x, y);

			while (!p.equals(trap, trap)) {

				p.step();
				p.modulo(Grid_size);

			}

			list.add(p.index());

		}
		// System.out.println(list);
		System.out.println(mean(list));

	}

	public static double mean(ArrayList list) {
		double sum = 0;
		int size = list.size();
		for (int i = 0; i < size; i++) {

			sum += (int) list.get(i);

		}

		return (sum / size);
	}

	public static int randomize() {
		Random ran = new Random();
		int Low = 0;
		int High = Grid_size - 1;
		int p = ran.nextInt(High - Low + 1) + Low;
		return p;
	}

}
