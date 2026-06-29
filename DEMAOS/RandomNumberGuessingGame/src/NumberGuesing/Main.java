package NumberGuesing;
import java.io.*;
public class Main {
	
	public static void main(String args[]) throws IOException
	{
	
//		File file2 = new File ("Secret_Message.txt");
//		File file = new File("C:\\Users\\Tushar Kumar\\Desktop\\Complete Operating System in one shot _ Semester Exam _ Hindi(1080P_HD).mp4");
//		if(file.exists())
//			System.out.println("The File Exist :o)");
//		else 
//			System.out.println("The File Doesn't Exist :(");
//		
//		System.out.println(file.getPath());
//		System.out.println(file2.getPath());
//		System.out.println(file.getAbsolutePath());
//		System.out.println(file2.getAbsolutePath());
		
//		System.out.println(file2.isFile());

//		file2.delete();
		
		
		InputStream inputStream = System.in;
		Reader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		String name = bufferedReader.readLine();
		String sAge =  bufferedReader.readLine();
		  
		int nNum = Integer.parseInt(sAge);
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String names = reader.readLine();
		String sAges = reader.readLine();
		int nAge = Integer.parseInt(sAge);
		
		
		String filename = "New Secret.txt";
		
		
//		try(BufferedReader reader  = new BufferedReader(new FileReader(filename))) {
		try {
			
			String line;
			
			while ((line = reader.readLine()) != null)
			{
				System.out.println(line);
			}
			
			File newFile = new File("New Secret.txt");
			if(newFile.createNewFile()) {
				System.out.println("file Created");
			}
			else
			{
				System.out.println("\nFile Already Exist.");
			}
			
			System.out.println(newFile.getAbsolutePath());
			
			FileWriter writer = new FileWriter("New Secret.txt");
			writer.write("Machali jal ki rani hai \njiwan uska pani hai");
			writer.append("Hath lagao ge to dar Jayegi \nBahar Nikalo ge to mar jayegi\n");
			writer.append("\t\t(A poem by TUSHAR KUMAR)");
			writer.close();
		}catch(IOException e)
		{
			e.printStackTrace();			
		}
		
		
	}
	
	
	
}

