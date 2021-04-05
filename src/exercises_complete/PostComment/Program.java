package exercises_complete.PostComment;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
	public static void main(String[] args) throws ParseException {
		
		Comment comment1 = new Comment("Boa viagem!");
		Comment comment2 = new Comment("Uauuu isso é muitooo maneiro!");
		Comment comment3 = new Comment("Boa noite!!");
		Comment comment4 = new Comment("Forças!");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Post post = new Post(sdf.parse("21/06/2020 13:05:44"), "Viagem para Nova Zelândia", 
				"Estou indo visitar, vai ser muito maneiro", 12);
		Post post2 = new Post(sdf.parse("28/07/2020 23:14:19"), "Boaaa noite, galera" , "Vejo vocês amanhã", 5);
		
	
		post.addComment(comment1);
		post.addComment(comment2);
		post2.addComment(comment3);
		post2.addComment(comment4);
		
		System.out.printf(post.toString());
		
		System.out.printf(post2.toString());
		
		
		
	}
}
