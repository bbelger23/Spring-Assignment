package brandon.iface;

import brandon.Sale;

public interface ShippingPolicy {
    void applyShipping(Sale sale);
}
