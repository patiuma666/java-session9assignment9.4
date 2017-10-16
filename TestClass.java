package mypack;

public class TestClass {
	//created another class as TestClass
	
	public static void main(String[] args) {
		// here creating the object for FixedStack
        FixedStack fs = new FixedStack(3);
        fs.push(1);
        fs.push(2);
        fs.push(3);
        //ERROR
        fs.push(0);
        //here creating the object for VariableStack
        VariableStack vs = new VariableStack(3);
        vs.push(1);
        vs.push(6);
        vs.push(4);
        vs.push(0);
        vs.push(9);
        //no error
    }

}
