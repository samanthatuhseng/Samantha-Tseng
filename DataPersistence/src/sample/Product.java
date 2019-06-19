package sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Product {
    String name;
    Double cost;
    int amount;
    FileWriter fw = new FileWriter("product.txt",true);
    BufferedWriter bw = new BufferedWriter(fw);

    public Product(String name, Double cost, int amount) throws IOException {
        this.name = name;
    }

    public String toString(){
        return name;
    }

    public void writeToFile() throws IOException {
        bw.write(name);
        bw.newLine();
        bw.write(Double.toString(cost));
        bw.newLine();
        bw.write(Integer.toString(amount));
        bw.newLine();
        bw.write(";");

    }
}
