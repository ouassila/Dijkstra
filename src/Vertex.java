
public class Vertex {

		public final String name;
	    public double minDistance;
	    public Vertex previous;
	    
	    
	    public Vertex(String name, double minD) { 
	    	this.name = name; 
	    	this.minDistance = minD;
	    }
	   
	    public Vertex compareMinDistance(Vertex v2){
	       if(this.minDistance > v2.minDistance){
	    	   return v2;	    	 
	       }
	       else if(this.minDistance < v2.minDistance){
	    	   return this;
	       }
	       else {
	    	   return null;
	       }
	    }
}
