package net.moznion.tinyorm.plugin.bool;

import me.geso.tinyorm.trigger.Inflater;

public class BooleanInflater implements Inflater {
    @Override
    public Object inflate(final Object value) {
        if (value == null) {
            return null;
        }

        if (value instanceof Integer) {
            if (value.equals(0)) {
                return false;
            } else if (value.equals(1)) {
                return true;
            } else {
                throw new IllegalArgumentException("BooleanInflater supports integer only 0 or 1 (Given: " + value + ")");
            }
        } else {
            throw new IllegalArgumentException("BooleanInflater only supports java.lang.Integer");
        }
    }
}

