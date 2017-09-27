
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public int TempVariable = 0;
    public int TempLowest;
    public int RowCounter = 0;
    int[] IntitialBeepers = new int[8];
    int[] ReorgnizedBeepers = new int[8];
    
    public void sortBeepers() {
      Reposition();
      PickBeepers();
      Reposition();
      PrintIntitial();
      SortArray();
      PrintReorganized();
      PlaceBeepers();
    }
    
    public void Reposition(){
        FaceSouth();
        while (frontIsClear()){
            move();
        }
        FaceWest();
        while (frontIsClear()){
            move();
        }
        FaceEast();
    }
    
    public void PickBeepers(){
        FaceNorth();
        TempVariable = 0;
        RowCounter = 0;
        while (RowCounter<8){
            while (nextToABeeper()){
                pickBeeper();
                move();
                TempVariable++;
            }
            if (RowCounter==8){
                Reposition();
            }
            else{
                IntitialBeepers[RowCounter]=TempVariable;
            }
            TempVariable = 0;
            FaceSouth();
            while (frontIsClear()){
                move();
            }
            FaceEast();
            move();
            FaceNorth();
            RowCounter++;
        }
        RowCounter =0;
        TempVariable =0;
    }
    
    public void PrintIntitial(){
        System.out.println();
        for (int value: IntitialBeepers){
            System.out.print(value + " , ");
        }
        System.out.println();
    }
        
    public void SortArray(){
        // IntitialBeepers[]
        // ReorgnizedBeepers[]
        int TempInt=0;
        int TempIndex=0;
        int Temp = 0;
        int Index=0;
        int Lowest=0;
        
        // L O G I C    S U C K S     R I G H T     N O W      ! ! ! ! ! !
    }
    
    public void PrintReorganized(){
        System.out.println();
        for (int value: ReorgnizedBeepers){
            System.out.print(value + " , ");
        }
        System.out.println();
    }
    
    public void PlaceBeepers(){
        
        
    }
    
    
    
    
    
    public void FaceNorth(){
      while (!facingNorth()){
          turnLeft();
        }
    }
    public void FaceEast(){
      while (!facingEast()){
          turnLeft();
        }
    }
    public void FaceSouth(){
      while (!facingSouth()){
          turnLeft();
        }
    }
    public void FaceWest(){
      while (!facingWest()){
          turnLeft(
          );
        }
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
}

