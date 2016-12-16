//a project tutorial that
//I made from http://natureofcode.com/book/chapter-9-the-evolution-of-code/
//Adapted to Java

class ShakespeareGA {
	//population of 100
	DNA[] population = new DNA[100];

	void setup() {
		String target = "to be or not to be";

		//initialize each member of population
		for (int i = 0; i < population.length; i++) {
			population[i] = new DNA(target);
	  }
	}

	void draw() {
		for (int i = 0; i < population.length; i++) {
			population[i].fitness();
		}
	}
}
