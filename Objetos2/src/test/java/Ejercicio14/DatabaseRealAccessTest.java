package Ejercicio14;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseRealAccessTest {
    private DatabaseAccess database;
    private ProxyDatabase pd;

    @BeforeEach
    void setUp() throws Exception {
        this.database = new DatabaseRealAccess();
        this.pd = new ProxyDatabase(database);
    }

    @Test
    void testGetSearchResults() {
    	Exception exception = assertThrows(RuntimeException.class, () -> {this.pd.getSearchResults("select * from comics where id=1");});
    	assertEquals("Accion no disponible, usuario no autenticado",exception.getMessage());
    	this.pd.CambiarEstado();
    	assertEquals(Arrays.asList("Spiderman", "Marvel"), this.pd.getSearchResults("select * from comics where id=1"));
        assertEquals(Collections.emptyList(), this.pd.getSearchResults("select * from comics where id=10"));
    }

    @Test
    void testInsertNewRow() {
    	Exception exception = assertThrows(RuntimeException.class, () -> {this.pd.getSearchResults("select * from comics where id=1");});
    	assertEquals("Accion no disponible, usuario no autenticado",exception.getMessage());
    	this.pd.CambiarEstado();
        assertEquals(3, this.pd.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(Arrays.asList("Patoruzú", "La flor"), this.pd.getSearchResults("select * from comics where id=3"));
    }
}