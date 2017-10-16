package mypack;

public class FixedStack implements Stack {
	
	//* Created a class named as FixedStack it implements the interface Stack
	 final int array[]; //declaring final keyword where we cannot implement or override the variables or methods or parameters
	 final int size;//creating an array
	 int top;
	 //taken  the top of the stack
	//where as Both  the insertion and deletion are allowed  only one end of Stack is known as Top
	 
	public  FixedStack (int size){
		//this.size refers the current object
		 this.size=size;
		 //here   array will create the new size
		 array=new int[size];
		 top = -1;
	 }

	/**
	 * These are the two methods from the interface Stack
	 */
	
	
	@Override
	public void push(int i) {
		// TODO Auto-generated method stub
		  if (top == size - 1) {
	            System.out.println("Stack overflow while pushing " + i + " in fixed stack");
	            //throw new UnsupportedOperationException();
	            return;
	        }
	        array[++top] = i;
	    }	
	

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		if (top < 0) {
            System.out.println("Stack underflow");
            //throw new UnsupportedOperationException();
            return -999;
        }
	//	one preceding the starting value is 0 which returns in -1
        return array[top --];
    }

}
