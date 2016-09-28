import java.nio.file.InvalidPathException;
import java.util.Deque;
import java.util.LinkedList;

public class FilePathName {
    private void computeFilePath(String filepath){
    	
        Deque pathstack = new LinkedList<String>();
    	//if pathname is empty throw error
        if(filepath.isEmpty()){
        	System.out.println("Illegalpathname");
        }
        if(filepath.startsWith("/")){
            pathstack.addFirst("/");   	   		
         }
        for(String splitpathname : filepath.split("/")){
        	if(splitpathname.equals("..")){
        		if(pathstack.isEmpty() || pathstack.peekFirst().equals("..")){
        			pathstack.addFirst(splitpathname);
        		}
        		else{
        			if(splitpathname.equals("/")){
        				System.out.println("Invalid path name");
        			}
        		    pathstack.removeFirst();
        		}
        	}else{
        		if(!splitpathname.equals(".") && !pathstack.isEmpty()){
        			pathstack.addFirst(splitpathname);
        		}
        	}
        }
        while(!pathstack.isEmpty()){
        System.out.println(pathstack.pop());
        }
        StringBuilder result = constructPathName(pathstack);
        System.out.println(result);
  }
      private StringBuilder constructPathName(Deque pathstack){
		  StringBuilder sb = new StringBuilder();
		  while(!pathstack.isEmpty()){
			  if(pathstack.peek().equals(null)){
				  pathstack.pop();
			  }else{
			  String temp = (String)pathstack.pop();
			  sb.append(temp);   
		      if(!pathstack.isEmpty()){
				  sb.append("/");
			   }
		     }
		   }
    	  return sb;
      }
      
      public static void main(String args[]){
    	  FilePathName fp = new FilePathName();
          fp.computeFilePath("usr/lib/../bin/gcc");  
      }
}