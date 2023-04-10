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
        compTwo.setComputerOs(null);
        compTwo.setComputerVideo("Radeon RX Vega 7");

        Laptop compThree = new Laptop();
        compThree.setComputerModel("ASUS");
        compThree.setComputerSeries("VivoBook S14");
        compThree.setComputerRam(8);
        compThree.setComputerSsd(512);
        compThree.setComputerOs("Windows");
        compThree.setComputerVideo("GeForce MX350");

        Laptop compFour = new Laptop();
        compFour.setComputerModel("Lenovo");
        compFour.setComputerSeries("IdeaPad 5");
        compFour.setComputerRam(8);
        compFour.setComputerSsd(256);
        compFour.setComputerOs("Windows");
        compFour.setComputerVideo("Intel Iris Xe Graphics");

        Laptop compFive = new Laptop();
        compFive.setComputerModel("HUAWEI");
        compFive.setComputerSeries("MateBook D15");
        compFive.setComputerRam(8);
        compFive.setComputerSsd(512);
        compFive.setComputerOs("Windows");
        compFive.setComputerVideo("Intel Iris Xe Graphics");


        Map<Integer, Laptop> comp = new HashMap<Integer, Laptop>();
        comp.put(1, compOne);
        comp.put(2, compTwo);
        comp.put(3, compThree);
        comp.put(4, compFour);
        comp.put(5, compFive);

        
        Map<Integer, Laptop> compSearch = new HashMap<Integer, Laptop>();
        
        Scanner sc = new Scanner(System.in);
        menu(compSearch, sc);
        sc.close();

        System.out.println();
        System.out.println("Результаты поиска:");
        if (comp.containsValue(compSearch.get(0))){
            for (Map.Entry<Integer, Laptop> entry : comp.entrySet()){
                if (compSearch.get(0).equals(entry.getValue())){
                    System.out.println(entry.getValue());
                }
            }
        } else {
            System.out.println("Модели с запрашиваемыми параметрами не найдены!");
        }
    }

    // метод для реализации меню
    static void menu(Map<Integer, Laptop> map, Scanner sc) {
        Laptop lapSearch = new Laptop();

        System.out.println("Введите необходимые критерии поиска:");
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
    }
}







class Laptop {
    private String computerModel;
    private String computerSeries;
    private Integer computerRam;
    private Integer computerSsd;
    private String computerOs;
    private String computerVideo;


    

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
        return Objects.hash(computerModel.toLowerCase(), computerRam, computerSsd, computerVideo.toLowerCase());
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
        return Objects.equals(computerModel.toLowerCase(), computer.computerModel.toLowerCase()) || 
                computerRam <= computer.computerRam || computerSsd <= computer.computerSsd || Objects.equals(computerVideo.toLowerCase(), computer.computerVideo.toLowerCase());
    }
}