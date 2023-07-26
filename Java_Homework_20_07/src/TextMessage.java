public class TextMessage {

    public String fuck = "";
    public String bullshit = "";

    TextMessage(){

    }

    public TextMessage(String swearfuck, String swearbullshit) {
    fuck = swearfuck;
    bullshit = swearbullshit;
    String fuck1 = swearfuck.replace("Fuck", "***k");
    String bullshit1 = swearbullshit.replace("Bullshit", "*******t");
    System.out.println(fuck1);







 }
}






















