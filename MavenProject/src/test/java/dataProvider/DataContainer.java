package dataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataContainer {
	
	@DataProvider (indices= {1,3})
	public Object[] logintestData() {
		Object [] data=new Object[4];
		data [0]="Admin";
		data [1]="123";		
		data [2]="Admin123";
		data [3]="admin123";
		return data;
	}
	
	public Iterator<String> loginData() {
		List<String>data=new ArrayList<String>();
		data.add("Ram");
		data.add("SHam");
		data.add("Kam");
		data.add("Dam");
		return data.iterator();
	}
	
}
