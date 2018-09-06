class Colony{
    private House[] houses;
    private int numberOfHouses;
    
    public Colony(){
        numberOfHouses = 0;
        houses = new House[10];
    }
    
    public boolean addHouse​(House house){
        if(numberOfHouses<10){
            houses[numberOfHouses++] = house;
            return true;
        }
        else return false;
    }
    
    public int getNumberOfHouses(){
       return numberOfHouses;
    }
    
    public int goodWalls(){
        int gw = 0;
        for(int i=0;i<numberOfHouses;i++){
            gw = (gw + (houses[i].getCountRooms()*6) - houses[i].getBadWalls());
        }
        return (gw);
    }
    
    public int getRevenue(){
        int rev = 0;
        for(int i=0;i<numberOfHouses;i++){
            rev = (rev + (houses[i].getRent()));        
        }
        return rev;
    }
}
