package day9;

import java.io.File;
import java.io.IOException;

public class CheckedException {

	public static void main(String[] args) throws IOException {
		File f=new File("abcd.txt");
		f.createNewFile();
	}

}
