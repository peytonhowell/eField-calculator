import java.util.*;
class eField{
	public static void main(String[] args){
		boolean doIt = true;
		while(doIt == true){
			//get information
			System.out.println("Enter x, then y, then z components of the r vector");
			Scanner n = new Scanner(System.in);
			double x = n.nextDouble();
			double y = n.nextDouble();
			double z = n.nextDouble();
			System.out.println("Enter the charge: ");
			double charge = n.nextDouble();
			//Calculations
			double magnitude = Math.sqrt((Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2)));
			double k = 9*Math.pow(10,9);			
			double xNorm = x/magnitude;
			double yNorm = y/magnitude;
			double zNorm = z/magnitude;
			double xField= k*charge*xNorm/(Math.pow(magnitude,2));
			double yField= k*charge*yNorm/(Math.pow(magnitude,2));
			double zField= k*charge*zNorm/(Math.pow(magnitude,2));
			//OutPut
			System.out.println("<"+xField+","+yField+","+zField+">\n Would you like to continue? (1=yes, 0=no)");
			int input = n.nextInt();
			if(input==0){doIt=false;}
			else{}
		}

	}
}