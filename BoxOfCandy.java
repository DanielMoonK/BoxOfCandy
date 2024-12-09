public class BoxOfCandy
{
    /** box contains at least one row and is initialized in the constructor. */
    private Candy[][] box;

    public BoxOfCandy(Candy[][] candyBox){
        box = candyBox;
    }

    public boolean moveCandyToFirstRow(int col)
    {
        if(box[0][col] != null) return true;
        else{
            for(int row=0; row<box.length; row++){
                if(box[row][col] != null){
                    box[0][col] = box[row][col];
                    box[row][col] = null;
                    return true;
                }
            }
        }
    }

    // public Candy removeNextByFlavor(String flavor)
    { /* to be implemented in part (b) */ }


}