package se.agilesearch.helloworld.aws.lambda.valueobjects;

public class SalesOrder {

    private Integer product;

    private Integer items;

    public Integer getProduct() {
        return product;
    }

    public void setProduct(Integer product) {
        this.product = product;
    }

    public Integer getItems() {
        return items;
    }

    public void setItems(Integer items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "SalesOrder{" +
                "product=" + product +
                ", items=" + items +
                '}';
    }
}
