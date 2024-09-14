package exercicios.exer_20.entities;

public class Sale {
    private String seller;
    private Integer items;
    private Integer month;
    private Integer year;
    private Double total;


    public Sale(String seller, Integer items, Integer month, Integer year, Double total) {
        this.seller = seller;
        this.items = items;
        this.month = month;
        this.year = year;
        this.total = total;

        }
    public Double avaragePrice() {
        return total/items;
    }

        public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public Integer getItems() {
        return items;
    }

    public void setItems(Integer items) {
        this.items = items;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "seller='" + seller + '\'' +
                ", items=" + items +
                ", month=" + month +
                ", year=" + year +
                ", total=" + total +
                '}';
    }
}
