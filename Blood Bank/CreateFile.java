import java.io.*;

class CreateFile
{
    public static void main(final String[] array) throws IOException 
	{
        final String s = "File Handling in Java using  FileWriter and FileReader";
    
    final FileWriter fileWriter = new FileWriter("output.txt");

	for (int i = 0; i < s.length(); ++i) 
		{
            fileWriter.write(s.charAt(i));
        }
        System.out.println("Writing successful");
        fileWriter.close();
    }
}