import java.util.*;

public class HeapOOM{
	
	static class OOMObject{
		
	}

	public static void main(String [] args){
		List<OOMObject> list = new ArrayList<OOMObject>();
		while(true){
			list.add(new OOMObject());
		}
	}
}

//before java You need makefile
//the parameter of java£ºjava -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError HeapOOM