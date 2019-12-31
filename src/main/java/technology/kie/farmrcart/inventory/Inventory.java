package technology.kie.farmrcart.inventory;

import technology.kie.farmrcart.brand.Brand;
import technology.kie.farmrcart.brand.Product;
import technology.kie.farmrcart.brand.ProductColor;
import technology.kie.farmrcart.brand.ProductSize;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Inventory  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String barcode;
    private String overlayText;



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product")
    private Product product;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "brand")
    private Brand brand;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_color")
    private ProductColor productColor;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_size")
    private ProductSize productSize;

    public Inventory() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getOverlayText() { return overlayText; }

    public void setOverlayText(String overlayText) { this.overlayText = overlayText; }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public ProductColor getProductColor() {
        return productColor;
    }

    public void setProductColor(ProductColor productColor) {
        this.productColor = productColor;
    }

    public ProductSize getProductSize() {
        return productSize;
    }

    public void setProductSize(ProductSize productSize) {
        this.productSize = productSize;
    }
}
