/**
 * generated by Xtext 2.12.0
 */
package smarthome.dsl.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import smarthome.Home;
import smarthome.Pattern;
import smarthome.Person;
import smarthome.Room;
import smarthome.Sensor;
import smarthome.dsl.services.DslGrammarAccess;

@SuppressWarnings("all")
public class DslFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private DslGrammarAccess _dslGrammarAccess;
  
  protected void _format(final Home home, @Extension final IFormattableDocument document) {
    EList<Room> _rooms = home.getRooms();
    for (final Room room : _rooms) {
      document.<Room>format(room);
    }
    EList<Person> _persons = home.getPersons();
    for (final Person person : _persons) {
      document.<Person>format(person);
    }
    EList<Pattern> _patterns = home.getPatterns();
    for (final Pattern pattern : _patterns) {
      document.<Pattern>format(pattern);
    }
  }
  
  protected void _format(final Room room, @Extension final IFormattableDocument document) {
    EList<Sensor> _sensors = room.getSensors();
    for (final Sensor sensor : _sensors) {
      document.<Sensor>format(sensor);
    }
  }
  
  public void format(final Object room, final IFormattableDocument document) {
    if (room instanceof XtextResource) {
      _format((XtextResource)room, document);
      return;
    } else if (room instanceof Room) {
      _format((Room)room, document);
      return;
    } else if (room instanceof Home) {
      _format((Home)room, document);
      return;
    } else if (room instanceof EObject) {
      _format((EObject)room, document);
      return;
    } else if (room == null) {
      _format((Void)null, document);
      return;
    } else if (room != null) {
      _format(room, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(room, document).toString());
    }
  }
}