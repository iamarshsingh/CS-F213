public class Square{
    private char colour;
    private int edge;
    
    public Square(int edge, char colour){
        this.edge = edge;
        this.colour = colour;
    }
    
    public int getArea(){
        return (this.edge*this.edge);
    }
    
    public char getColour(){
        return (this.colour);
    }
}