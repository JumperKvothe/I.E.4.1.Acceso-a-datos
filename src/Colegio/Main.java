package Colegio;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;

public class Main {

	public static void main(String[] args) {
		
		ObjectContainer bd=Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "colegio.db4o");
		
		try 
		{
			
		}
		finally 
		{
			bd.close();
		}
	}

}
