public class Theatre {
    private IntegerSet seatsRemaining;
    private IntegerSet occupiedSeats;
    private IntegerSet aisleSeats;
    private int totalRows;

    Theatre (int totalSeats, int[] firstRowAisleSeats, int rows){
        seatsRemaining=new IntegerSet();
        occupiedSeats=new IntegerSet();
        aisleSeats=new IntegerSet();
        for(int i= 0;i<totalSeats;i++){
            seatsRemaining.insert(i+1);
        }

        for(Integer n : firstRowAisleSeats){
            aisleSeats.insert(n);
        }

        totalRows = rows;
    }

    Theatre(){
        seatsRemaining= new IntegerSet();
        occupiedSeats = new IntegerSet();
        aisleSeats= new IntegerSet();
        for(int i = 0; i< 120; i++){
            seatsRemaining.insert(i+1);
        }
        totalRows=10;
    }

    public void purchaseSeats(Integer seatNum){
        if(seatsRemaining.contains(seatNum)){
            occupiedSeats.insert(seatNum);
            seatsRemaining.remove(seatNum);
        }
    }

    public IntegerSet getSeatsRemaining(){
        return seatsRemaining;
    }

    public boolean isAisle(Integer seatNum){
        int seatsPerRow=getSize()/totalRows;
        return aisleSeats.contains(seatNum % seatsPerRow);
    }

    public boolean isPurchased(Integer num){
        return occupiedSeats.contains(num);
    }

    public int getSize(){
        return seatsRemaining.size();
    }
}
