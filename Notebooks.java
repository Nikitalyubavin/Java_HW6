/*Подумать над структурой класса Ноутбук для магазина техники — выделить поля и методы. Реализовать в Java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:

“Введите цифру, соответствующую необходимому критерию:

1 - ОЗУ
2 - Объём ЖД
3 - Операционная система
4 - Цвет …

Далее нужно запросить минимальные значения для указанных критериев — сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.*/

/**
 * Notebooks
 */

import java.util.*;

public class Notebooks {
    static void ComputerSearch() {
        SearchMethod("Введите модель: ");
        
    }

    static void SearchMethod(String mess) {
        System.out.print(mess);
        Scanner sc = new Scanner(System.in);
        String model = sc.nextLine();
        sc.close();
        System.out.println(model);
    }
    
    public static void main(String[] args) {
        Map<Integer, Computers> comp = new HashMap<>();
        comp.put(1, new Computers("Xiaomi", "RedmiBook 15",
                8, 3, 256, "Windows", "Intel UHD Graphics"));
        
        
        //for (Map.Entry<Integer, Computers> entry : comp.entrySet()) {
        //    System.out.println(entry.getValue().toString());   
        //}
        ComputerSearch();
    }
}

class Computers {
    private String computerModel;
    private String computerSeries;
    private Integer computerRam;
    private Integer computerCpu;
    private Integer computerSsd;
    private String computerOs;
    private String computerVideo;

    public Computers(String model, String series, Integer ram, Integer cpu, Integer ssd, String os, String videocard){
        this.computerModel = model;
        this.computerSeries = series;
        this.computerRam = ram;
        this.computerCpu = cpu;
        this.computerSsd = ssd;
        this.computerOs = os;
        this.computerVideo = videocard;
    }

    @Override
    public String toString() {
        return String.format("model: %s, series: %s, RAM: %d, CPU rate: %d, SSD: %d, system: %s, graphics: %s",
                            computerModel, computerSeries, computerRam, computerCpu, computerSsd, computerOs, computerVideo);
    }
}