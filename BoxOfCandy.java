public class BoxOfCandy
{
    /** box contains at least one row and is initialized in the constructor. */
    private Candy[][] box;

    public BoxOfCandy(Candy[][] candyBox){
        box = candyBox;
    }

    public String toString(){
        String strBox = "";
        for(int row=0;row<box.length;row++){
            for(int col=0;col<box[row].length;col++){
                if(box[row][col] != null){
                    strBox += box[row][col].getFlavor() + " ";
                }
                else{
                    strBox += "empty ";
                }
            }
            strBox += "\n";
        }
        return strBox;
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
        return false;
    }

    public Candy removeNextByFlavor(String flavor)
    {
        Candy selected = new Candy(null);
        for(int row = box.length-1; row>=0; row--){
            for(int col=0;col<box[row].length;col++){
                if(box[row][col] != null){
                    if(box[row][col].getFlavor().equals(flavor)){
                        selected = box[row][col];
                        box[row][col] = null;
                        return selected;
                    }
                }
            }
        }
        return null;
    }


}