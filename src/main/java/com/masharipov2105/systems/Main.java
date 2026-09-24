package com.masharipov2105.systems;

import com.masharipov2105.systems.service.*;
import com.masharipov2105.systems.controller.ReadmeController;

public class Main {

    public static void main(String[] args) {
        
        ReadmeService service = new ReadmeServiceImpl();
        ReadmeController controller = new ReadmeController(service);

        controller.start();
    }
}
