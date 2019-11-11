import java.util.ArrayList;
import java.util.List;

public class Book {

    private String title;

    private int version = 1;

    private final int pages;

    private Author author;

    private List<Review> lstReviews = new ArrayList<>();

    public Book(int pages) {
        this.title = title;
        this.version = version;
        this.pages = pages;
        this.author = author;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getVersion() {
        return version;
    }

    public void incrementVersion() {
        version++;
    }

    public int getPages() {
        return pages;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public List<Review> getLstReviews() {
        return lstReviews;
    }

    public void setLstReviews(List<Review> lstReviews) {
        this.lstReviews = lstReviews;
    }

     public double MediaRewiew(){

         int contador = lstReviews.size();

         if (contador == 0)
         {
             return 0.0;
         }

         //calculo media
         double soma = 0;

         for (int i = 0; i < contador; i++)
         {
             //0 = 0+ return o numero das reviews
             soma = soma + lstReviews.get(i).getReviewValue();
         }
          return soma / contador;
     }

    @Override
       public String toString() {
            return String.format(
                    "Name: %s, " +
                    "Version: %d, " +
                    "Pages: %d, " +
                    "%s" +
                    "Review Average: %.2f", title, version, pages, author.toString() , MediaRewiew());
        }
}

