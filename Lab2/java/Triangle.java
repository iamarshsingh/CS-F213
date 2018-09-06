public class Triangle{
    private char colour;
    private int base;
    private int height;
    
    public Triangle(int height, int base, char colour){
        this.height = height;
        this.base = base;
        this.colour = colour;
    }
    
    public int getArea(){
        return ((this.base*this.height)/2);
    }
    
    public char getColour(){
        return (this.colour);
    }
}