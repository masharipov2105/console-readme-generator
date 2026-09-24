package com.masharipov2105.systems.generator;

import com.masharipov2105.systems.model.ReadmeModel;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.io.IOException;

public class ReadmeGeneratorImpl implements ReadmeGenerator {

    public ReadmeGeneratorImpl() {}

    @Override
    public boolean generate(ReadmeModel finalModel) {

        boolean finalResult = false;

        String finalData = finalModel.getFinalProjectName() + "\n" +
                           finalModel.getFinalProjectDescription() + "\n" +
                           finalModel.getFinalProjectFullDescription() + "\n" +
                           finalModel.getFinalProjectFeatures() + "\n" +
                           finalModel.getFinalProjectGoal() + "\n" +
                           finalModel.getFinalTechnologies() + "\n" +
                           finalModel.getFinalInstallWindowsCommands() + "\n" +
                           finalModel.getFinalInstallLinuxMacCommands() + "\n" +
                           finalModel.getFinalImagePaths() + "\n" +
                           finalModel.getFinalTreeData() + "\n" +
                           finalModel.getFinalLitsenziya() + "\n" +
                           finalModel.getOwnerData() + "\n";

        // Har doim README.md faylini yaratamiz
        Path filePath = Paths.get(finalModel.getFinalFileUrl()).resolve("README.md");

        try {
            // Agar papka mavjud bo'lmasa — yaratamiz
            Path parentDir = filePath.getParent();
            if (parentDir != null && !Files.exists(parentDir)) {
                Files.createDirectories(parentDir);
                System.out.println("Created folder: " + parentDir);
            }

            // Agar fayl mavjud bo'lsa — ustiga yozamiz (CREATE + APPEND)
            // Agar mavjud bo'lmasa — yangi yaratamiz
            if (Files.exists(filePath)) {
                Files.writeString(filePath, finalData,
                        StandardOpenOption.CREATE,
                        StandardOpenOption.APPEND);
                System.out.println("Appended to existing README.md: " + filePath.toAbsolutePath());
            } else {
                Files.writeString(filePath, finalData,
                        StandardOpenOption.CREATE,
                        StandardOpenOption.WRITE);
                System.out.println("Created new README.md: " + filePath.toAbsolutePath());
            }

            finalResult = true;

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            finalResult = false;
        }

        return finalResult;
    }
}