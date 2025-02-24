package net.vladitandlplater.mystic_forgery.systems;


import net.vladitandlplater.mystic_forgery.systems.attributes.ComponentAttribute;

import java.util.HashMap;
import java.util.Map;

public class Attributes {
    private final Map<String, ComponentAttribute> attributes = new HashMap<>();

    public void addAttribute(String name, ComponentAttribute attribute) {
        attributes.put(name, attribute);
    }

    public ComponentAttribute getAttribute(String name) {
        return attributes.get(name);
    }

    public boolean hasAttribute(String name) {
        return attributes.containsKey(name);
    }
}
