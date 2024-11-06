import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class GPAList
{
    private final String FILENAME;
    private Scanner myFile;
    private double[] gpaList;
    
    public GPAList(String fileName)
    {
        FILENAME = fileName;
        gpaList = readGpas();
    }
    /* This method reads gpas in from a file specified in the constructor and store in 
     * instance variable FILENAME.  It returns an array of double populated with the gpas.
     */
    public double[] readGpas()
    {
        try{
            myFile= new Scanner(new File(FILENAME));
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Sorry, could not find the gpa file.");
            return null;
        }
        //Read the first item from the file.  This should be the number of gpas in the file.
        String firstLine = myFile.nextLine();
        
        //Convert that line (a String) to an int using the static parseInt method
        // in the Integer utility class
        int numberOfGpas = Integer.parseInt(firstLine);
        
        //create an array for the gpas
        gpaList = new double[numberOfGpas];
        //Keep looping while you can still read lines from the file
        //and put each gpa in the list
        int position = 0;
        while (myFile.hasNextLine())
        {
            //Get the next line from the file
            String line = myFile.nextLine();
            //Convert that line to a double using the static method
            //parseDouble which is part of the Double utility class.
            double gpa = Double.parseDouble(line);
            //add the gpa to an array of gpas.
            gpaList[position] = gpa;
            position++;
        }  
        return gpaList;
    }
    
    //This could also go in a Runner class.
    public static void main(String args[])
    {
        GPAList gpaList = new GPAList("gpa.dat");
        
        // As you write the appropriate methods, you can un-comment out these lines of code
        double averageGpa = 0;//gpaList.average();
        double percentHHonors = 0;//gpaList.highHonors();
        double percentHonors = 0;//gpaList.honors();
        double minGpa = 0;//gpaList.min();
        double maxGpa = 0;//gpaList.max();
    
		System.out.println("The total number of grades is " + gpaList.size());
        System.out.println("The average gpa is:" + averageGpa);
	
        System.out.println(percentHHonors * 100 + "  of the students are high honors.");
        System.out.println(percentHonors * 100 + " percent of the students are honors.");
        System.out.println("The maximum gpa is: " + maxGpa);
        System.out.println("The minimum gpa is: " + minGpa);
        System.out.println("Here is the entire list of gpas: \n" + gpaList);
		System.out.println("The number of grades above 3.0 is " + gpaList.numOfGradesInRange(3.0));
		System.out.println("The number of grades between 2.0 and 3.0 is " + gpaList.numOfGradesInRange(2.0, 3.0));
		
		System.out.println("The grades above 3.0 are " + gpaList.gradesInRange(3.0));
    }
	
	//Returns number of grades in array
	public int size()
	{
		return 0;
	}
    /*
     * This method returns the average of all of the gpas stored in the gpaList
	 be sure to use the size method you wrote above
     */
    public double average()
	{
        return 0;
    }
	
	/* 
	*This method returns number of grades including low, and going up to but not including high.
	*/
	public int numOfGradesInRange(double low, double high)
	{
		return 0;
	}
	
	/* 
	*This method returns number of grades >= low.
	*/
	public int numOfGradesInRange(double low)
	{
		
		return 0;
	}
	
	/* 
	*This method returns a new GPAList object containing the grades from [low, high) including low, and going up to but not including high.
	*/
	public GPAList gradesInRange(double low, double high)
	{
		return null;
	}
	
	/*
	* This method  returns a new GPAList object containing the grades that are >= low
	*/
	public GPAList gradesInRange(double low)
	{
		return null;
	}
    public double highHonors()
	{
        return 0;
    }
    public double honors()
	{
        return 0;
    }
    public double max()
	{
        return 0;
        
    }
    public double min()
	{
        return 0;
    }
	
	
    /*
     * This method overrides the default toString() method for all Objects
     * to display all of the gpa's in the gpaList, one gpa per line of output.
     */
    public String toString()
	{
        String s = "";
        
		
        return s;
    }
}