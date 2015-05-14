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

//执行之前 先编译
//执行命令：java -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError HeapOOM