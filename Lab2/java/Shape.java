public class Shape{
    private int squareCount;
    private int triangleCount;
    private Square[] squareList = new Square[10];
    private Triangle[] triangleList = new Triangle[10];
    
    public Shape(){
        this.squareCount = 0;
        this.triangleCount = 0;
    }
    
    public int getSquareCount​(){
        return this.squareCount;
    }
    
    public int getTriangleCount​(){
        return this.triangleCount;
    }
    
    public boolean insertTriangle​(Triangle triangle){
        if(this.triangleCount<10){
            triangleList[this.triangleCount] = triangle;
            this.triangleCount++;
            return true;
        }
        else return false;
    }
    
    public boolean insertSquare​(Square square){
        if(this.squareCount<10){
            squareList[this.squareCount] = square;
            this.squareCount++;
            return true;
        }
        else return false;
    }
    
    public char getColourOfMaxSquare​(){
        int area,max=0;
        char colour='N';
        for(int i=0;i<squareCount;i++){
            area = squareList[i].getArea();
            if(area>max){
                max = area;
                colour = squareList[i].getColour();
            }
        }
        return colour;
    }
    
    public char getColourOfMaxTriangle(){
        int area,max=0;
        char colour='N';
        for(int i=0;i<triangleCount;i++){
            area = triangleList[i].getArea();
            if(area>max){
                max = area;
                colour = triangleList[i].getColour();
            }
        }
        return colour;
    }
}