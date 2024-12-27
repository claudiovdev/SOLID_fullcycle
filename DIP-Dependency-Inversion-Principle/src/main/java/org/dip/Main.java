package org.dip;

import org.dip.correto.DramaCategory;
import org.dip.correto.Movie;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("Meu filme", new DramaCategory());
        System.out.println("Hello world!");
    }
}