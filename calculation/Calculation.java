package calculation;

public class Calculation {
    int num;
    String data;

    // single parameter constructor
    public Calculation(String data) {
        this.data = data;
    }

    // 0 parameter defaukt constructor
    public Calculation() {
    }

    // getter
    public String getData() {
        return data;
    }

    // setter
    public void setData(String data) {
        this.data = data;
    }

    public void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }
}
