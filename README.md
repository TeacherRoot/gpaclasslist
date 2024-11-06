Use the provided GPAList.java file.  Put the gpa.dat file into the same directory as your java code is located.

Modify the following main methods in the class:

- String toString()  -- Returns a string of all of the gpas, separated by a line break

- double average() -- Returns the average of all of the gpas.  Should work for other gpa files so don't assume 500 gpas

- int numOfGradesInRange(double low, double high) -- returns the number of grades in the GPAList that are from [low, high) including low, and going up to but not including high.

- int numOfGradesInRange(double low) -- returns the number of grades in the GPAList that are >= low

- GPAList gradesInRange(double low, double high) -- returns a new GPAList object containing the grades from [low, high) including low, and going up to but not including high.

- GPAList gradesInRange(double low) -- returns a new GPAList object containing the grades that are >= low

- size() -- returns the number of grades in the grade list

- max() -- returns the maximum gpa found in the GPAList

- min() -- returns the minimum gpa found in the GPAList

Test each of these methods by adding code to the static main method.  You might want to create your own test gpa data file (with many fewer entries than the provided gpa data file) so that you can test with known values.

Then, add to the main method, code that answers the following questions using the above methods to answer them.

1) What percentage of the students are high honors?  3.75 and above.  [3.75 ...) 

2) What percentage of the students are honors? [3.5, 3.75) including 3.5 and going up to but not including 3.75

3) What is the average high honors grade?

4) What is the average honors grade?



