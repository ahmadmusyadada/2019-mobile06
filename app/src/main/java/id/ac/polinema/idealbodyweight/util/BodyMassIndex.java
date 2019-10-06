package id.ac.polinema.idealbodyweight.util;

public class BodyMassIndex {
    private float height;
    private int weight;
    private float index;
    private String classific;

    public BodyMassIndex(int height, int weight) {
        this.height = height;
        this.weight = weight;
        this.index = calculate();
        this.classific = Classification();
    }

    public float getIndex() {
        return index;
    }

    public String getClassific(){
        return classific;
    }

    private float calculate() {
        return weight / ((height / 100) * (height / 100));
    }

    private String Classification(){
        if (getIndex() < 18.50) {
            return "Underweight";
        } else if (getIndex() >= 18.50 && getIndex() < 25.00) {
            return "Normal BMI Range (Healthy Weight)";
        } else if (getIndex() >= 25.00 && getIndex() < 30.00) {
            return "Overweight (Pre-obese)";
        } else if (getIndex() >= 30.00 && getIndex() < 35.00) {
            return "Overweight (Obese Class 1)";
        } else if (getIndex() >= 35.00 && getIndex() < 40.00) {
            return "Overweight (Obese Class 2)";
        }
        return "Overweight (Obese class 3)";
    }
}