package com.logic;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationTest {

	public static void main(String[] args) throws IOException {

		At a = new At();
		Bt b = new Bt();
		Ct c = new Ct();
		Dt d = new Dt();
		File f = new File("abc.txt");
		FileOutputStream fo = new FileOutputStream(f);
		ObjectOutputStream os = new ObjectOutputStream(fo);
		os.writeObject(a);
		os.writeObject(b);
		os.writeObject(d);
	}

}

class At implements Serializable{}
class Bt extends At{}

class Ct {}
class Dt implements Serializable{}
