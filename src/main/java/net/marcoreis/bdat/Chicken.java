package net.marcoreis.bdat;

import java.util.concurrent.Callable;

interface Bird {
	Egg lay();
}

class Chicken implements Bird {
	public Chicken() {
	}

	public static void main(String[] args) throws Exception {
		Chicken chicken = new Chicken();
		System.out.println(chicken instanceof Bird);
	}

	public Egg lay() {
		Callable<Bird> createBird = null;
		try {
			return new Egg(createBird);
		} catch (Exception e) {
			return null;
		}
	}
}

class Egg {
	int qtd = 0;

	public Egg(Callable<Bird> createBird) throws Exception {
		qtd++;
		createBird.call();
	}

	public Bird hatch() throws Exception {
		if (qtd > 1) {
			throw new IllegalStateException();
		}
		return new Chicken();
	}
}