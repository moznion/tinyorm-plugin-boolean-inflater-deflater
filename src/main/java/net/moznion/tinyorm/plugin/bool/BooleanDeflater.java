package net.moznion.tinyorm.plugin.bool;

import me.geso.tinyorm.trigger.Deflater;

public class BooleanDeflater implements Deflater {
    @Override
    public Object deflate(Object value) {
        if (value == null) {
            return null;
        }

        if (value instanceof Boolean) {
            if (value.equals(true)) {
                return 1;
            } else {
                return 0;
            }
        } else {
            throw new IllegalArgumentException("BooleanDeflater only supports java.lang.Boolean");
        }
    }
}
