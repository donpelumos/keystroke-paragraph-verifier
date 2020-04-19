
public class Main {

    public static void main(String[] args) {
        String sampleText = "This is a sample text";
        Verifier verifier = new Verifier();
        System.out.println("IS VALID - "+verifier.validateParagraphText(sampleText));
    }


}
