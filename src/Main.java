
public class Main {

    public static void main(String[] args) {
        String sampleText = "THE SHORT HAIRED QUICK BROWN FOX COMES OUT OF IT'S CAGE AS IT JUMPS OVER THE LAZY DOG WHO LIES IN THE GRASS ASLEEP. I HOPE THIS TEST IS ABLE TO COVER ALL THAT NEEDS TO BE COVERED IN KEYSTROKE TESTING.";
        Verifier verifier = new Verifier();
        System.out.println("IS VALID - "+verifier.validateParagraphText(sampleText));
    }


}
