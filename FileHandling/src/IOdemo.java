import java.io.*;
public class IOdemo {
public static void main(String[] args) throws IOException {
	File f = new File("demo.txt");		//This line 1st checks whether abc.txt file is already available (or) not if it is already available then "f" simply refers that file. If it is not already available then it won't create any physical file just creates a java File object represents name of the file.
	System.out.println("is demo.txt directory exits : "+f.exists());
	
	f.createNewFile();
	System.out.println("is demo.txt directory exits : "+f.exists());
	
	File f2 = new File("newfolder");
	System.out.println("is newfolder directory exits : "+f2.exists());
	
	f2.mkdir();
	System.out.println("is newfolder directory exits : "+f2.exists());
	
	System.out.println("is demo.txt is a file : "+f.isFile());
	System.out.println("is newfolder is a directory : "+f2.isDirectory());

	String location = "C:\\recycler";  // to choose desired path
	File f3 = new File(location,"hii");  //to check file exists in desired path
	f3.mkdir();  // creates a folder in desired path
	File f4 = new File(f3,"hello.txt");  // to check existence of a file of hello in recently created hii folder
	f4.createNewFile();  // creates a file of hello in recently created hii folder
	
	String location1 = "C:\\Users\\mowni\\Desktop\\certificates";
	int filescount=0,dircount=0,jpgfiles=0;
	File f5 = new File(location1);
	String[] names = f5.list();
	for(String i : names) {
	System.out.println(i);
	
	File f6 = new File(f5,i);
	if(f6.isFile()) {
		filescount++;
		if(i.endsWith(".jpg"));
		jpgfiles++;
	}
	else if(f6.isDirectory())
		dircount++;
	
	}
	System.out.println("no of files "+filescount);
	System.out.println("no of directories"+dircount);
	System.out.println("no of jpg files "+jpgfiles);
	
	File f7 = new File("sample.txt");
	FileWriter f8 = new FileWriter(f7);  //It creates new file and replaces the existing content
	f8.write("hi");
	f8.write("\n");
	f8.write("ra");
	f8.flush();  //this method flushes the stream.If the stream has saved any characters from the various write() methods in a buffer
	f8.close(); // we need to close the filewriter after use
	
	FileWriter f9 = new FileWriter(f7,true);  //It creates new file and new content merges with existing content
	f9.write("\n");
	f9.write("its new line");
	f9.flush();
	f9.close();
	
	FileReader f10 = new FileReader(f7);
	int j = f10.read();
	while(j!=-1) {   //when there is nothing to read,compiles assigns -1
		System.out.print((char)j); //explicit type casting of int to char
		j=f10.read();
	}
	
}
}
