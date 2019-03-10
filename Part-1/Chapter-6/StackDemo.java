// This class defines an integer stack that can hold 10 values

class Stack{
	int stck[] = new int[10];
	int tos;

	//Initialize top-of-stack
	Stack(){
		tos = -1;
	}

	//Push an item onto the stack
	void push(int item){
		if(tos==9){
			System.out.println("Stack is full.");
		}else{
			stck[++tos]=item;
		}
	}

	//Pop an item from the stack
	int pop(){
		if(tos<0){
			System.out.println("Stack underflow.");
			return 0;
		}else{
			return stck[tos--];
		}
	}

	//Show existing item in the stack
	void show(){
		for(int i = 0;i<=tos;i++){
			System.out.print(stck[i] + " ");
		}
	}
}

class StackDemo{
	public static void main(String args[]){
		Stack stk1 = new Stack();
		//push item and show item
		for(int i = 0;i<=10;i++){
			stk1.push(i);
			
		}

		stk1.show();
		System.out.println();

		
		//pop item and show item
		for(int i = 0;i<=10;i++){
			stk1.pop();
			
		}
		stk1.show();




	}
}