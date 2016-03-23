import java.util.Scanner;

public class readfile 
{
	public Scanner x;
	
	public void openFile()
	{
		try
		{
			x = new Scanner(readfile.class.getResourceAsStream("XML.file"));			
		}
		catch (Exception e)
		{
			System.out.println("file not found");
		}
	}
	public void readFile()
	{
		String data;
		
        String run[];
          
        while (x.hasNextLine())
        { 
	
        	data = x.nextLine();

	    if(data.contains("<"))
        {					
			
	    	data = data.replaceAll("<","");
			
	    	data = data.replaceAll(">"," --> ");
		
	    run = data.split("/");
		
	    data = run[0];
        }
				
	    System.out.println(data);
        }  
	    
	}
	public void closeFile()
	{
		x.close();
	}
}
