import com.company.Person;
import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class PersonTest {
    @Test
    public void verifyCorrectnessOfEqual_return_correct() {
        EqualsVerifier.forClass(Person.class).withPrefabValues(Person.class,
                new Person(122134, "Elon", "Musk", 42, new ArrayList<>()),
                new Person(421412, "Igor", "Melnik", 23, new ArrayList<>()))
                .verify();
    }
}
