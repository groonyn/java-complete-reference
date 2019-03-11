// Here, Box allows one object to initialize another

class Box{
	double width;
	double height;
	double depth;

	//Notice this constructor. It takes an object of type Box.
	Box(Box ob){ //pass object to constructor
		width =ob.width;
		height = ob.height;
		depth = ob.depth;
	}

	//constructor used when all deminsions specified
	Box(double w, double h, double d){
		width = w;
		height = h;
		depth = d;
	}

	// constructor used when no dimensions specified
	Box(){
		width = -1;
		height = - 1;
		depth = -1;
	}

	//constructor used when cube is created
	Box(double len){
		width = height = depth = len;
	}

	//compute and return volume
	double volume(){
		return width * height * depth;
	}
}

class OverloadCons2{
	public static void main(String args[]){
		//create boxes using the vairous constructors
		Box mybox1 = new Box(10,20,15);
		Box mybox2 = new Box();
		Box mybox3 = new Box(7);

		Box myclone = new Box(mybox1); // create copy of mybox1

		double vol;
		 // get volume of first box
		vol = mybox1.volume();
		System.out.println("Volume of mybox1 is "+vol);
	

		 // get volume of first box
		vol = mybox2.volume();
		System.out.println("Volume of mybox2 is "+vol);


		 // get volume of first box
		vol = mybox3.volume();
		System.out.println("Volume of mybox3 is "+vol);


		 // get volume of first box
		vol = myclone.volume();
		System.out.println("Volume of myclone is "+vol);
	}
}