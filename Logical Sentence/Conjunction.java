public class Conjunction implements LogicalSentence{
	LogicalSentence s1, s2;
	public Conjunction (LogicalSentence arg1, LogicalSentence arg2){
		s1 = arg1;
		s2 = arg2;
	}

	public boolean isValid(){
		return (s1.isValid() && s2.isValid());
	}
	public boolean isUnsatisfiable(){
		return (s1.isUnsatisfiable() || s2.isUnsatisfiable());
	}
}
