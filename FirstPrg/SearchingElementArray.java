package arrayprograms;

public class SearchingElementArray {

	public static void main(String[] args) {
		
		int a[] = {10,20,30,40};
		int search_element = 20 ;
		boolean status=false ;
		for ( int x:a)
		{
			if(x==search_element)
			{
				System.out.println("Element Found");
				status = true ;
				
				
			}
			
		}
		if(status==false)
		{
			System.out.println("not found");
		}
		

	}

}
