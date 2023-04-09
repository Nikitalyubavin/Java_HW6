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
    // метод для поиска значений при использовании Map
    // static void ComputerSearch(Map<Integer, Computers> map) {
    //     String modelName = "Xiaomi";
    //     for (Iterator<Map.Entry<Integer, Computers>> itr: map.entrySet().iterator()) {
    //         while (itr.hasNext()){
    //             if (itr.next().toString().toLowerCase().contains(modelName.toString().toLowerCase())) {
    //                 System.out.println(itr.next().toString());
    //             } 
    //         }
    //     }
    // }
    // метод для поиска значений при использовании ArrayList
    // static void ComputerSearch(ArrayList<Computers> arr, Map<String, String> strMap, Map<String, Integer> intMap) {
    //     for (Map.Entry<String, String> entry : strMap.entrySet()) {
    //         if (Computers.computerModel.toLowerCase().contains(entry.getValue().toString().toLowerCase())) {
    //             System.out.println(entry.getValue().toString());
    //         } 
    //     }
    // }

    // метод для обработки выбора в меню
    // static int Choice(Map<K, V> map, String mess, Scanner sc){
    //     System.out.print(mess);
    //     String obj = sc.nextLine();
    //     map.put("Model", obj);
    //}
    public static void main(String[] args) {

        Laptop compOne = new Laptop();
        compOne.setComputerModel("Xiaomi");
        compOne.setComputerSeries("RedmiBook 15");
        compOne.setComputerRam(8);
        compOne.setComputerSsd(256);
        compOne.setComputerOs("Windows");
        compOne.setComputerVideo("Intel UHD Graphics");

        Laptop compTwo = new Laptop();
        compTwo.setComputerModel("ASUS");
        compTwo.setComputerSeries("M1702QA-AU081");
        compTwo.setComputerRam(16);
        compTwo.setComputerSsd(512);
        compTwo.setComputerOs("Не установлена");
        compTwo.setComputerVideo("Radeon RX Vega 7");

        Laptop compThree = new Laptop();
        compThree.setComputerModel("ASUS");
        compThree.setComputerSeries("VivoBook S14");
        compThree.setComputerRam(8);
        compThree.setComputerSsd(512);
        compThree.setComputerOs("Windows 10");
        compThree.setComputerVideo("GeForce MX350");

        Laptop compFour = new Laptop();
        compFour.setComputerModel("Lenovo");
        compFour.setComputerSeries("IdeaPad 5");
        compFour.setComputerRam(8);
        compFour.setComputerSsd(256);
        compFour.setComputerOs("Windows 11");
        compFour.setComputerVideo("Intel Iris Xe Graphics");

        Laptop compFive = new Laptop();
        compFive.setComputerModel("HUAWEI");
        compFive.setComputerSeries("MateBook D15");
        compFive.setComputerRam(8);
        compFive.setComputerSsd(512);
        compFive.setComputerOs("Windows 11");
        compFive.setComputerVideo("Intel Iris Xe Graphics");






        
        
        Map<Integer, Laptop> comp = new HashMap<Integer, Laptop>();
        comp.put(1, compOne);
        comp.put(2, compTwo);
        comp.put(3, compThree);
        comp.put(4, compFour);
        comp.put(5, compFive);

        
        // Map<String, String> stringFilter = new HashMap<String, String>();
        // Map<String, Integer> intFilter = new HashMap<String, Integer>();
        Map<Integer, Laptop> compSearch = new HashMap<Integer, Laptop>();
        
        Scanner sc = new Scanner(System.in);
        menu(compSearch, sc);
        sc.close();

        System.out.println(compSearch.get(0).equals(compOne));
        // System.out.println(comp.get(0).toString());
        // if (comp.toString().toLowerCase().contains(stringFilter.get("Model").toLowerCase())) {
        //     int index = comp.indexOf(new Computers("Xiaomi", "RedmiBook 15",
        //     8, 256, "Windows", "Intel UHD Graphics"));
        //     System.out.println(comp.get(index));
        // } else {
        //     System.out.println("NO");
        // }
        // ComputerSearch(comp);
        // System.out.println(stringFilter);
        // System.out.println(intFilter);
    }

    // метод для реализации меню
    static void menu(Map<Integer, Laptop> map, Scanner sc) {
        Laptop lapSearch = new Laptop();
        System.out.print("Название модели: ");
        lapSearch.setComputerModel(sc.nextLine());
        System.out.print("Название серии: ");
        lapSearch.setComputerSeries(sc.nextLine());
        System.out.print("Название видеокарты: ");
        lapSearch.setComputerVideo(sc.nextLine());
        System.out.print("Название ОС: ");
        lapSearch.setComputerOs(sc.nextLine());
        System.out.print("Объем ОЗУ: ");
        lapSearch.setComputerRam(sc.nextInt());
        System.out.print("Объем ЖД: ");
        lapSearch.setComputerSsd(sc.nextInt());
        
        map.put(0, lapSearch);
        // System.out.println("Введите цифру, соответствующую параметру поиска, который хотите задать:");
        // System.out.println("1 - Модель ноутбука");
        // System.out.println("2 - Серия ноутбука");
        // System.out.println("3 - ОЗУ");
        // System.out.println("4 - Частота процессора");
        // System.out.println("5 - Объем ЖД");
        // System.out.println("6 - ОС");
        // System.out.println("7 - Видеокарта");
        // System.out.println("0 - Выход из поиска");
    }
}

