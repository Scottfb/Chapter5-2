
public class Probability implements ProbabilityCalc, Comparable<Probability>
{
    private int favorable;
    private double value;
    private int total;
    public Probability(int fav, int tot) {
        this.favorable = fav;
        this.total = tot;
        this.value = ((double)favorable)/total;
    }
    public double probabilityAND(Probability p2) {
        return this.value * p2.getValue();
    }
    public double probabilityOR(Probability p2, double overlap) {
        return (this.value + p2.getValue()) - overlap;
    }
    public double getValue() {
        return this.value;
    }
    public int compareTo(Probability p2) {
        if (this.value == p2.value) {
            return 0;
        } else if(this.value > p2.value) {
            return 1;
        } else {
            return -1;
        }
     }   
}
