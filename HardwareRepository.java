package hardware;


import java.util.ArrayList;

class HardwareRepository {

    public static ArrayList<Hardware> getHardwareList() {
            ArrayList<Hardware> list = new ArrayList<>();

                    list.add(new Laptop(1, "Dell XPS 13", 16));
                            list.add(new Phone(2, "Samsung S24", 50));
                                    list.add(new Laptop(3, "MacBook Pro", 32));
                                            list.add(new Phone(4, "iPhone 15", 48));
                                                    list.add(new Laptop(5, "ASUS Zenbook", 16));
                                                            list.add(new Phone(6, "Google Pixel 8", 50));
                                                                    list.add(new Laptop(7, "Lenovo Legion", 32));
                                                                            list.add(new Phone(8, "Huawei P60", 48));
                                                                                    list.add(new Laptop(9, "HP Spectre", 16));
                                                                                            list.add(new Phone(10, "Sony Xperia", 16));

                                                                                                    return list;
                                                                                                        }
                                                                                                        }