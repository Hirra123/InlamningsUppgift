import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TextRaknareTest {

    @Test
    public void testSingleLine() {
        //Arrange
        TextRaknare raknare = new TextRaknare();

        //Act
        raknare.RaknaRad("Hejsan");

        //Assert
        assertEquals(1, raknare.GetRader());
        assertEquals(6, raknare.GetTecken());
    }

    @Test
    public void testFleraRader() {
        //Arrange
        TextRaknare raknare = new TextRaknare();

        //Act
        raknare.RaknaRad("Katt\nHund\nFisk\n");

        //Assert
        assertEquals(3, raknare.GetRader());
        assertEquals(12, raknare.GetTecken());
    }

    @Test
    public void testEmptyString(){
        //Arrange
        TextRaknare raknare = new TextRaknare();

        //Act
        raknare.RaknaRad("");

        //Assert
        assertEquals(1, raknare.GetRader());
        assertEquals(0, raknare.GetTecken());
    }
}