class ShakespeareGA {
	//population of 100
	DNA[] population = new DNA[100];

	void setup() {
		//initialize each member of population
		for (int i = 0; i < population.length; i++) {
			population[i] = new DNA();
	  }
	}
}
