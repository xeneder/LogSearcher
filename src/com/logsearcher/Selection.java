package com.logsearcher;

/**
 * Класс, описывающий результаты поиска в открытом файле.
 */
public class Selection {
    /** Начало найденной последовательности. */
    private int start;
    /** Конец найденной последовательности. */
    private int end;

    /**
     * Создаёт новый результат поиска.
     * @param s Начало найденной последовательности
     * @param e Конец найденной последовательности
     */
    Selection(int s, int e) {
        start = s;
        end = e;
    }

    /**
     * Возвращает начало последовательности.
     * @return Начало последовательности
     */
    public int getStart() {
        return start;
    }

    /**
     * Возвращает конец последовательности.
     * @return Конец последовательности
     */
    public int getEnd() {
        return end;
    }
}
