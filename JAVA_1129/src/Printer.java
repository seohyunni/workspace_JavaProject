
public class Printer {
	public static int USB=0;
	public static int PARALLEL=1;
	private String modelName;
	private String manufacture;
	private int type;
	protected int numberOfPrinted;
	protected int numberOfPaper;
	abstract public boolean print();
	
	public Printer(String modelName, String manufacture, int type, int numberOfPrinted, int numberOfPaper) {
		this.modelName=modelName;
		this.manufacture=manufacture;
		this.type=type;
		this.numberOfPrinted=numberOfPrinted;
		this.numberOfPaper=0;
		
	}
}
