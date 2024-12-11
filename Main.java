public class Main{
    public static void main(String[] args)
    {
        Candy lime = new Candy("lime");
        Candy orange = new Candy("orange");
        Candy lemon = new Candy("lemon");
        Candy cherry = new Candy("cherry");
        Candy grape = new Candy("grape");

        Candy[][] box1 = {
        {null, lime, null},
        {null, orange, null},
        {null, null, cherry},
        {null, lemon, grape}
        };

        BoxOfCandy boxOne = new BoxOfCandy(box1);
        System.out.println(boxOne);
        System.out.println(boxOne.moveCandyToFirstRow(0));
        System.out.println(boxOne.moveCandyToFirstRow(1));
        System.out.println(boxOne.moveCandyToFirstRow(2));
        System.out.println();
        System.out.println(boxOne);

        Candy[][] box2 = {
            {lime, lime, null, lemon, null},
            {orange, null, null, lime, lime},
            {cherry, null, lemon, null, orange}
            };

        BoxOfCandy boxTwo = new BoxOfCandy(box2);
        System.out.println(boxTwo);
        System.out.println(boxTwo.removeNextByFlavor("cherry").getFlavor());
        System.out.println();
        System.out.println(boxTwo);
        System.out.println(boxTwo.removeNextByFlavor("lime").getFlavor());
        System.out.println();
        System.out.println(boxTwo);
        System.out.println(boxTwo.removeNextByFlavor("grape"));
        System.out.println();
        System.out.println(boxTwo);
    }
}