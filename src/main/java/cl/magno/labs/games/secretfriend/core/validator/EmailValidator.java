/**
 * 
 */
package cl.magno.labs.games.secretfriend.core.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author JUAN MALDONADO LEON - MLABS
 *
 */
public class EmailValidator
{
	
	/**
	 * VALIDA LA DIRECCION DE CORREO ELECTRONICO
	 * @author JUAN MALDONADO LE�N
	 * @param correo
	 * @return
	 */
	public static boolean isValid(String correo) {
		Pattern pat = Pattern.compile("^([0-9a-zA-Z]([_.w]*[0-9a-zA-Z])*@([0-9a-zA-Z][-w]*[0-9a-zA-Z].)+([a-zA-Z]{2,9}.)+[a-zA-Z]{2,3})$");
		Matcher mat = pat.matcher(correo);
        return (mat.find());
    }

}
