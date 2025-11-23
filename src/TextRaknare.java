public class TextRaknare {

    private int rader = 0;
    private int tecken = 0;

    public void RaknaRad(String rad) {
        var lasaOlikaRader = rad.split("\n");
        tecken = RaknaTecken(lasaOlikaRader);
        rader = lasaOlikaRader.length;
    }

    private int RaknaTecken(String [] rader)
    {
        int total = 0;
        for (String rad : rader) {
            total += rad.length(); // add length of each string
        }
        return total;
    }
    public int GetRader() {
        return rader;
    }

    public int GetTecken() {
        return tecken;
    }
}
