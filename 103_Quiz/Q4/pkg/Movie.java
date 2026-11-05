package pkg;
public class Movie{
    String name;
    double rate;
    int numOfRate;
    int revenue;
    public Movie(){
        name = "Avengers";
        rate = 8.0;
        numOfRate = 33;
        revenue = 623357910;
    }
    public Movie(String a, double b, int c, int d){
        name = a;
        rate = b;
        numOfRate = c;
        revenue = d;
    }

    public int getRevenue(){
        return revenue;
    }
    public String getMovieName(){
        return name;
    }
    public void addRating(double a){
        System.out.println("current rating " + rate);
        double add = a;
        rate = (double)(((numOfRate*rate) + add)/(numOfRate + 1));
        System.out.println("new rating: " + rate);
    }
    public double getRate(){
        return rate;
    }



    public void movieToString(){
        System.out.println("Movie Name - " + name);
        System.out.println("Rating - " + rate);
        System.out.println("Amount of Ratings - " + numOfRate);
        System.out.println("Revenue - " + revenue);
        System.out.println("-----------------------");

    }
    public boolean compareRatings(Movie a){

        boolean compare = (a.getRate()) < rate; 
        return compare;
        
    }

}