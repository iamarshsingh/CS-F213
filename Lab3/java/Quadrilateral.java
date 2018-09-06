public class Quadrilateral{
    private int[] edge = new int[4];
    
    public  Quadrilateral(int edge){
        this.edge[0] = edge;
        this.edge[1] = edge;
        this.edge[2] = edge;
        this.edge[3] = edge;
    }
    
    public  Quadrilateral(int length, int breadth){
        this.edge[0] = length;
        this.edge[1] = breadth;
        this.edge[2] = length;
        this.edge[3] = breadth;
    }
    
    public Quadrilateral(int edge1, int edge2, int edge3, int edge4){
        this.edge[0] = edge1;
        this.edge[1] = edge2;
        this.edge[2] = edge3;
        this.edge[3] = edge4;
    }
    
    public  int getPerimeter(){
        int perimeter = edge[0]+edge[1]+edge[2]+edge[3];
        return perimeter;
    }
    
    public boolean equals(java.lang.Object obj){
        
        if(this == obj){
            return true;
        }
        
        if(obj == null || obj.getClass()!=this.getClass())
            return false;
            
        Quadrilateral quad = (Quadrilateral) obj;
        
        int per1 = this.getPerimeter();
        int per2 = quad.getPerimeter();
        
        if(per1==per2)
            return true;
        else return false;
    }
    
    public int hashCode(){
        return (17*37 + edge.hashCode());
    }
}
