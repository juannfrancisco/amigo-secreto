package cl.magno.labs.games.secretfriend.core.services;

import cl.magno.labs.games.secretfriend.core.exception.WrongEmailException;
import cl.magno.labs.games.secretfriend.core.model.Person;

import java.util.*;


public class RaffleService {
	private static final String TEMPLATEEMAIL = "C:/disco/desarrollo/2012/clientes/klabs/Amigo Secreto/WORKSPACE/wsSecretFriend/AmigoSecreto/WebContent/email.tmpl.html";

	/**
	 * @param args

	public static void main(String[] args) 
	{
		
		List<Friend> friends = RaffleService.doRaffle();
		for( Friend f : friends )
		{
			String html = ReadFile.readHTML( TEMPLATEEMAIL );
			html = html.replace( "$amigoSecreto" , 	f.getSecretFriend().getNombre() == null? ""		: f.getSecretFriend().getNombre().toUpperCase() );
			html = html.replace( "$MeGusta" ,		f.getSecretFriend().getMeGusta() == null? ""	: f.getSecretFriend().getMeGusta() );
			html = html.replace( "$NoMeGusta" , 	f.getSecretFriend().getNoMeGusta() == null?""	: f.getSecretFriend().getNoMeGusta());
			String asunto  = "SORTEO AMIGO SECRETO";
			EnviarMail e = new EnviarMail();				
			e.enviarMailHTML(f.getEmail(), asunto, html);
		}		
	}

	 */


	/**
	 *
	 * @param members
	 * @return
	 */
	public static List<Person> doRaffle(List<Person> members )
	{
		List<Person> amigoSecreto  = new ArrayList<Person>();
		Set<Person> gr = new HashSet<Person>();
		Random rand = new Random();
		int x = rand.nextInt(100);
		int g = members.size();

		for( Person friend : members )
		{
			Person secreto = null;
			x = rand.nextInt(g);
			if( gr.contains(members.get(x)) || friend.getEmail().equalsIgnoreCase( members.get(x).getEmail()) )//SI CONTIENE EL AMIGO SECRETO ENTONCES BUSCAR UN NUEVO AMIGO
			{
				for( int i = 0 ; i< members.size() ; i++ )
				{
					if( !(gr.contains(members.get(i))) &&  !(friend.getEmail().equalsIgnoreCase( members.get(i).getEmail() ) ) )//SI NO LO CONTIENE Y TAMPOCO ES EL MISMO ENTONCES AGREGAR
					{
						secreto = members.get(i);
						break;
					}
				}
				if( null == secreto || secreto.getName().equals("ejemplo") ){
					return doRaffle(members);
				}
				gr.add(secreto);//Add
				friend.setSecretFriend(secreto);
				amigoSecreto.add(friend);
			}
			else
			{
				gr.add(members.get(x));
				friend.setSecretFriend(members.get(x));
				amigoSecreto.add(friend);
			}
		}

		return amigoSecreto;

	}
}
