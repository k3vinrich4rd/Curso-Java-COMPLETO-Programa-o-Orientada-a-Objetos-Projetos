package enumeracoes.entities.enums.exercicios.post.test;

import enumeracoes.entities.enums.exercicios.post.entities.Comment;
import enumeracoes.entities.enums.exercicios.post.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PostMain {

    public static void main(String[] args) throws ParseException {

        Comment comment1 = new Comment("Have a nice tripe");
        Comment comment2 = new Comment("Wow that's awesome");

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Post post1 = new Post();
        post1.setTitle("Traveling to new Zealand");
        post1.setLikes(12);
        post1.setMoment( sdf.parse( "21/06/2018 13:05:44"));
        post1.setContent("I'm going to visit this wonderful country!");
        post1.addComments(comment1);
        post1.addComments(comment2);

        System.out.println(post1);

        Comment comment3 = new Comment("Good night ");
        Comment comment4 = new Comment("May the force be with you");


        Post post2 = new Post();
        post2.setTitle("Good night guys");
        post2.setLikes(5);
        post2.setMoment( sdf.parse( "28/07/2018 23:14:19"));
        post2.setContent("See you tomorrow");
        post2.addComments(comment3);
        post2.addComments(comment4);

        System.out.println(post2);

    }
}
