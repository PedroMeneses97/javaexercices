public class Review {

    private String description;
    private double reviewValue;

    //Construtor
    public Review(String description, double reviewValue) {
        this.description = description;
        this.reviewValue = reviewValue;
    }

    //Metodos
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getReviewValue() {
        return reviewValue;
    }

    public void setReviewValue(double reviewValue) {
        this.reviewValue = reviewValue;
    }



    @Override
    public String toString() {
        return "Review{" +
                "description='" + description + '\'' +
                ",reviewValue=" + reviewValue +
                '}';
    }
}
