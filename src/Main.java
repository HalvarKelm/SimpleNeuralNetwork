
/**
 * 
 * @author Halvar Kelm
 *
 * @author 1.0
 * 
 * Creates a simple neural network. Gives training data. Trains the network.
 * Asks user for input 
 */
public class Main {

	public static void main(String[] args) {
		NeuralNetwork NN = new NeuralNetwork();
		int test1 = 1;
		int test2 = 0;
		System.out.println("I got "+NN.test(test1,test2)+" as an result.");
	}
}
