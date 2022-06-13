package ru.netology.manager;

import ru.netology.domain.MovieItems;

import java.util.Arrays;

public class MovieManager {

    private MovieItems[] items = new MovieItems[0];
    private int resultLength = 10;

    public MovieManager () {

    }
    public MovieManager (int resultLength) {
        this.resultLength = resultLength;
    }
    public void add(MovieItems item){
        int length = items.length + 1;
        MovieItems[]tmp = new MovieItems[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }
    public MovieItems[] findAll() {
        return items;
    }
    public MovieItems[] findLast() {
        if (items.length > resultLength) {
            resultLength = resultLength;
        } else {
            resultLength = items.length;
        }
        MovieItems[] result = new MovieItems[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = items.length - i- 1;
            result[i] = items [index];
        }
        return result;
    }
}


