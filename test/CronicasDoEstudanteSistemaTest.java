import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CronicasDoEstudanteSistemaTest {
    CronicasDoEstudanteSistema system = new CronicasDoEstudanteSistema();

    @BeforeEach
    void setUp(){
        system.registerChronicle("abc", "cba", LocalDate.of(2004, 06, 22), "Axel");
        system.registerChronicle("def", "fed", LocalDate.of(2004, 06, 22), "Axel");
        system.registerChronicle("ghi", "ihg", LocalDate.of(2004, 06, 22), "Axel");
        system.createBooklet(system, new int[] {0, 1, 2});
    }

    @Test
    void registerChronicle() {
        assertNotNull(system.getChronicles()[0]);
    }

    @Test
    void RegisterChronicleError() {
        assertEquals(system.registerChronicle("abc", "def", LocalDate.of(2004, 06, 22), "Axel"), "Crônica já cadastrada. Não é permitido duplicatas.");
    }

    @Test
    void checkExistingChronicle() {
        assertTrue(system.checkExistingChronicle(system.getChronicles()[0]));
        assertTrue(system.checkExistingChronicle(system.getChronicles()[1]));
        assertTrue(system.checkExistingChronicle(system.getChronicles()[2]));
    }

    @Test
    void createBooklet() {
        assertNotNull(system.getBooklets()[0]);
    }

    @Test
    void readBooklet() {
        assertNotNull(system.readBooklet(0));
    }

    @Test
    void readChronicle() {
        assertEquals(system.getChronicles()[0].getContent(), "cba");
    }

    @Test
    void showMostReadChronicle() {
        system.readChronicle(0);
        assertEquals(system.showMostReadChronicle(), "cba - lida 1 vezes");
    }

    @Test
    void getChronicles() {
        assertTrue(system.getChronicles() instanceof Chronicle[]);
    }

    @Test
    void getBooklets() {
        assertTrue(system.getBooklets() instanceof Booklet[]);
    }
}