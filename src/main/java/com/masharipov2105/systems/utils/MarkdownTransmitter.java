package com.masharipov2105.systems.util;

import java.util.ArrayList;

public final class MarkdownTransmitter{

	private MarkdownTransmitter(){

		throw new UnsupportedOperationException("Utility class cannot be instantiated!");
	}

	public static String projectNameFormat(String projectName){

        return String.format("# %s \n\n", projectName);
    }

    public static String projectDescriptionFormat(String projectName, String projectDescription){

        return String.format("** %s ** - %s\n\n---\n\n", projectName, projectDescription);
    }

    public static String projectFullDescriptionFormat(String descriptionText, String[] sentences){

        String finalResult = "";

        finalResult += String.format("## About the project\n\n    %s\n\n", descriptionText);

        for (String i : sentences){

            finalResult += String.format("- %s\n", i);
        }
        finalResult += String.format("\n---\n\n");

        return finalResult;
    }

    public static String projectFeaturesFormat(ArrayList<String> projectFeatures){

        String finalResult = "";

        finalResult += "## Features\n\n";
        finalResult += "| Function | Description |\n";
        finalResult += "|----------|-------------|\n";

        for (String i : projectFeatures){

            String[] helper = i.split("%%");
            finalResult += String.format("| %s | %s |\n", helper[0], helper[1]);
        }

        finalResult += "\n---\n\n";

        return finalResult;
    }

    public static String projectGoal(String objectiveText, String[] objectives){

        String finalResult = "";

        finalResult += String.format("## Project objective\n\n    %s\n\n", objectiveText);

        for (String i : objectives){

            finalResult += String.format("- %s\n", i);
        }

        finalResult += "\n---\n\n";

        return finalResult;
    }

    public static String technologiesFormat(String[] technologies){

        String finalResult = "";

        finalResult += "## Technologies\n\n";
        finalResult += "| Technology | Version | Objective |\n";
        finalResult += "|------------|---------|-----------|\n";

        for (String i : technologies){

            String[] helper = i.split("%%");

            finalResult += String.format("| %s | %s | %s |\n", helper[0], helper[1], helper[2]);
        }

        finalResult += "\n---\n\n";

        return finalResult;
    }

    public static String installWindowsCommandsFormat(String[] commands){

        String finalResult = "";

        finalResult += "## Installation and Execution\n\n### Windows\n```cmd\n";

        for (String i : commands){

            finalResult += String.format(" %s\n\n", i);
        }

        finalResult += "```\n---\n\n";

        return finalResult;
    }

    public static String installLinuxMacCommandsFormat(String[] commands){

        String finalResult = "";

        finalResult += "## Installation and Execution\n\n### Windows\n```cmd\n";

        for (String i : commands){

            finalResult += String.format(" %s\n\n", i);
        }

        finalResult += "```\n---\n\n";

        return finalResult;
    }

    public static String imagePathsFormat(ArrayList<String> imgs){

        String finalResult = "";

        finalResult += "## Project view\n\n";

        for (String i : imgs){

            finalResult += String.format("![Home](%s)\n", i);
        }

        finalResult += "\n---\n\n";

        return finalResult;
    }

    public static String treeDataFormat(String data){

        String finalResult = "";

        finalResult += String.format("## Project Structure\n\n```cmd\n%s\n```\n---\n\n", data);
        return finalResult;
    }

    public static String litsenziyaFormat(String litsenziya){

        String finalResult = "";

        finalResult += String.format("## License\n\n%s\n\n---\n\n", litsenziya);

        return finalResult;
    }

    public static String ownerFormat(String[] connections){

        String finalResult = "";

        finalResult += "## Author\n\n";

        for (String i : connections){

            finalResult += String.format("    %s\n\n", i);
        }

        return finalResult;
    }
}