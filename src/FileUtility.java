import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileUtility {
String filename1="C:\\Users\\user\\Desktop\\dsds\\test.txt";
	public static void main(String[] args) throws IOException {
		//writeString methodu ile io
String text="text on my file";
//		Path filename=Path.of("C:\\Users\\user\\Desktop\\dsds\\test.txt");
//		Files.writeString(filename, text);
//		String file_content=Files.readString(filename);
//		System.out.println(file_content);
		
		
		
		
		//Using FileWriter Class ile
//    try(FileWriter fw=new FileWriter("C:\\\\Users\\\\user\\\\Desktop\\\\dsds\\\\test.txt");){
//                fw.write(text);
//    }
//    catch(IOException e){
//    	System.out.println(e.getMessage());
//    }





//Using BufferedWriter
//try(FileWriter fw=new FileWriter("C:\\Users\\user\\Desktop\\dsds\\test.txt");
//	BufferedWriter Bf=new BufferedWriter(fw);){
//	Bf.write(text);
//}
//catch(IOException e) {
//	e.getStackTrace();
//}


  


//FileoutputStream ile
//File file=new File("C:\\\\Users\\\\user\\\\Desktop\\\\dsds\\\\test.txt");
////Using FileOutputStream
//try(FileOutputStream fop=new FileOutputStream(file);){
//	fop.write(null);
//}





//Object1 ob=new Object1();
//
////File-a object Write etmek
//try(FileOutputStream fop=new FileOutputStream("C:\\\\Users\\\\user\\\\Desktop\\\\dsds\\\\test.txt");
//	ObjectOutputStream oos=new ObjectOutputStream(fop);	){
//	oos.writeObject(ob);
//	
//}
  





//read etmek bytle-a
//File f=new File("C:\\Users\\user\\Desktop\\dsds\\test.txt");
//byte [] btarr=new byte[(int)f.length()];
//FileInputStream fis=new FileInputStream(f);
//fis.read(btarr);
//System.out.println(btarr);
}
}
