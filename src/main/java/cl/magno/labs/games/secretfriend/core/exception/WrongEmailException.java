/**
 * 
 */
package cl.magno.labs.games.secretfriend.core.exception;

/**
 * @author JUAN MALDONADO LEON - KLABS
 *
 */
public class WrongEmailException extends Exception 
{
	private static final long serialVersionUID = 1292147585115281581L;
	
	public WrongEmailException( String email )
	{
		super( "La direccion de correo electronico es incorrecta : " +  email );
	}

}
