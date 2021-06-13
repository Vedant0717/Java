package solution;

import java.io.File;

import java.io.IOException;

import java.util.Scanner;

public class FileOperations
{

public static void addFile() throws IOException //Adds a file
{

System.out.println("Enter a file to be created\n"); 
Scanner sc = new Scanner(System.in);

String fileName = sc.nextLine(); 
File file = new File(fileName);

if(file.createNewFile()) System.out.println("File created\n");

else

System.out.println("File not created\n");
}

public static void deleteFile() throws IOException //Deletes a file
{

System.out.println("Enter a file to be deleted\n"); 
Scanner sc = new Scanner(System.in);

String fileName = sc.nextLine(); 
File file = new File(fileName);

if(file.delete())
	System.out.println("File deleted\n");

else

System.out.println("File not deleted\n");
}

public static void searchFile() throws IOException //Searches a file
{


System.out.println("Enter a file to be searched\n");
Scanner sc = new Scanner(System.in);

String fileName = sc.nextLine(); 
File file = new File(fileName);

if(file.exists())
	System.out.println("File exists\n");
else
System.out.println("FNF (File not found)\n");
}
}