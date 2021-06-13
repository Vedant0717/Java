package solution;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class UserInterface {

public static void mainMenu() throws IOException 
{
	System.out.println("1.List the files\n");
	System.out.println("2.File operation\n");
	System.out.println("3.Exit\n");


Scanner sc = new Scanner(System.in);
int opt = sc.nextInt();

switch(opt)
{
case 1: listfilesAsc(); break;
case 2: menu2(); break;

case 3: break;
default: System.out.println("Enter valid option"); 
mainMenu(); 
break;//default option 
}
}
public static void listfilesAsc() throws IOException//sorts fies in ascending order
{
	File file=new File("C:\\Users\\vedant\\eclipse-workspace\\JavaProject");
	String[] files=file.list();
	for(String string : files)
	{
		System.out.println(string);
	}
	System.out.println("\n");

	mainMenu();

}

public static void menu2() throws IOException
{

System.out.println("1. Add a file\n");
System.out.println("2.Delete a file\n");
System.out.println("3. Search a file\n");
System.out.println("4.Main Menu\n");

Scanner sc = new Scanner(System.in); int opt = sc.nextInt();

switch(opt)
{
case 1: FileOperations.addFile();menu2(); break;

case 2: FileOperations.deleteFile();menu2(); break;

case 3: FileOperations.searchFile();menu2(); break;

case 4: mainMenu(); break;

default: System.out.println("Enter valid option"); menu2(); break;
}
}
}