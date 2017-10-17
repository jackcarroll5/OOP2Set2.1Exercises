

/*This class will form a method for a film which will list the title,director and
 * duration*/
public class Film {

    private String title;
    private String director;
    private int duration;

    public Film()
    {
      setTitle("No Title");
      setDirector("No Director");
      setDuration(0);
    }

    public Film(String title,String director, int duration)
    {
        setTitle(title);
       setDirector(director);
       setDuration(duration);
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setDirector(String director)
    {
        this.director = director;
    }

    public void setDuration(int duration)
    {
        this.duration = duration;
    }

    public String getTitle()
    {
        return title;
    }

    public String getDirector()
    {
        return director;
    }

    public int getDuration()
    {
        return duration;
    }

   public String toString()
   {
     return "\n\nFilm: " + getTitle() + "\nDirector: " +
             getDirector() + "\nDuration: " + getDuration();

   }

}
