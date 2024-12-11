public class Candy {

    String color = "";
    public Candy(String canColor){
        color = canColor;
    }
    public String getFlavor() {
        if(color != null) return color;
        return null;
    }

}