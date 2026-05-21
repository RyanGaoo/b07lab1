public class Polynomial {
    double[] coefficients;

    public Polynomial() {
        this.coefficients = new double[0];
    }

    public Polynomial(double[] coefficients) {
        this.coefficients = coefficients;
    }

    public Polynomial add(Polynomial p) {
        int len = Math.max(this.coefficients.length, p.coefficients.length);
        double[] result = new double[len];
        for (int i = 0; i < this.coefficients.length; i++) {
            result[i] += this.coefficients[i];
        }
        for (int i = 0; i < p.coefficients.length; i++) {
            result[i] += p.coefficients[i];
        }
        return new Polynomial(result);
    }

    public double evaluate(double x) {
        double result = 0.0;
        for (int i = 0; i < coefficients.length; i++) {
            result += coefficients[i] * Math.pow(x, i);
        }
        return result;
    }

    public Boolean hasRoot(double x) {
        return evaluate(x) == 0;
    }
}
