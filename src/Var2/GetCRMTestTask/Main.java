package Var2.GetCRMTestTask;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //эти Place у нас константы, в ходе программы мы их менять не будем
        final Place place1 = (new Place("Исаакиевский собор", 5, 10));
        final Place place2 = (new Place("Эрмитаж", 8, 11));
        final Place place3 = (new Place("Кунсткамера", 3.5, 4));
        final Place place4 = (new Place("Петропавловская крепость", 10, 7));
        final Place place5 = (new Place("Ленинградский зоопарк", 9, 15));
        final Place place6 = (new Place("Медный всадник", 1, 17));
        final Place place7 = (new Place("Казанский собор", 4, 3));
        final Place place8 = (new Place("Спас на Крови", 2, 9));
        final Place place9 = (new Place("Зимний дворец Петра I", 7, 12));
        final Place place10 = (new Place("Зоологический музей", 5.5, 6));
        final Place place11 = (new Place("Музей обороны и блокады Ленинграда", 2, 19));
        final Place place12 = (new Place("Русский музей", 5, 8));
        final Place place13 = (new Place("Навестить друзей", 12, 20));
        final Place place14 = (new Place("Музей восковых фигур", 2, 13));
        final Place place15 = (new Place("Литературно-мемориальный музей Ф.М. Достоевского", 4, 2));
        final Place place16 = (new Place("Екатерининский дворец", 1.5, 5));
        final Place place17 = (new Place("Петербургский музей кукол", 1, 14));
        final Place place18 = (new Place("Музей микроминиатюры «Русский Левша»", 3, 18));
        final Place place19 = (new Place("Всероссийский музей А.С. Пушкина и филиалы", 6, 1));
        final Place place20 = (new Place("Музей современного искусства Эрарта", 7, 16));

        final Place[] places = {place1, place2, place3, place4, place5, place6, place7, place8, place9, place10, place11, place12, place13, place14, place15, place16, place17, place18, place19, place20};

        Arrays.sort(places, Comparator.comparingDouble(Place::valuePerHours).reversed());

        final int timeToSpent = 32;

        double wholeSpentTime = 0;

        int currentPlacePos = 0;

        Place[] bestRoute = new Place[places.length];

        while (currentPlacePos < places.length && wholeSpentTime != timeToSpent) {
            if ((wholeSpentTime + places[currentPlacePos].getTimeToVisit()) < timeToSpent) {
                wholeSpentTime = wholeSpentTime + places[currentPlacePos].getTimeToVisit();
                bestRoute[currentPlacePos] = places[currentPlacePos];

            } else {
                wholeSpentTime = timeToSpent;
            }
            currentPlacePos++;
        }

        System.out.println("Лучший маршрут посещения: ");
        Arrays.stream(bestRoute)
                .filter(Objects::nonNull)
                .forEach(System.out::println);

    }

}

