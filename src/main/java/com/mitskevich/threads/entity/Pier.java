package com.mitskevich.threads.entity;

import com.mitskevich.threads.util.PierIdGenerator;

public class Pier {
    private final int id;

    public Pier() {
        id = PierIdGenerator.generate();
    }

    public long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Pier pier = (Pier) o;
        return id == pier.id;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pier{");
        sb.append("id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
