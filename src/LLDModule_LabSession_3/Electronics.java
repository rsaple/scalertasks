package LLDModule_LabSession_3;

import java.io.Serializable;
import java.lang.annotation.ElementType;

public class Electronics extends Item {
    private int warranty;

    public Electronics(String id, String name, double price, int quantity, int warranty) {
        super(id, name, price, quantity);
        this.warranty = warranty;
    }
    public int getWarranty() {
        return warranty;
    }
    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

}
