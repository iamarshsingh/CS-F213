class House{

    private char houseType;
    private int countRooms;
    private int houseNumber;
    private int baseLength;
    private int baseWidth;
    private int height;
    private int pyramidHeight;
    
    class Cuboid{
        
        private int cost;
        private int roomHeight;
        private int roomLength;
        private int roomWidth;
        
        class Rectangle{
            
            private int wallLength;
            private int wallWidth;
            private char wallState;
            private char wallType;
            
            public Rectangle​(char wallType, boolean isRaining){
                this.wallType = wallType;
                
                if(isRaining == true){
                    this.wallState = 'b';
                }
                else this.wallState = 'g';
                
                if(wallType=='w')wallLength = roomLength;
                else if(wallType=='l')wallLength = roomWidth;
                else wallLength = roomLength;
                
                if(wallType=='f' || wallType=='c')wallWidth = roomWidth;
                else wallWidth = roomHeight;
            }
            
            public int getArea(){
                return wallLength*wallLength;
            }
            
            public char getWallCondition(){
                return this.wallState;
            }
        }
        
        Rectangle walls[];
        
        public Cuboid​(int length, int width, int cost){
            roomLength = length;
            roomWidth = width;
            this.cost = cost;
            roomHeight = height;
            walls = new Rectangle[6];
            countRooms++;
        }
        
        public Cuboid​(int length, int width){
            roomLength = length;
            roomWidth = width;
            cost = 0;
            roomHeight = height;
            walls = new Rectangle[6];
            countRooms++;
        }
        
        public int getCost() {
            return cost;
        }
        
        public int getVolume(){ 
            return roomLength*roomWidth*roomHeight;
        }
    }
    
    class Pyramid{
        private int pyramidBaseLength;
        private int pyramidBaseWidth;
        private int pyramidHeight;
        
        class Triangle{
            
            private int baseSide;
            private int triangleType;
            private int wallSide1;
            private int wallSide2;
            
            public Triangle​(char triangleType, int side1, int side2){
                this.triangleType = triangleType;
                
                if(triangleType=='w') baseSide = pyramidBaseWidth;
                else if(triangleType=='l') baseSide = pyramidBaseLength;
                
                wallSide1 = side1;
                wallSide2 = side2;
            }
            
            public int getTriangleArea(){
                int s = ((baseSide + wallSide1 + wallSide2)/2);
                return (s*(s-baseSide)*(s-wallSide1)*(s-wallSide2));
            }
        }
        
        Triangle roofWalls[];
        
        public Pyramid(){
            pyramidBaseLength = baseLength;
            pyramidBaseWidth = baseWidth;
            this.pyramidHeight = pyramidHeight;
            roofWalls = new Triangle[4];
        }
        
        public int getVolume(){
            return ((pyramidHeight*pyramidBaseLength*pyramidBaseWidth)/3);
        }
        
        public int getSurfaceArea(){
            int sum=0;
            for(int i=0;i<4;i++) sum = sum + roofWalls[i].getTriangleArea();
            return sum;
        }
        
    }
    
    public Cuboid rooms[];
    public Pyramid houseTop;
    
    public House​(int maxNoOfRooms, int houseNumber, int baseLength, int baseWidth, int height, int pyramidHeight, char houseType){
        this.houseNumber = houseNumber;
        this.baseLength = baseLength;
        this.baseWidth = baseWidth;
        this.height = height;
        this.pyramidHeight = pyramidHeight;
        this.houseType = houseType;
        rooms = new Cuboid[maxNoOfRooms];
        houseTop = new Pyramid();
    }
    
    public int getHouseNumber(){
        return houseNumber;
    }
    
    public int getCountRooms(){
        return countRooms;
    }
    
    public int getBadWalls(){
        int bw = 0;
        for(int i=0;i<countRooms;i++){
            for(int j=0;j<6;j++){
                if(rooms[i].walls[j].getWallCondition()=='b')bw++;
            }
        }
        return bw;
    }
    
    public int houseVolume(){
        return ((baseLength*baseWidth*height)+(houseTop.getVolume()));
    }
    
    public int freeSpace(){
        int usedVolume = 0;
        for(int i=0;i<countRooms;i++){
            usedVolume = usedVolume + rooms[i].getVolume();
        }
        return (houseVolume() - usedVolume);
    }
    
    public int getRent(){
        int cost = 0;
        if(houseType == 'c'){
            for(int i=0;i<countRooms;i++){
                cost = cost + rooms[i].getCost();
            }
        }
        else if(houseType == 'r'){
            cost = getSurfaceArea();
        }
        return cost;
    }
    
    public char getHouseType(){
        return houseType;
    }
    
    public int getSurfaceArea(){
        return ((2*height*(baseLength+baseWidth))+(houseTop.getSurfaceArea()));
    }
}
