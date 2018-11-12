
public class NeuralNetwork {
	private int Layers = 3;

	private int weight1;
	private int weight2;
	private int weight3;
	private int weight4;
	private int weight5;
	private int weight6;
	private int weight7;
	private int weight8;
	private int weight9;
	private int bias = 1;

	public NeuralNetwork() {
		/*weight1 = (int) (Math.random() * 10);
		weight2 = (int) (Math.random() * 10);
		weight3 = (int) (Math.random() * 10);
		weight4 = (int) (Math.random() * 10);
		weight5 = (int) (Math.random() * 10);
		weight6 = (int) (Math.random() * 10);
		weight7 = (int) (Math.random() * 10);
		weight8 = (int) (Math.random() * 10);
		weight9 = (int) (Math.random() * 10);*/
		weight7 = 10;
		weight8 = 10;
		weight9 = -5;
		weight4 = 5;
		weight5 = -6;
		weight6 = -3;
		weight1 = -6;
		weight2 = 6;
		weight3 = -3;
		System.out.println("weight1 = " + weight1);
		System.out.println("weight2 = " + weight2);
		System.out.println("weight3 = " + weight3);
		System.out.println("weight4 = " + weight4);
		System.out.println("weight5 = " + weight5);
		System.out.println("weight6 = " + weight6);
		System.out.println("weight7 = " + weight7);
		System.out.println("weight8 = " + weight8);
		System.out.println("weight8 = " + weight9);
	}

	public double test(int a, int b) {
		// Input layer
		double I1 = a;
		double I2 = b;
		System.out.println("I1 = " + I1 + "\nI2 = " + I2);
		// hidden layer
		double H1 = (1.0 / (1.0 + Math.exp(-1 *((I1 * weight1) + (I2 * weight2) + (weight3 * bias)))) );
		System.out.println("H1 is (1.0 / (1.0 + Math.exp(-1 * ("+I1+" * "+weight1+") + ("+I2+" * "+weight2+") + ("+bias+" * "+weight3+")))");
		System.out.println("(1.0 / (1.0 + Math.exp("+(-1 *((I1 * weight1) + (I2 * weight2) + (weight3 * bias)))+"))");
		System.out.println("(1.0 / (1.0 + "+Math.exp(-1 *((I1 * weight1) + (I2 * weight2) + (weight3 * bias)))+"))");
		System.out.println("(1.0 / "+(1.0 + Math.exp(-1 *((I1 * weight1) + (I2 * weight2) + (weight3 * bias))))+")");
		System.out.println(1.0 /(1.0 + Math.exp(-1 *((I1 * weight1) + (I2 * weight2) + (weight3 * bias)))));
		double H2 = (1.0 / (1.0 + Math.exp(-1 *((I1 * weight4) + (I2 * weight5) + (weight6 * bias))) ));
		System.out.println("H2 is (1.0 / (1.0 + Math.exp(-1 * ("+I1+" * "+weight4+") + ("+I2+" * "+weight5+") + ("+bias+" * "+weight6+")))");
		System.out.println("(1.0 / (1.0 + Math.exp("+(-1 *((I1 * weight4) + (I2 * weight5) + (weight6 * bias)))+"))");
		System.out.println("(1.0 / (1.0 + "+Math.exp(-1 *((I1 * weight4) + (I2 * weight5) + (weight6 * bias)))+"))");
		System.out.println("(1.0 / "+(1.0 + Math.exp(-1 *((I1 * weight4) + (I2 * weight5) + (weight6 * bias))))+")");
		System.out.println(1.0 /(1.0 + Math.exp(-1 *((I1 * weight4) + (I2 * weight5) + (weight6 * bias)))));
		System.out.println("H1 = " + H1 + "\nH2 = " + H2);
		// output layer
		double O1 = (1.0 / (1.0 + Math.exp(-1 *((H1 * weight7) + (H2 * weight8) + (weight9 * bias)))));
		System.out.println("O1 = " + O1);
		return O1;
	}
}