class Laptop {
    private String computerModel;
    private String computerSeries;
    private Integer computerRam;
    private Integer computerSsd;
    private String computerOs;
    private String computerVideo;


    // String model, String series, Integer ram, Integer ssd, String os, String videocard
    // public Computers(String model, String series, Integer ram, Integer ssd, String os, String videocard){
    //     this.computerModel = model;
    //     this.computerSeries = series;
    //     this.computerRam = ram;
    //     this.computerSsd = ssd;
    //     this.computerOs = os;
    //     this.computerVideo = videocard;
    // }

    

    public String getComputerModel() {
        return computerModel;
    }



    public void setComputerModel(String computerModel) {
        this.computerModel = computerModel;
    }



    public String getComputerSeries() {
        return computerSeries;
    }



    public void setComputerSeries(String computerSeries) {
        this.computerSeries = computerSeries;
    }



    public Integer getComputerRam() {
        return computerRam;
    }



    public void setComputerRam(Integer computerRam) {
        this.computerRam = computerRam;
    }



    public Integer getComputerSsd() {
        return computerSsd;
    }



    public void setComputerSsd(Integer computerSsd) {
        this.computerSsd = computerSsd;
    }



    public String getComputerOs() {
        return computerOs;
    }



    public void setComputerOs(String computerOs) {
        this.computerOs = computerOs;
    }



    public String getComputerVideo() {
        return computerVideo;
    }



    public void setComputerVideo(String computerVideo) {
        this.computerVideo = computerVideo;
    }



    @Override
    public String toString() {
        return String.format("model: %s, series: %s, RAM: %d, SSD: %d, system: %s, graphics: %s\n",
                            computerModel, computerSeries, computerRam, computerSsd, computerOs, computerVideo);
    }

    @Override
    public int hashCode() {
        // final int prime = 31;
        // int result = 1;
        // result = prime * result + ((computerModel == null) ? 0 : computerModel.hashCode());
        // result = prime * result + ((computerSeries == null) ? 0 : computerSeries.hashCode());
        // result = prime * result + ((computerRam == null) ? 0 : computerRam.hashCode());
        // result = prime * result + ((computerSsd == null) ? 0 : computerSsd.hashCode());
        // result = prime * result + ((computerOs == null) ? 0 : computerOs.hashCode());
        // result = prime * result + ((computerVideo == null) ? 0 : computerVideo.hashCode());
        return Objects.hash(computerModel, computerSeries, computerRam, computerSsd, computerOs, computerVideo);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop computer = (Laptop) obj;
        return Objects.equals(computerModel, computer.computerModel) && Objects.equals(computerOs, computer.computerOs) && 
                            Objects.equals(computerRam, computer.computerRam) && Objects.equals(computerSeries, computer.computerSeries) &&
                            Objects.equals(computerSsd, computer.computerSsd) && Objects.equals(computerVideo, computer.computerVideo);
    }
}