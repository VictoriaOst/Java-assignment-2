import com.company.Person;
import com.company.PersonSerializer;
import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class PersonSerializerTest {
    @Test
    public void isEqualsObjectBeforeAndAfterSerilizationAndDesirilization_returns_correct(){
        Person expected = new Person(2142374,"Elon","Musk",46,new ArrayList<>());
        Person actual = PersonSerializer.fromJson(PersonSerializer.toJson(expected));
        Assert.assertEquals(expected,actual);
    }
}
