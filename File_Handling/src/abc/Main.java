package abc;
import java.util.*;
import java.io.*;
public class Main {
	public static void main(String args[]) throws IOException
	{
		
			File obj = new File("C:\\Users\\Pccoe\\eclipse-workspace\\TYITB95\\myfile.txt");
			obj.createNewFile();
			FileWriter fwrite = new FileWriter("C:\\Users\\Pccoe\\eclipse-workspace\\TYITB95\\myfile.txt");  
			
			String s;
			Scanner sc=new Scanner(System.in);
			int m1,m2,m3;
			fwrite.write("Name\tM1\tM2\tM3\n");
			for(int i=0;i<5;i++)
			{
				System.out.println("Enter the name:");
				s=sc.next();
				System.out.println("Enter marks of first subject");
				m1=sc.nextInt();
				System.out.println("Enter marks of second subject");
				m2=sc.nextInt();
				System.out.println("Enter marks of third subject");
				m3=sc.nextInt();
				fwrite.write(s+"\t"+m1+"\t"+m2+"\t"+m3+"\n");
			}
			FileReader fr=new FileReader(obj);   
			BufferedReader br=new BufferedReader(fr);  
			String arr[]=new String[5];
			 String line;
			 int i=0;
			while((line=br.readLine())!=null)
			{
				System.out.println(line);
				arr[i]=line;
				i++;
			}
//			for(int j=0;j<5;j++)
//			{
//				System.out.println(arr[j]+"\n");
//			}
//			System.out.println("File Created");
			fwrite.close();
		}
		
			
		
	}


