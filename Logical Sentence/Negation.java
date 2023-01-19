public class Negation implements LogicalSentence{
	private LogicalSentence arg;
	public Negation (LogicalSentence a){

	}
	public boolean isUnsatisfiable(){
		return arg.isValid();
	}
	public boolean isValid(){
		return arg.isUnsatisfiable();
	}
}