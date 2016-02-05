//Sebastian Gonzalez - Metapack Assignment 05/02/2016
package Assingment;

public class Accumulator_imp implements Accumulator {

	private int totalSum;

	// Constructor
	public Accumulator_imp() {
		this.totalSum = 0;
	}

	public int accumulate(int... values) {

		int partialSum = 0;

		for (int value : values) {
			partialSum += value;
		}

		this.totalSum += partialSum;

		return partialSum;
	}

	public int getTotal() {
		return this.totalSum;
	}

	public void reset() {
		this.totalSum = 0;
	}

}
