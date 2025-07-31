package arrayprograms;

public class FindHowManyDuplicateInArray {

	public static void main(String[] args) {
		int a[] = {100,200,300,100,200,100}; 
		int num =100 ;
		int count= 0;
		
        for(int value:a)
        {
        	if(value==num)
        	{
        		count++;
        	}
        }
        System.out.println("Count" +count);
	}

}
