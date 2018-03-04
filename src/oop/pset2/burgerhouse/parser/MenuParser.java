package oop.pset2.burgerhouse.parser;

import oop.pset2.burgerhouse.model.Menu;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MenuParser {
    public List<Menu> getMenus () {
        String filePath = "src/oop/pset2/burgerhouse/data/menu-small.csv";


        try {
            Stream<String> lines = Files.lines(Paths.get(filePath));
            return lines.skip(1)
                    .map(line -> line.split(";"))
                    .map(toMenu())
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }


    }

    private Function<String[], Menu> toMenu() {
        return columns -> {
            Menu menu = new Menu();
            menu.setDish(columns[0]);
            menu.setType(columns[1]);
            menu.setPrice(Double.parseDouble(columns[2]));
            return menu;
        };

    }
}
