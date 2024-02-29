
public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr2= {2,3,4,5,78,90,32,12,45,43,67};
	     for (int i=0;i<arr2.length;i++)
	     {
	    	 if (arr2[i]%2==0)
	    	 {
	    		 System.out.println(+arr2[i]+"is a multiple of 2");
	    		 break;
	    	 }
	    	 else {
	    		 System.out.println(arr2[i]+" is no a multiple of 2");
	    	 }
	     }
	}

}
