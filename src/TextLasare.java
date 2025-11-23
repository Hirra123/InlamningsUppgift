import java.util.Scanner;

public class TextLasare {

    private TextRaknare raknare;

    public TextLasare(TextRaknare raknare) {
        this.raknare = raknare;
    }

    public void Lasa() {
        Scanner scanner = new Scanner(System.in);
        String rad = "";
        while (true) {
            String radLasare = scanner.nextLine();
            if (radLasare.equalsIgnoreCase("stop")) {
                break;
            }

            rad += radLasare + "\n";
        }
        raknare.RaknaRad(rad);

        System.out.println("Antal_rader: "+ raknare.GetRader());
        System.out.println("Antal tecken: "+ raknare.GetTecken());
    }
}

