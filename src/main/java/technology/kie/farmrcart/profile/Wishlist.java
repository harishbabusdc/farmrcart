package technology.kie.farmrcart.profile;

import technology.kie.farmrcart.brand.Product;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Wishlist   implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String link;
    private Boolean wished;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product")
    private Product product;

    public Wishlist() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Boolean getWished() {
        return wished;
    }

    public void setWished(Boolean wished) {
        this.wished = wished;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
