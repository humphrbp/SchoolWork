
public class Weights {


	public static void main(String args[]){  
		
		//Get Average of first set of numbers
		double score_a[]=new double[] {75,95,85,55,65,70}; 
		double weight_a[] = new double[] {.10,.20,.25,.25,.10,.10};
		double average1 = 0;
		for(int i=0;i<score_a.length;i++)
		average1 = average1 + score_a[i] * weight_a[i];
	    
		
		//Get Average of second set of numbers
		double score_b[]=new double[] {55,65,65,60,55,50}; 
		double weight_b[] = new double[] {.05,.10,.15,.25,.25,.20};
		double average2 = 0;
		for(int i=0;i<score_b.length;i++)
		average2 = average2 + score_b[i] * weight_b[i];
		
		//Print Output
		System.out.println("The weighted average of the test scores is " + average1+"!"); 
		System.out.println("The weighted average of the assignment scores is " +average2+"!"); 
		System.out.println("The master average of the assignments and tests scores is " +(average1+average2)/2+"!");
		System.out.println("This is not a passing score...please try again");
		
	}

}
