//This program uses inheritance to extend Box

class Box{
	double width;
	double height;
	double depth;

	//construct clone of an object
	Box(Box ob){//pass object to constructor
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}

	//constructor used when all dimensions are specified
	Box(double w, double h, double d){
		width = w;
		height = h;
		depth = d;
	}

	//constructor used when no dimensions are specified
	Box(){
		width = -1;
		height = -1;
		depth = -1;
	}

	//constructor used when the box is cube
	Box(double len){
		width = height = depth = len;
	}

	//compute the volume of the box
	double volume(){
		return width * height * depth;
	}
}

//Here, Box is extended to include weight;
class BoxWeight extends Box{
	double weight;//weight of box

	//constructor for BoxWeight
	BoxWeight(double w, double h, double d, double m){
		width = w;
		height = h;
		depth = d;
		weight = m;
	}
}

class DemoBoxWeight{
	public static void main(String args[]){
		BoxWeight mybox1 = new BoxWeight(10,20,15,34.3);
		BoxWeight mybox2 = new BoxWeight(2,3,4,0.074);
		double vol;
		vol = mybox1.volume();
		System.out.println("Volume of mybox1 "+vol);
		System.out.println("Weight of mybox1 "+mybox1.weight);
		System.out.println();

		vol = mybox2.volume();
		System.out.println("Volume of mybox2 "+vol);
		System.out.println("Weight of mybox2 "+mybox2.weight);
	}
}