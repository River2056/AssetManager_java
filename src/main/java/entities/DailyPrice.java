package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "DAILY_PRICE")
@Entity
public class DailyPrice {
    @Id
    private Integer id;
    @Column(name = "stock_id")
    private String stockId;
    @Column(name = "stock_name")
    private String stockName;
    @Column(name = "current_price")
    private Double currentPrice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public Double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(Double currentPrice) {
        this.currentPrice = currentPrice;
    }

    @Override
    public String toString() {
        return "DailyPrice{" +
                "id=" + id +
                ", stockId='" + stockId + '\'' +
                ", stockName='" + stockName + '\'' +
                ", currentPrice=" + currentPrice +
                '}';
    }
}
